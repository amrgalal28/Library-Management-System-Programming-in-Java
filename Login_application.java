
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
  @author Hossam
 */
public class Login_application extends javax.swing.JFrame {
    public Login_application() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtuser = new javax.swing.JTextField();
        blogin = new javax.swing.JButton();
        bexit = new javax.swing.JButton();
        jpassword = new javax.swing.JPasswordField();
        jcshow_password = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbsignup = new javax.swing.JButton();
        rstudent = new javax.swing.JRadioButton();
        radmin = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jbsignup1 = new javax.swing.JButton();
        rlibrarian = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Password");

        jtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtuserActionPerformed(evt);
            }
        });

        blogin.setBackground(new java.awt.Color(0, 51, 51));
        blogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        blogin.setForeground(new java.awt.Color(255, 255, 255));
        blogin.setText("Login");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });

        bexit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bexit.setForeground(new java.awt.Color(0, 51, 51));
        bexit.setText("Exit");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });

        jcshow_password.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jcshow_password.setForeground(new java.awt.Color(0, 51, 51));
        jcshow_password.setText("Show Password");
        jcshow_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcshow_passwordActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Amr 236044 - Amr 235355 - Carlos 237183 - Eyad 235421 - Hossam 235438 ");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setText("Copyright @ group 2 ALL RIGHTS RESERVED");

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Library Managment Systems");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6))
        );

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("I dont have account ->");

        jbsignup.setBackground(new java.awt.Color(176, 206, 206));
        jbsignup.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbsignup.setForeground(new java.awt.Color(0, 51, 51));
        jbsignup.setText("Signup");
        jbsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsignupActionPerformed(evt);
            }
        });

        buttonGroup1.add(rstudent);
        rstudent.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rstudent.setForeground(new java.awt.Color(0, 51, 51));
        rstudent.setText("Student");

        buttonGroup1.add(radmin);
        radmin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        radmin.setForeground(new java.awt.Color(0, 51, 51));
        radmin.setText("Admin");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));

        jbsignup1.setBackground(new java.awt.Color(176, 206, 206));
        jbsignup1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jbsignup1.setForeground(new java.awt.Color(0, 51, 51));
        jbsignup1.setText("Manage account");
        jbsignup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsignup1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rlibrarian);
        rlibrarian.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        rlibrarian.setForeground(new java.awt.Color(0, 51, 51));
        rlibrarian.setText("Librarian");
        rlibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rlibrarianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jpassword)
                                .addComponent(jtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbsignup1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(radmin, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rlibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jbsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jcshow_password)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(75, 75, 75)
                                            .addComponent(blogin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(14, 14, 14))
                                .addComponent(bexit))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bexit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcshow_password))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(rstudent)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rlibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbsignup1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(blogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jbsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtuserActionPerformed

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
        // TODO add your handling code here:
        if(jtuser.getText().equals("")){
            JOptionPane.showMessageDialog(null, "please fill out username");
        
        }
        else if(jpassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "please fill out password");
        }
        else if(!rstudent.isSelected()&& !radmin.isSelected()&&!rlibrarian.isSelected()){
            JOptionPane.showMessageDialog(null, "please select either student ,admin or librarian");

        }
        else if(rstudent.isSelected()){

            String name = jtuser.getText();
            String pass = jpassword.getText();
            
            try{
               FileReader fr = new FileReader("textlogin.text");
               Scanner reader =new Scanner(fr);
               reader.useDelimiter("[,\n]");
               
               while(reader.hasNext()){
                   String un=reader.next();
                   String pw=reader.next();
                   if(name.equals(un.trim())&& pass.equals(pw.trim())){
                       reader.close();
                       int studentno =Account.searchstudent(name);
                       Student_options su=new Student_options(studentno);
                       su.setVisible(true);
                       this.dispose();
                       
                       
                   }
               }
               JOptionPane.showMessageDialog(null,"Invalid Username or Password, Please try again!"); 
                
                /*FileWriter myWriter = new FileWriter ("textlogin.text",true);
                myWriter .write(""+name+","+pass);
                myWriter .write(System.getProperty("line.separator"));
                myWriter .close();
                JOptionPane.showMessageDialog(null,"success");*/
            
                
            }
            catch (Exception e){
                System.out.println("An error occurred.");
            }
        }
        else if(rlibrarian.isSelected()){

            String name = jtuser.getText();
            String pass = jpassword.getText();
            
            try{
               FileReader fr = new FileReader("textlogin.text");
               Scanner reader =new Scanner(fr);
               reader.useDelimiter("[,\n]");
               
               while(reader.hasNext()){
                   String un=reader.next();
                   String pw=reader.next();
                   if(name.equals(un.trim())&& pass.equals(pw.trim())){
                       reader.close();
                       int librarno =Account.searchstudent(name);
                       Librarian_functions lb = new Librarian_functions();
                       lb.setVisible(true);
                       this.dispose();
                       
                       
                   }
               }
               JOptionPane.showMessageDialog(null,"Invalid Username or Password, Please try again!"); 
                
                /*FileWriter myWriter = new FileWriter ("textlogin.text",true);
                myWriter .write(""+name+","+pass);
                myWriter .write(System.getProperty("line.separator"));
                myWriter .close();
                JOptionPane.showMessageDialog(null,"success");*/
            
                
            }
            catch (Exception e){
                System.out.println("An error occurred.");
            }
        }
        else {
            String name = jtuser.getText();
            String pass = jpassword.getText();
            
            try{
               FileReader fr = new FileReader("textlogin.text");
               Scanner reader =new Scanner(fr);
               reader.useDelimiter("[,\n]");
               
               while(reader.hasNext()){
                   String un=reader.next();
                   String pw=reader.next();
                   if(name.equals(un.trim())&& pass.equals(pw.trim())){
                       reader.close();
                       
                       int adminno =Account.searchstudent(name);
                       
                       option_admin su=new option_admin(adminno);
                       su.setVisible(true);
                       this.dispose();
                       
                       
                   }
               }
               JOptionPane.showMessageDialog(null,"Invalid Username or Password, Please try again!"); 
                
                /*FileWriter myWriter = new FileWriter ("textlogin.text",true);
                myWriter .write(""+name+","+pass);
                myWriter .write(System.getProperty("line.separator"));
                myWriter .close();
                JOptionPane.showMessageDialog(null,"success");*/
            
                
            }
            catch (Exception e){
                System.out.println("An error occurred.");
            }


//JOptionPane.showMessageDialog(null, "Wrong Username or password","message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bloginActionPerformed

    private void jcshow_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcshow_passwordActionPerformed
        // TODO add your handling code here:
        if(jcshow_password.isSelected()){
            jpassword.setEchoChar((char)0);
        }
        else{
            jpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jcshow_passwordActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bexitActionPerformed

    private void jbsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsignupActionPerformed
        // TODO add your handling code here:
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
        
    }//GEN-LAST:event_jbsignupActionPerformed

    private void jbsignup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsignup1ActionPerformed
        // TODO add your handling code here:
        String value1 = JOptionPane.showInputDialog(this,"Enter Username ");
        String value2 = JOptionPane.showInputDialog(this,"Enter Password ");
        
            String name = value1;
            String pass = value2;
            
            try{
               FileReader fr = new FileReader("textlogin.text");
               Scanner reader =new Scanner(fr);
               reader.useDelimiter("[,\n]");
               
               while(reader.hasNext()){
                   String un=reader.next();
                   String pw=reader.next();
                   if(name.equals(un.trim())&& pass.equals(pw.trim())){   
                       reader.close();
                    
                   
                       Manage su=new Manage();
                       su.setVisible(true);
                       this.dispose();
                       
                       
                   }
               }
               JOptionPane.showMessageDialog(null,"Invalid Username or Password, Please try again!"); 
                
                /*FileWriter myWriter = new FileWriter ("textlogin.text",true);
                myWriter .write(""+name+","+pass);
                myWriter .write(System.getProperty("line.separator"));
                myWriter .close();
                JOptionPane.showMessageDialog(null,"success");*/
            
                
            }
            catch (Exception e){
                System.out.println("An error occurred.");
            }
               
        
        
        
        
        
        
        
    }//GEN-LAST:event_jbsignup1ActionPerformed

    private void rlibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rlibrarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rlibrarianActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bexit;
    private javax.swing.JButton blogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbsignup;
    private javax.swing.JButton jbsignup1;
    private javax.swing.JCheckBox jcshow_password;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtuser;
    private javax.swing.JRadioButton radmin;
    private javax.swing.JRadioButton rlibrarian;
    private javax.swing.JRadioButton rstudent;
    // End of variables declaration//GEN-END:variables
}
