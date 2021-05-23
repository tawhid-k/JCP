package Frames;
import Database.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LOGHOME extends javax.swing.JFrame {

    public LOGHOME() {
        initComponents();
    }
    public void setIDPASS (String id, String pass) {
        uname.setText (id);
        upass.setText (pass);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        upass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        login = new javax.swing.JButton();
        uname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 212));
        jLabel3.setText("Job and Course Proposer");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 450, 70));

        jLabel5.setBackground(new java.awt.Color(209, 209, 110));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("________________________________________________________________________________________________________");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 680, -1));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 240, -1));

        jLabel10.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Password :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 100, -1));

        upass.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(upass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 310, 40));

        jLabel9.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("If you do not have an account, please enter here to register your id");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 430, -1));

        register.setBackground(new java.awt.Color(18, 67, 67));
        register.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 90, -1));

        login.setBackground(new java.awt.Color(4, 63, 63));
        login.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 120, -1));

        uname.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 310, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1385482.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        new registrationFrame(this).setVisible (true);
        this.setVisible (false);
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
         
        DBconnector db = new DBconnector ();
        String query = "select *  from user where u_username = '"+uname.getText()+"'";
        System.out.println(query);
        try {
            db.eQuery(query);
            if (db.rs.next()==false) JOptionPane.showMessageDialog (this, "No such user is found", "Try again", 2);
            
            else {
            //db.rs.next();
            if (upass.getText().equals(db.rs.getString("password"))) {
                if (uname.getText().equals("admin")) {
                     new admin().setVisible(true);
                     this.setVisible(false);
                }
                else {
                    new profile(this, uname.getText()).setVisible(true);
                    this.setVisible(false);
                }
            }
            else JOptionPane.showMessageDialog (this, "Incorrect password", "Try again", 1);
            db.closeConnection();
             }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LOGHOME.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LOGHOME.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(LOGHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGHOME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton login;
    private javax.swing.JButton register;
    private javax.swing.JTextField uname;
    private javax.swing.JPasswordField upass;
    // End of variables declaration//GEN-END:variables
}
