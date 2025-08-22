/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public abstract class User {
    private String fullname;
    private String address;
    private String email;
    private int ID;

    public User() {
        this.fullname = "";
        this.address = "";
        this.email = "";
        this.ID = 0;
    }

    public User(String fullname, String address, String email, int ID) {
        this.fullname = fullname;
        this.address = address;
        this.email = email;
        this.ID = ID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    

    
}
