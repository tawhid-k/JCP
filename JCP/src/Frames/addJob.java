package Frames;
import Database.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class addJob extends javax.swing.JFrame {

    public addJob() {
        initComponents();
        try {
            DBconnector db = new DBconnector ();
            String query = "select count(c_id) from company";
            db.eQuery(query);
            db.rs.next();
            String id = db.rs.getString("count(c_id)");
            id = String.valueOf(Integer.parseInt(id)+1);
            l5.setText(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addCourse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        l1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        l2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        l3 = new javax.swing.JTextField();
        button3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        l4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        l5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        l6 = new javax.swing.JTextField();
        l7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("COMPANY NAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 184, 22));

        l1.setBorder(null);
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 313, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AVAILABLE POST");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 144, 21));

        l2.setBorder(null);
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 313, 34));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SALARY");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 144, 21));

        l3.setBorder(null);
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 313, 34));

        button3.setBackground(new java.awt.Color(0, 102, 102));
        button3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Done");
        button3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 330, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm job entry ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, 234, 26));

        l4.setBorder(null);
        l4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4ActionPerformed(evt);
            }
        });
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 313, 34));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("JOB ID ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 144, 21));

        l5.setBorder(null);
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 313, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tution Fees : ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 348, 144, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("WORKING DURATION");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 144, 21));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LOCATION ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 144, 21));

        l6.setBorder(null);
        jPanel1.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 313, 34));

        l7.setBorder(null);
        jPanel1.add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 313, 34));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CONTACT NUMBER");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 144, 21));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_photo-1505142468610-359e7d316be0.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 400));

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean isNum (String num)  {
        if (num == null) {
            return false;
        }
        try {
            Double.parseDouble(num);
        }
        catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    private void l4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4ActionPerformed

    }//GEN-LAST:event_l4ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        if (isNum(l3.getText()) && isNum(l5.getText()))  {
            try {
            DBconnector db = new DBconnector ();
            String query = "insert into company values ('"+l1.getText()+"','"+l2.getText()+"',"+l3.getText()+",'"+l4.getText()+"',"+l5.getText()+",'"+l6.getText()+"','"+l7.getText()+"')";
            db.openConnection();
            db.st.executeUpdate(query);
            db.closeConnection();
            this.setVisible(false);
            new editJob().setVisible(true);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(addCourse.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                try {
                    new editJob (1, null).setVisible(true);
                } catch (ClassNotFoundException ex1) {
                    Logger.getLogger(addJob.class.getName()).log(Level.SEVERE, null, ex1);
                } catch (SQLException ex1) {
                    Logger.getLogger(addJob.class.getName()).log(Level.SEVERE, null, ex1);
                }
            this.setVisible(false);
            Logger.getLogger(addCourse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else {
            JOptionPane.showMessageDialog (this, "Job ID and Salary must be filled with numeric values!","Invalid Format", 1);
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new editJob(1, null).setVisible(true);
            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addJob.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            try {
                Logger.getLogger(addJob.class.getName()).log(Level.SEVERE, null, ex);
                new editJob (1, null).setVisible(true);
                this.setVisible(false);
            } catch (ClassNotFoundException ex1) {
                Logger.getLogger(addJob.class.getName()).log(Level.SEVERE, null, ex1);
            } catch (SQLException ex1) {
                Logger.getLogger(addJob.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addJob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField l1;
    private javax.swing.JTextField l2;
    private javax.swing.JTextField l3;
    private javax.swing.JTextField l4;
    private javax.swing.JTextField l5;
    private javax.swing.JTextField l6;
    private javax.swing.JTextField l7;
    // End of variables declaration//GEN-END:variables
}