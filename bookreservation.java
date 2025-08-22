import java.util.ArrayList;

public class bookreservation {
    protected Student owner;
    protected Book book;
    protected String startdate;
    protected String enddate;
    protected String feedback;
    static ArrayList<bookreservation> Booklist = new ArrayList<>();

    public bookreservation(Student owner, Book book, String startdate, String enddate) {
        this.owner = owner;
        this.book = book;
        this.startdate = startdate;
        this.enddate = enddate;
        Booklist.add(this);
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
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

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
