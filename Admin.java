
import java.util.ArrayList;

public class Admin extends Librarian{
    ArrayList<Admin>admins = new ArrayList<>();
    protected int totalreservedbooks;
    protected String position;
    protected String technology_skill;

    protected int yearsofservice;

    Admin(String fullname, String address, String email, int id, double salary, String certificaiton, String cataloging_skills) {
        super(fullname, address, email, id, salary, certificaiton, cataloging_skills);
        admins.add(this);
    }

    public Admin(String fullname, String address, String email, int id, double salary, String certificaiton, String cataloging_skills, int totalreservedbooks, String position, String technology_skill, int yearsofservice) {
        super(fullname, address, email, id, salary, certificaiton, cataloging_skills);
        this.totalreservedbooks = totalreservedbooks;
        this.position = position;
        this.technology_skill = technology_skill;
        this.yearsofservice = yearsofservice;
        admins.add(this);
    }

    public int getTotalreservedbooks() {
        return totalreservedbooks;
    }

    public void setTotalreservedbooks(int totalreservedbooks) {
        this.totalreservedbooks = totalreservedbooks;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTechnology_skill() {
        return technology_skill;
    }

    public void setTechnology_skill(String technology_skill) {
        this.technology_skill = technology_skill;
    }

    public int getYearsofservice() {
        return yearsofservice;
    }

    public void setYearsofservice(int yearsofservice) {
        this.yearsofservice = yearsofservice;
    }
}
