package Frames;
import Database.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class editCourse extends javax.swing.JFrame {

    public editCourse () {
        initComponents();
    }
    public editCourse(int init, editCourse e) throws ClassNotFoundException, SQLException {
        initComponents();
        EDITCOURSE = e;
        DBconnector db = new DBconnector ();
        initial_id = init;
        const_id = init;
        String query = "select * from courses where c_id > "+(initial_id-1);
        JLabel arr[] = new JLabel [5];
        arr[0] = l1;
        arr[1] = l2;
        arr[2] = l3;
        arr[3] = l4;
        arr[4] = l5;
        int i = 0;
        db.eQuery(query);
        db.rs.next();
        while (db.rs.next()) {
            arr[i].setText((i+init)+". "+db.rs.getString("c_name"));
            i++;
            if (i == 5) {
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Courses");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 250, 69));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("_____________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 622, 52));

        l5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 670, 40));

        l1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 670, 40));

        l2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 670, 40));

        l3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 680, 40));

        l4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 680, 40));

        jButton1.setBackground(new java.awt.Color(187, 23, 50));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DROP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 110, 30));

        jButton2.setBackground(new java.awt.Color(187, 23, 50));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("DROP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 110, 30));

        jButton3.setBackground(new java.awt.Color(187, 23, 50));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("DROP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 110, 30));

        jButton4.setBackground(new java.awt.Color(187, 23, 50));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("DROP");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 110, 30));

        jButton5.setBackground(new java.awt.Color(187, 23, 50));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("DROP");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 110, 30));

        jButton6.setBackground(new java.awt.Color(0, 204, 51));
        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("ADD");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 230, 50));

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, -1, -1));

        jButton8.setBackground(new java.awt.Color(0, 51, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Next Page");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 944, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!l5.getText().equals("")) {
        try {
            DBconnector db = new DBconnector ();
            String s1 = "delete from courses where c_name = '"+l5.getText().substring(3)+"'";
            try {
                db.openConnection();
            } catch (SQLException ex) {
                Logger.getLogger(editCourse.class.getName()).log(Level.SEVERE, null, ex);
            }
            db.st.executeUpdate (s1);
            db.closeConnection();
            this.setVisible(false);
            new editCourse(1, null).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!l1.getText().equals("")){
        try {
            DBconnector db = new DBconnector ();
            String s1 = "delete from courses where c_name = '"+l1.getText().substring(3)+"'";
            //System.out.println(s1);
            db.openConnection();
            db.st.executeUpdate (s1);
            db.closeConnection();
            this.setVisible(false);
            new editCourse(1, null).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if (!l2.getText().equals("")){
        try {
            DBconnector db = new DBconnector ();
            String s1 = "delete from courses where c_name = '"+l2.getText().substring(3)+"'";
            db.openConnection();
            db.st.executeUpdate (s1);
            db.closeConnection();
            this.setVisible(false);
            new editCourse(1, null).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!l3.getText().equals("")){
        try {
            DBconnector db = new DBconnector ();
            String s1 = "delete from courses where c_name = '"+l3.getText().substring(3)+"'";
            db.openConnection();
            db.st.executeUpdate (s1);
            db.closeConnection();
            this.setVisible(false);
            new editCourse(1, null).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!l4.getText().equals(""))
        {
        try {
            DBconnector db = new DBconnector ();
            String s1 = "delete from courses where c_name = '"+l4.getText().substring(3)+"'";
            db.openConnection();
            db.st.executeUpdate (s1);
            db.closeConnection();
            this.setVisible(false);
            new editCourse(1, null).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        new addCourse().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.setVisible(false);
        if (EDITCOURSE==null)
        new admin().setVisible(true);
        else EDITCOURSE.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            //NEXT PAGE
            if (initial_id == const_id) {
                JOptionPane.showMessageDialog (this, "No others courses to be shown", "Empty Page", 1);
            }
            else {
            new editCourse(initial_id+1, this).setVisible (true);
            this.setVisible(false);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editCourse.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(editCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editCourse().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    // End of variables declaration//GEN-END:variables
    private int initial_id, const_id;
    private editCourse EDITCOURSE;
}
