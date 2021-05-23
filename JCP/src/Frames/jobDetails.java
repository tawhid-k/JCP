package Frames;
import Database.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class jobDetails extends javax.swing.JFrame {

    public jobDetails(jobList l, String id) throws ClassNotFoundException, SQLException {
        initComponents();
        prev = l;
        DBconnector db = new DBconnector ();
        String query = "select * from company where c_id = "+id;
        db.eQuery(query);
        db.rs.next();
        t1.setText(t1.getText()+db.rs.getString("c_name"));
        t2.setText(t2.getText()+db.rs.getString("post"));
        t3.setText(t3.getText()+db.rs.getString("salary"));
        t4.setText(t4.getText()+db.rs.getString("Duration"));
        t5.setText(t5.getText()+db.rs.getString("location"));
        t6.setText(t6.getText()+db.rs.getString("c_phn"));
    }
    public jobDetails()  {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Job Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 53));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_____________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 570, -1));

        t6.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t6.setForeground(new java.awt.Color(255, 255, 255));
        t6.setText("Contact Number :   ");
        jPanel1.add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 640, 40));

        t1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setText("Company Name :     ");
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 630, 40));

        t2.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setText("Post :                        ");
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 630, 40));

        t3.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setText("Salary :                     ");
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 630, 40));

        t4.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setText("Duration :                 ");
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 630, 40));

        t5.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t5.setForeground(new java.awt.Color(255, 255, 255));
        t5.setText("Location :                 ");
        jPanel1.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 640, 40));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Apply");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 331, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //prev.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(this, "Application sent", "Applicable", 1);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jobDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    // End of variables declaration//GEN-END:variables
    private jobList prev;
}
