/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Account {
    
    protected String username;
    protected String password;
    protected User user; // Assuming User class exists
    static ArrayList<Account> accounts = new ArrayList<>();

    public Account(String username, String password, User user) {
        this.username = username;
        this.password = password;
        this.user = user;
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static ArrayList<Account> getAccounts() {
        return accounts;
    }

    public static void setAccounts(ArrayList<Account> accounts) {
        Account.accounts = accounts;
    }
    
    
    
    public static boolean checkUsername(String username) {
        for (Account account : accounts) {
            if (account.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
    

    public static boolean checkPassword(String Password) {
        for (Account account : accounts) {
            if (account.getPassword().equals(Password)) {
                return true;
            }
        }
        return false;
    }
    public static int searchstudent(String username){
        for(int i = 0;i<=accounts.size()-1;i++){
            if(accounts.get(i).getUsername().equals(username)){
                return i;
            }
        }
        return 0;
    }
}
