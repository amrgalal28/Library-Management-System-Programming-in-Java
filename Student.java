
import java.util.ArrayList;

public class Student extends User{
    protected String faculty;
    protected Room Roombooked;
    protected int reservedbooks;
    static ArrayList<Student>students = new ArrayList<>();

    Student(String faculty){
        super();
        this.faculty =faculty;
        Roombooked = null;
        reservedbooks = 0;
        students.add(this);
    }

    Student(){
        super();
        faculty ="";
        Roombooked = null;
        reservedbooks = 0;
    }
    Student(String fullname ,String address ,String email,int id ,String faculty){
        super(fullname, address,email,id);
        this.faculty=faculty;
        Roombooked = null;
        reservedbooks = 0;
        students.add(this);
    }


    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Room getRoombooked() {
        return Roombooked;
    }

    public void setRoombooked(Room roombooked) {
        Roombooked = roombooked;
    }

    public int getReservedbooks() {
        return reservedbooks;
    }

    public void setReservedbooks(int reservedbooks) {
        this.reservedbooks = reservedbooks;
    }


}
