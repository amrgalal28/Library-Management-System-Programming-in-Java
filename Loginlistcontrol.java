import javax.swing.JOptionPane;


public class Loginlistcontrol {
    
    public boolean verifylogin(String username , String pass){
    
        boolean check = Account.checkUsername(username);
        boolean check2 = Account.checkPassword(pass);
        if (check && check2){return true;}
        else{return false;}
    }
    
    public void signup(String username , String pass, User user){
    boolean check = Account.checkUsername(username);
    if (check){JOptionPane.showMessageDialog(null,"User name already exists");}
        
    else{
    new Account(username,pass,user);
    JOptionPane.showMessageDialog(null,"Account Created Successfully");
    }
        
    }
}
    
    
    
    
    
