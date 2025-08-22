import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BookReservationcontroller {
    
    String connectionURL= "jdbc:derby:C:\\Users\\amr21\\AppData\\Roaming\\NetBeans\\12.6\\derby\\Library;";
    String username = "G15";
    String password = "G15";
    public boolean checkavailablility(Book book){
        if(book.availability){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean checkdate(String sdate , String edate){
        int startdate = Integer.parseInt(sdate);
        int enddate = Integer.parseInt(edate);
        if(startdate < enddate){
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean checkID(int id){
        for(int i = 0 ; i<(Student.students.size()-1);i++){
            if(Student.students.get(i).getID() == id){
                return true;
            }
        }
        return false;
    }
    public void returnbook(Book book){
        for(bookreservation booking :bookreservation.Booklist){
            if(booking.getBook() == book){
                booking.setFeedback(givefeedback(booking));
                break;
            }
        }
        book.setQuantity(book.getQuantity()+1);
        if(!book.availability){
            book.availability = true;
        }
        
    }
    
    public void reservebook(Book book ,Student student , String sdate ,String edate){
        boolean id = checkID(student.getID());
        boolean date = checkdate(sdate,edate);
        boolean availability = book.availability;
        if(id==true && date == true && availability){
            new bookreservation(student,book,sdate,edate);
            student.setReservedbooks(student.getReservedbooks()+1);
            JOptionPane.showMessageDialog(null,"your request has been accepted.");
        }
        else{
            JOptionPane.showMessageDialog(null,"your request has been rejected, check your data again.");
        }
    }
    public void searchmaterial(){
        try{
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                Connection conn = DriverManager.getConnection(connectionURL,username,password);
                String id = JOptionPane.showInputDialog("enter Book id");
                String sql = "SELECT * FROM BOOK WHERE BOOK_ID = "+id;
                Statement st = conn.createStatement();
                ResultSet rs=null;
                rs=st.executeQuery(sql);
                while(rs.next()){
                JOptionPane.showMessageDialog(null,rs.getInt("BOOK_ID")+"\t"+rs.getString("NAME"));
                }
                rs.close();
                st.close();
                conn.close();
        }catch (Exception ex) {
        System.out.println("Connect failed ! ");
        }
        
    }
    
    public String givefeedback(bookreservation b){
        String ans = JOptionPane.showInputDialog("enter feedback");
        b.setFeedback(ans);
        return ans;
    }
}
