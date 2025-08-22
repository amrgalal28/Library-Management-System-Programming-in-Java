
import java.util.ArrayList;

public class Roombooking {
    protected Student owner;
    protected Room bookedroom;
    protected String startdate;
    protected String enddate;
    protected int capacity;
    static ArrayList<Roombooking>Roomlist = new ArrayList<>();

    Roombooking(Student student , Room bookedroom , String sdate,String edate , int c){
        this.owner = student;
        this.bookedroom = bookedroom;
        this.startdate = sdate;
        this.enddate = edate;
        this.capacity = c;
        Roomlist.add(this);
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    public Room getBookedroom() {
        return bookedroom;
    }

    public void setBookedroom(Room bookedroom) {
        this.bookedroom = bookedroom;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
