package Frames;
import Database.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class editUser extends javax.swing.JFrame {

    public editUser () {
        
    }
    public editUser(int init, editUser e) throws ClassNotFoundException, SQLException {
        initComponents();
        EDITUSER = e;
        DBconnector db = new DBconnector ();
        initial_id = init;
        const_id = init;
        String query = "select * from user where u_id > "+(initial_id-1);
        JLabel arr[] = new JLabel [5];
        arr[0] = l1;
        arr[1] = l2;
        arr[2] = l3;
        arr[3] = l4;
        arr[4] = l5;
        int i = 0;
        db.eQuery(query);
        while (db.rs.next()) {
            arr[i].setText((i+init)+". "+db.rs.getString("u_name"));
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        B5 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 170, 69));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("_____________________________");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 622, 52));

        l5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 500, 40));

        l1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 500, 40));

        l2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 500, 40));

        l3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 500, 40));

        l4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 500, 40));

        B5.setBackground(new java.awt.Color(187, 23, 50));
        B5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        B5.setForeground(new java.awt.Color(255, 255, 255));
        B5.setText("DROP");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        jPanel1.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 110, 30));

        B1.setBackground(new java.awt.Color(187, 23, 50));
        B1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setText("DROP");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 110, 30));

        B2.setBackground(new java.awt.Color(187, 23, 50));
        B2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setText("DROP");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 110, 30));

        B3.setBackground(new java.awt.Color(187, 23, 50));
        B3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setText("DROP");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel1.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 110, 30));

        B4.setBackground(new java.awt.Color(187, 23, 50));
        B4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        B4.setForeground(new java.awt.Color(255, 255, 255));
        B4.setText("DROP");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        jPanel1.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 110, 30));

        jButton10.setBackground(new java.awt.Color(0, 51, 51));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Next Page");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        if (!l1.getText().equals(""))
        {
        try {
            DBconnector db = new DBconnector ();
            String s1 = "delete from user where u_name = '"+l1.getText().substring(3)+"'";
            String s2 = "delete from enrolled where u_name = '"+l1.getText().substring(3)+"'";
            //System.out.println(s1);
            db.openConnection();
            db.st.executeUpdate (s1);
            db.st.executeUpdate (s2);
            db.closeConnection();
            this.setVisible(false);
            new editUser(1, null).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if (!l2.getText().equals(""))
        {
        try {
            DBconnector db = new DBconnector ();
            String s1 = "delete from user where u_name = '"+l2.getText().substring(3)+"'";
            String s2 = "delete from enrolled where u_name = '"+l2.getText().substring(3)+"'";
            //System.out.println(s1);
            db.openConnection();
            db.st.executeUpdate (s1);
            db.st.executeUpdate (s2);
            db.closeConnection();
            this.setVisible(false);
            new editUser(1, null).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
         if (!l3.getText().equals(""))
        {
        try {
            DBconnector db = new DBconnector ();
            String s1 = "delete from user where u_name = '"+l3.getText().substring(3)+"'";
            String s2 = "delete from enrolled where u_name = '"+l3.getText().substring(3)+"'";
            //System.out.println(s1);
            db.openConnection();
            db.st.executeUpdate (s1);
            db.st.executeUpdate (s2);
            db.closeConnection();
            this.setVisible(false);
            new editUser(1, null).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if (!l4.getText().equals(""))
        {
        try {
            DBconnector db = new DBconnector ();
            String s1 = "delete from user where u_name = '"+l4.getText().substring(3)+"'";
            String s2 = "delete from enrolled where u_name = '"+l4.getText().substring(3)+"'";
            //System.out.println(s1);
            db.openConnection();
            db.st.executeUpdate (s1);
            db.st.executeUpdate (s2);
            db.closeConnection();
            this.setVisible(false);
            new editUser(1, null).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if (!l5.getText().equals(""))
        {
        try {
            DBconnector db = new DBconnector ();
            String s1 = "delete from user where u_name = '"+l5.getText().substring(3)+"'";
            String s2 = "delete from enrolled where u_name = '"+l5.getText().substring(3)+"'";
            //System.out.println(s1);
            db.openConnection();
            db.st.executeUpdate (s1);
            db.st.executeUpdate (s2);
            db.closeConnection();
            this.setVisible(false);
            new editUser(1, null).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(editUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            //NEXT PAGE
            if (initial_id == const_id) {
                JOptionPane.showMessageDialog (this, "No others users to be shown", "Empty Page", 1);
            }
            else {
                new editUser(initial_id+1, this).setVisible (true);
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
        if (EDITUSER==null)
        new admin().setVisible(true);
        else EDITUSER.setVisible(true);
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
            java.util.logging.Logger.getLogger(editUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    // End of variables declaration//GEN-END:variables
    private int const_id, initial_id;
    private editUser EDITUSER;
}
