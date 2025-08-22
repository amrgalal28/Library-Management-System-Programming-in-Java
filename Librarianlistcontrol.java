import javax.swing.JOptionPane;


public class Librarianlistcontrol {
    
    public String viewfeedback(int bookid , int studentid){
        for(bookreservation booking: bookreservation.Booklist){
            if(booking.getBook().getID() == bookid && booking.getOwner().getID() == studentid){
                return booking.getFeedback();
            }
        }
        return"reservation not found";
    }
    
    public void viewanalytics(){
        int totalbookreservation = (bookreservation.Booklist.size()-1);
        int totalroomreservation = (Roombooking.Roomlist.size()-1);
        int totalstudentsborrowed = 0;
        for(Student student : Student.students){
            totalstudentsborrowed += student.getReservedbooks();
        }
        JOptionPane.showMessageDialog(null,"total book reservation:"+totalbookreservation+"\ntotal room reservation:"+totalroomreservation+"\ntotal students borrowed:"+totalstudentsborrowed);
    }
    
    public void manageactivity(){
        
    }
    
    
}
