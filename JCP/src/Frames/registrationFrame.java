package Frames;

import Database.*;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class registrationFrame extends javax.swing.JFrame {
    
    public registrationFrame() {
        initComponents();
    }
    public registrationFrame (LOGHOME prev) {
        initComponents();
        display = prev;   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        button3 = new javax.swing.JButton();
        rname = new javax.swing.JTextField();
        runame = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rpass = new javax.swing.JPasswordField();
        rpass2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ENTER NAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 184, 22));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTER USERNAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 144, 21));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENTER PASSWORD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 144, 21));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONFIRMN PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 190, 21));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirm registration ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 234, 26));

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
        jPanel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 100, 30));

        rname.setBorder(null);
        jPanel1.add(rname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 313, 30));

        runame.setBorder(null);
        jPanel1.add(runame, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 313, 30));

        back.setBackground(new java.awt.Color(0, 153, 153));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_photo-1505142468610-359e7d316be0.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 400));
        jPanel1.add(rpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 320, 30));
        jPanel1.add(rpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 320, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        display.setVisible(true);
        this.setVisible (false);
    }//GEN-LAST:event_backActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        DBconnector db = new DBconnector ();
        LOGHOME temp = new LOGHOME ();
        if (rpass.getText().equals(rpass2.getText())) {
            //JOptionPane.showMessageDialog (this, query, "Error", 3);
            try {
                
                String counterQuery = "select count(u_id) from USER";
                db.eQuery(counterQuery);
                db.rs.next();
                String id = db.rs.getString("count(u_id)");
                id = String.valueOf(Integer.parseInt(id));
                String query = "INSERT INTO `user` (`u_name`, `u_username`, `password`, `u_id`) VALUES ('"+rname.getText()+"', '"+runame.getText()+"', '"+rpass.getText()+"',"+id+");";
                db.st.executeUpdate(query);
                db.closeConnection();
                temp.setVisible (true);
                this.setVisible (false);
                temp.setIDPASS (runame.getText(), rpass.getText());
            } catch (ClassNotFoundException ex) {
                System.out.println("An error has occured\n");
                Logger.getLogger(registrationFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                System.out.println("There is an error\n");
                Logger.getLogger(registrationFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else JOptionPane.showMessageDialog (this, "Password didn't match", "Error", 3);
    }//GEN-LAST:event_button3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton button3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rname;
    private javax.swing.JPasswordField rpass;
    private javax.swing.JPasswordField rpass2;
    private javax.swing.JTextField runame;
    // End of variables declaration//GEN-END:variables
    private LOGHOME display;
}

