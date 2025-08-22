
import java.util.ArrayList;
public class Librarian extends User{
 protected double salary;
 protected String certification;
 protected String cataloging_skills;

 static ArrayList<Librarian>librarians = new ArrayList<>();

 Librarian(String fullname, String address , String email,int id , double salary , String certificaiton , String cataloging_skills){
     super(fullname,address,email,id);
     this.salary=salary;
     this.cataloging_skills=cataloging_skills;
     this.certification = certificaiton;
     librarians.add(this);
 }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getCataloging_skills() {
        return cataloging_skills;
    }

    public void setCataloging_skills(String cataloging_skills) {
        this.cataloging_skills = cataloging_skills;
    }
}
