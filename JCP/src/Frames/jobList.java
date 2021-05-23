package Frames;
import Database.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class jobList extends javax.swing.JFrame {

    public jobList () {
        
    }
    public jobList(jobType temp, String uname,int init, jobList e) throws ClassNotFoundException, SQLException {
        initComponents();
        username = uname;
        prev = temp;
        JOBLIST = e;
        DBconnector db = new DBconnector ();
        initial_id = init;
        const_id = init;
        String query = "select * from company where c_id > "+(initial_id-1);
        JLabel arr[] = new JLabel [6];
        arr[0] = l1;
        arr[1] = l2;
        arr[2] = l3;
        arr[3] = l4;
        arr[4] = l5;
        arr[5] = l6;
        int i = 0;
        db.eQuery(query);
        while (db.rs.next()) {
            arr[i].setText((i+init)+". "+db.rs.getString("c_name"));
            i++;
            if (i == 6) {
                initial_id = i+init-1;
                break;
            }
        }
        if (i!=0) const_id++;
        if (db.rs.next()==false){
            initial_id = const_id = 0;
        }
        db.closeConnection();        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jButton10 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JOB RESULTS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 10, 352, 69));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("_____________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 622, 52));

        l6.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 410, 40));

        l1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 410, 40));

        l2.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 410, 40));

        l3.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 410, 40));

        l4.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 410, 40));

        l5.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 410, 40));

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        jButton10.setBackground(new java.awt.Color(0, 51, 51));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Next Page");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 90, 30));

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 10, 60, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        char space = ' ';
        int i;
        if (l1.getText().charAt(2) == space)  i = 3;
        else i = 4;
        DBconnector db = new DBconnector();
        String query = "select * from company where c_name = '"+l1.getText().substring(i)+"'";
        //JOptionPane.showMessageDialog (this, query,"Back to the game",2);
        try {
            db.eQuery(query);
            db.rs.next();
            new jobDetails(this, db.rs.getString("c_id")).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.closeConnection();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        char space = ' ';
        int i;
        if (l2.getText().charAt(2) == space)  i = 3;
        else i = 4;
        DBconnector db = new DBconnector();
        String query = "select * from company where c_name = '"+l2.getText().substring(i)+"'";
        //JOptionPane.showMessageDialog (this, query,"Back to the game",2);
        try {
            db.eQuery(query);
            db.rs.next();
            new jobDetails(this,db.rs.getString("c_id")).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.closeConnection();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        char space = ' ';
        int i;
        if (l3.getText().charAt(2) == space)  i = 3;
        else i = 4;
        DBconnector db = new DBconnector();
        String query = "select * from company where c_name = '"+l3.getText().substring(i)+"'";
        //JOptionPane.showMessageDialog (this, query,"Back to the game",2);
        try {
            db.eQuery(query);
            db.rs.next();
            new jobDetails(this,db.rs.getString("c_id")).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.closeConnection();
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        char space = ' ';
        int i;
        if (l4.getText().charAt(2) == space)  i = 3;
        else i = 4;
        DBconnector db = new DBconnector();
        String query = "select * from company where c_name = '"+l4.getText().substring(i)+"'";
        //JOptionPane.showMessageDialog (this, query,"Back to the game",2);
        try {
            db.eQuery(query);
            db.rs.next();
            new jobDetails(this,db.rs.getString("c_id")).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.closeConnection();
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        char space = ' ';
        int i;
        if (l5.getText().charAt(2) == space)  i = 3;
        else i = 4;
        DBconnector db = new DBconnector();
        String query = "select * from company where c_name = '"+l5.getText().substring(i)+"'";
        //JOptionPane.showMessageDialog (this, query,"Back to the game",2);
        try {
            db.eQuery(query);
            db.rs.next();
            new jobDetails(this,db.rs.getString("c_id")).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.closeConnection();
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        char space = ' ';
        int i;
        if (l6.getText().charAt(2) == space)  i = 3;
        else i = 4;
        DBconnector db = new DBconnector();
        String query = "select * from company where c_name = '"+l6.getText().substring(i)+"'";
        //JOptionPane.showMessageDialog (this, query,"Back to the game",2);
        try {
            db.eQuery(query);
            db.rs.next();
            new jobDetails(this,db.rs.getString("c_id")).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(jobList.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.closeConnection();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            //NEXT PAGE
            if (initial_id == const_id) {
                JOptionPane.showMessageDialog (this, "No others jobs to be shown", "Empty Page", 1);
            }
            else {
                new jobList(null, username, initial_id+1, this).setVisible (true);
                this.setVisible(false);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editCourse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
        if (JOBLIST==null)
        prev.setVisible(true);
        else JOBLIST.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(jobList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jobList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jobList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jobList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new jobList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    // End of variables declaration//GEN-END:variables
    private jobType prev;
    private jobList JOBLIST;
    private String username;
    private int initial_id, const_id;
}
