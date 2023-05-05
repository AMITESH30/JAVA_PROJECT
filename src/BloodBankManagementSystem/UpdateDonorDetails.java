package BloodBankManagementSystem;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import ProjBack.ConnectionProvider;
import javax.swing.JOptionPane;

public class UpdateDonorDetails extends javax.swing.JFrame {

    public UpdateDonorDetails() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        donorId = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dName = new javax.swing.JTextField();
        dFname = new javax.swing.JTextField();
        dMname = new javax.swing.JTextField();
        dMobile = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dEmail = new javax.swing.JTextField();
        dBloodGrp = new javax.swing.JTextField();
        dCity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dAddress = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        updateBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        dDob = new javax.swing.JTextField();
        dGender = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 90));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 1, 30)); // NOI18N
        jLabel1.setText("Update Donor Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 11, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 800, 10));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setText("Donor Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 92, -1, -1));

        donorId.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        donorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorIdActionPerformed(evt);
            }
        });
        getContentPane().add(donorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 89, 100, -1));

        searchBtn.setBackground(new java.awt.Color(255, 255, 204));
        searchBtn.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, 800, 10));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setText("Full Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 165, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setText("Father's Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 207, -1, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setText("Mother's Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 249, -1, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setText("Date of Birth ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 288, -1, -1));

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setText("Mobile No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 329, -1, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 371, -1, -1));

        dName.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dName, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 162, 170, -1));

        dFname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 204, 170, -1));

        dMname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 246, 170, -1));

        dMobile.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dMobileActionPerformed(evt);
            }
        });
        getContentPane().add(dMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 326, 170, -1));

        jLabel9.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 165, -1, -1));

        jLabel10.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel10.setText("Blood Group");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 207, -1, -1));

        jLabel11.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel11.setText("Address");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 249, -1, -1));

        jLabel12.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel12.setText("City");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 371, -1, -1));

        dEmail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dEmailActionPerformed(evt);
            }
        });
        getContentPane().add(dEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 162, 170, -1));

        dBloodGrp.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dBloodGrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 204, 170, -1));

        dCity.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 368, 170, -1));

        dAddress.setColumns(20);
        dAddress.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dAddress.setRows(5);
        jScrollPane1.setViewportView(dAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(596, 246, 170, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 422, 812, 10));

        updateBtn.setBackground(new java.awt.Color(51, 153, 0));
        updateBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 90, 40));

        resetBtn.setBackground(new java.awt.Color(0, 153, 204));
        resetBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 90, 40));

        closeBtn.setBackground(new java.awt.Color(255, 0, 0));
        closeBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("Cancel");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 90, 40));

        dDob.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 285, 170, -1));

        dGender.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dGenderActionPerformed(evt);
            }
        });
        getContentPane().add(dGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 368, 170, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Pictures\\allformsbg.png")); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void donorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donorIdActionPerformed

    private void dMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dMobileActionPerformed

    private void dEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dEmailActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new UpdateDonorDetails().setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String dId = donorId.getText();
        
        try {
            Connection conn = ConnectionProvider.getCon();
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("Select * from donor where donorId='" +dId+"'");
            if (rs.next()) {
                dName.setText(rs.getString(2)); 
                dFname.setText(rs.getString(3));
                dMname.setText(rs.getString(4));
                dDob.setText(rs.getString(5));
                dMobile.setText(rs.getString(6));
                dGender.setText(rs.getString(7));
                dEmail.setText(rs.getString(8));
                dBloodGrp.setText(rs.getString(9));
                dAddress.setText(rs.getString(10));
                dCity.setText(rs.getString(11));
                donorId.setEditable(false);
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Donor Id does not exist");
            }
        }
        catch(Exception e) {
            
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void dGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dGenderActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String dId = donorId.getText();
        String name = dName.getText();
        String fatherName = dFname.getText();
        String motherName = dMname.getText();
        String dob = dDob.getText();
        String mobileNo = dMobile.getText();
        String gender = dGender.getText();
        String email = dEmail.getText();
        String bloodGrp = dBloodGrp.getText();
        String address = dAddress.getText();
        String city = dCity.getText();
        
        
        try{
            Connection conn = ConnectionProvider.getCon();
            Statement stat = conn.createStatement();
            stat.executeUpdate("update Donor set name='" +name+ "',fatherName='" +fatherName+ "',motherName='" +motherName+ "',DOB='" +dob+ "',mobileNo='" +mobileNo+ "',gender='" +gender+ "',email='" +email+ "',bloodGroup='" +bloodGrp+ "',address='" +address+ "',city='" +city+ "' where donorId='"+dId+"'");
            JOptionPane.showMessageDialog(null, "Donor details updated Successfully");
            setVisible(false);
            new UpdateDonorDetails().setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDonorDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextArea dAddress;
    private javax.swing.JTextField dBloodGrp;
    private javax.swing.JTextField dCity;
    private javax.swing.JTextField dDob;
    private javax.swing.JTextField dEmail;
    private javax.swing.JTextField dFname;
    private javax.swing.JTextField dGender;
    private javax.swing.JTextField dMname;
    private javax.swing.JTextField dMobile;
    private javax.swing.JTextField dName;
    private javax.swing.JTextField donorId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
