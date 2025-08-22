import javax.swing.JOptionPane;


public class Roombookingcontrol {
    public boolean checkavailablility(Room room){
        if(room.availability){
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
    
     public boolean checkStudentID(int id){
        for(int i = 0 ; i<(Student.students.size()-1);i++){
            if(Student.students.get(i).getID() == id){
                return true;
            }
        }
        return false;
     }
     
     public void bookRoom(Student student, Room bookedRoom, String startDate, String endDate, int capacity, Roombooking roomBooking) {
    boolean isValidStudent = checkStudentID(student.getID());
    boolean areDatesValid = checkdate(startDate, endDate);
    boolean isRoomAvailable = checkavailablility(bookedRoom);

    if (isValidStudent && areDatesValid && isRoomAvailable) {
        new Roombooking(student, bookedRoom, startDate, endDate, capacity);
        student.setRoombooked(bookedRoom);
        JOptionPane.showMessageDialog(null,"the booking has made successfully.");
    } 
    else {
        // Handle the case when booking cannot be made
        JOptionPane.showMessageDialog(null,"Booking failed. Please check Data");
    }
     }
    
    public void updatebooking(Student student, Room bookedRoom, String startDate, String endDate, int capacity){
    boolean isValidStudent = checkStudentID(student.getID());
    boolean areDatesValid = checkdate(startDate, endDate);
    boolean isRoomAvailable = checkavailablility(bookedRoom);

    if (isValidStudent && areDatesValid && isRoomAvailable) {
        new Roombooking(student, bookedRoom, startDate, endDate, capacity);
        JOptionPane.showMessageDialog(null,"Booking Updated.");
    }
    else {
        // Handle the case when booking cannot be made
        JOptionPane.showMessageDialog(null,"Booking failed. Please check Data");
    }
     }
}


