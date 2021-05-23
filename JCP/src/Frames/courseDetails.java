package Frames;
import Database.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class courseDetails extends javax.swing.JFrame {

    public courseDetails(courseList l, String id, String uname) throws ClassNotFoundException, SQLException {
        initComponents();
        username = uname;
        prev = l;
        DBconnector db = new DBconnector ();
        String query = "select * from courses where c_id = "+id;
        db.eQuery(query);
        db.rs.next();
        coursename = db.rs.getString ("c_name");
        t1.setText(t1.getText()+db.rs.getString("c_name"));
        t2.setText(t2.getText()+db.rs.getString("institution"));
        t3.setText(t3.getText()+db.rs.getString("c_fee"));
        if (db.rs.getString("c_pr").equals("0"))
        t4.setText(t4.getText()+"None");
        else {
            DBconnector chkr = new DBconnector ();
            String q = "select * from courses where c_id = "+db.rs.getString("c_pr");
            chkr.eQuery(q);
            chkr.rs.next();
            t4.setText(t4.getText()+chkr.rs.getString("c_name"));
            chkr.closeConnection();
        }
        t5.setText(t5.getText()+db.rs.getString("location"));
        t6.setText(t6.getText()+db.rs.getString("c_phn"));
        db.closeConnection();
    }
    public courseDetails() {
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

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 53));

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
        t1.setText("Course Name :        ");
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 630, 40));

        t2.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setText("Instituation :            ");
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 630, 40));

        t3.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setText("Course Fee :            ");
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 630, 40));

        t4.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setText("Pre-requisite :          ");
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 630, 40));

        t5.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        t5.setForeground(new java.awt.Color(255, 255, 255));
        t5.setText("Location :                ");
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
        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 331, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         //prev.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            DBconnector db = new DBconnector ();
            String s = "select * from enrolled where u_name = '"+username+"' AND c_name = '"+coursename+"'";
            db.eQuery(s);
            if (db.rs.next()==false) {
                String chk1, chk2;
                int id;
                String s1 = "select * from courses where c_name = '"+coursename+"'";
                 //System.out.println(s1);
                db.eQuery(s1);
                db.rs.next();
                id = Integer.parseInt(db.rs.getString("c_pr"));
                if (id!=0) {
                double enrolled, req;
                s1 = "select * from courser where c_id = "+id;
                //System.out.println(s1);
                db.eQuery(s1);
                db.rs.next();
                req = Double.parseDouble (db.rs.getString("grade"));
                s1 = "select * from enrolled where u_name = '"+username+"' AND c_name = (select c_name from courser where c_id = "+id+")";
                //System.out.println(s1);
                db.eQuery(s1);
                if (db.rs.next()==false) {                    
                    JOptionPane.showMessageDialog (this, "Pre requisite not found", "Not eligable", JOptionPane.ERROR_MESSAGE);
                    this.setVisible(false);
                }
                
                //System.out.println(enrolled+"  "+req);
                else if (req > Double.parseDouble (db.rs.getString("grade"))) {
                    enrolled = Double.parseDouble (db.rs.getString("grade"));
                    s1 = "select * from courser where c_id = "+id;
                    db.eQuery(s1);
                    db.rs.next();
                    String req_name = db.rs.getString("c_name");
                    JOptionPane.showMessageDialog(this, "Your grade in "+req_name+" is "+enrolled+" below requirements", "Not eligable", JOptionPane.ERROR_MESSAGE);
                    this.setVisible(false);
                }
                else {
            db.closeConnection();
            float min = 2;
            float max = 3;
            double grade = Math.random() * max + min;
            String query = "insert into enrolled values ('"+username+"','"+coursename+"', "+grade+")";
            //System.out.println(query);
            try {
                db.openConnection();
                db.st.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Course Confirnmed", "Confirnmation", 1);
                this.setVisible(false);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(courseDetails.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(courseDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            }
            else {
            float min = 2;
            float max = 3;
            double grade = Math.random() * max + min;
            String query = "insert into enrolled values ('"+username+"','"+coursename+"', "+grade+")";
            //System.out.println(query);
            try {
                db.openConnection();
                db.st.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Course Confirnmed", "Confirnmation", 1);
                this.setVisible(false);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(courseDetails.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(courseDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            db.closeConnection();
      } else {
           JOptionPane.showMessageDialog (this, "Course already taken", "Couldn't confirmned",2);        
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(courseDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(courseDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new courseDetails().setVisible(true);
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
    private courseList prev;
    private String username, coursename;
}
