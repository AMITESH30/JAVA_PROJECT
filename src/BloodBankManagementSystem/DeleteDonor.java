package BloodBankManagementSystem;

import java.sql.*;
import ProjBack.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class DeleteDonor extends javax.swing.JFrame {

    public DeleteDonor() {
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
        dDob = new javax.swing.JTextField();
        dMobile = new javax.swing.JTextField();
        dGender = new javax.swing.JTextField();
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
        deleteBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 90));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 1, 30)); // NOI18N
        jLabel1.setText("Delete Donor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 16, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 801, 10));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setText("Donor Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 92, -1, -1));

        donorId.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        donorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorIdActionPerformed(evt);
            }
        });
        getContentPane().add(donorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 89, 111, -1));

        searchBtn.setBackground(new java.awt.Color(255, 255, 153));
        searchBtn.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 87, 80, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 134, 801, 10));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setText("Full Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 165, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setText("Father's Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 204, -1, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setText("Mother's Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 243, -1, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setText("Date of Birth");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 282, -1, -1));

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setText("Mobile No.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 321, -1, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        dName.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dName, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 162, 170, -1));

        dFname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 201, 170, -1));

        dMname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 240, 170, -1));

        dDob.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 279, 170, -1));

        dMobile.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 318, 170, -1));

        dGender.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 357, 170, -1));

        jLabel9.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 165, -1, -1));

        jLabel10.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel10.setText("Blood Group");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 204, -1, -1));

        jLabel11.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel11.setText("Address");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel12.setText("City");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 354, 34, -1));

        dEmail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dEmailActionPerformed(evt);
            }
        });
        getContentPane().add(dEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 162, 170, -1));

        dBloodGrp.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dBloodGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dBloodGrpActionPerformed(evt);
            }
        });
        getContentPane().add(dBloodGrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 201, 170, -1));

        dCity.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dCityActionPerformed(evt);
            }
        });
        getContentPane().add(dCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 351, 170, -1));

        dAddress.setColumns(20);
        dAddress.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dAddress.setRows(5);
        jScrollPane1.setViewportView(dAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 170, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 801, 10));

        deleteBtn.setBackground(new java.awt.Color(0, 153, 0));
        deleteBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 90, 40));

        resetBtn.setBackground(new java.awt.Color(0, 153, 255));
        resetBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 90, 40));

        closeBtn.setBackground(new java.awt.Color(255, 0, 0));
        closeBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        closeBtn.setForeground(new java.awt.Color(255, 255, 255));
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 90, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/allformsbg.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dEmailActionPerformed

    private void dBloodGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dBloodGrpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dBloodGrpActionPerformed

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
        new DeleteDonor().setVisible(true);
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
                // all field not editable
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Donor Id does not exist");
            }
        }
        catch(Exception e) {
            
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        String dId = donorId.getText();
        try {
            Connection conn = ConnectionProvider.getCon();
            Statement stat = conn.createStatement();
            stat.executeUpdate("delete from donor where donorId='" +dId+"'");
            JOptionPane.showMessageDialog(null, "Sad to know !\nDonor details deleted Successfully");
            setVisible(false);
            new DeleteDonor().setVisible(true);
            
        }
        catch(Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void donorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donorIdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteDonor().setVisible(true);
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
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField donorId;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
