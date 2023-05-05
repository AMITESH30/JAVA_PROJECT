package BloodBankManagementSystem;

import java.sql.*;
import ProjBack.ConnectionProvider;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class RegisterDonor extends javax.swing.JFrame {

    /**
     * Creates new form registerDonor
     */
    public RegisterDonor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        dName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dDob = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        dBloodGrp = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dMobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dEmail = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        dCity = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 90));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 1, 30)); // NOI18N
        jLabel1.setText("Register for Blood Donation Campaign");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 18, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 801, 12));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setText("Full Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 106, -1, -1));

        dName.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dName, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 103, 170, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setText("Date of Birth");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 147, -1, -1));

        dDob.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 145, 170, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setText("Blood Group");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 186, -1, -1));

        dBloodGrp.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        dBloodGrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(dBloodGrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 183, 170, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setText("Mobile No.");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 228, -1, -1));

        dMobile.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 225, 170, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 270, 34, -1));

        dEmail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dEmail.setToolTipText("");
        dEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dEmailActionPerformed(evt);
            }
        });
        getContentPane().add(dEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 267, 170, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 801, 10));

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setText("City");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 312, 34, -1));

        dCity.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dCity.setToolTipText("");
        dCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dCityActionPerformed(evt);
            }
        });
        getContentPane().add(dCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 309, 170, -1));

        registerBtn.setBackground(new java.awt.Color(51, 153, 0));
        registerBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 110, 40));

        resetBtn.setBackground(new java.awt.Color(0, 153, 255));
        resetBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 100, 40));

        closeBtn.setBackground(new java.awt.Color(255, 0, 51));
        closeBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 90, 40));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 103, 34, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel8.setText("Date - 1 Nov 2020     Venue - 407, Samarth Nagar, Pune.     Time - 7am to 7pm");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 103, -1, -1));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bfl1.gif"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/allformsbg.png"))); // NOI18N
        jLabel10.setText("\\");
            getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void dEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dEmailActionPerformed

    private void dCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dCityActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new RegisterDonor().setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        String name = dName.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dob = dFormat.format(dDob.getDate());
        String bloodGrp = (String)dBloodGrp.getSelectedItem();
        String mobileNo = dMobile.getText();
        String email = dEmail.getText();
        String city = dCity.getText();
        
        
        try{
            Connection conn = ConnectionProvider.getCon();
            Statement stat = conn.createStatement();
            stat.executeUpdate("insert into donationCampDonors (name, DOB, bloodGroup, mobileNo, email, city ) values ('" +name+ "', '" +dob+ "', '" +bloodGrp+ "', '" +mobileNo+ "', '" +email+ "', '" +city+ "')");
            JOptionPane.showMessageDialog(null, "Registration Successful! Thank You");
            setVisible(false);
            new Home().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JComboBox<String> dBloodGrp;
    private javax.swing.JTextField dCity;
    private com.toedter.calendar.JDateChooser dDob;
    private javax.swing.JTextField dEmail;
    private javax.swing.JTextField dMobile;
    private javax.swing.JTextField dName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton registerBtn;
    private javax.swing.JButton resetBtn;
    // End of variables declaration//GEN-END:variables
}