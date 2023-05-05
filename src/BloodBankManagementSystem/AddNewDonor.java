package BloodBankManagementSystem;

import java.sql.*;
import ProjBack.ConnectionProvider;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddNewDonor extends javax.swing.JFrame {
    public static String bg;
    /**
     * Creates new form addNewDonor
     */
    public AddNewDonor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        donorId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dName = new javax.swing.JTextField();
        dFname = new javax.swing.JTextField();
        dMname = new javax.swing.JTextField();
        dMobile = new javax.swing.JTextField();
        dGender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dEmail = new javax.swing.JTextField();
        dBloodGrp = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        dAddress = new javax.swing.JTextArea();
        dCity = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        saveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        closebtn = new javax.swing.JButton();
        dDob = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 90));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Candara", 1, 30)); // NOI18N
        jLabel1.setText("Add New Donor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 11, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, 801, 10));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setText("New Donor Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 89, -1, -1));

        donorId.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        donorId.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(donorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 87, 170, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setText("Full Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 128, -1, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setText("Father's Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setText("Mother's Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 212, -1, -1));

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setText("Date of Birth");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 253, -1, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel8.setText("Mobile No.");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 292, -1, -1));

        jLabel9.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 335, -1, -1));

        dName.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dNameActionPerformed(evt);
            }
        });
        getContentPane().add(dName, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 125, 170, -1));

        dFname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 167, 170, -1));

        dMname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 209, 170, -1));

        dMobile.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 289, 160, -1));

        dGender.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        dGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dGenderActionPerformed(evt);
            }
        });
        getContentPane().add(dGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 332, 170, -1));

        jLabel10.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel10.setText("Email ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 128, 40, -1));

        jLabel11.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel11.setText("Blood Group");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel12.setText("Address");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 212, -1, -1));

        jLabel13.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel13.setText("City");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 335, 40, -1));

        dEmail.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dEmailActionPerformed(evt);
            }
        });
        getContentPane().add(dEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 125, 170, -1));

        dBloodGrp.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dBloodGrp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(dBloodGrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 167, 170, -1));

        dAddress.setColumns(20);
        dAddress.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        dAddress.setRows(5);
        jScrollPane1.setViewportView(dAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 209, 170, -1));

        dCity.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 332, 170, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 392, 801, 10));

        saveBtn.setBackground(new java.awt.Color(0, 153, 0));
        saveBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 420, 90, 40));

        resetBtn.setBackground(new java.awt.Color(0, 153, 255));
        resetBtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 420, 90, 40));

        closebtn.setBackground(new java.awt.Color(255, 0, 51));
        closebtn.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        closebtn.setForeground(new java.awt.Color(255, 255, 255));
        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 420, 90, 40));

        dDob.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(dDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 251, 170, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/allformsbg.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
            Connection conn = ConnectionProvider.getCon();
            Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("select max(donorId) from Donor");
            if (rs.first()) {
                int id = rs.getInt(1);
                id = id + 1;
                String str = String.valueOf(id);
                donorId.setText(str);
                
            }
            else {
                donorId.setText("1");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void dNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dNameActionPerformed

    private void dGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dGenderActionPerformed

    private void dEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dEmailActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String dId = donorId.getText();
        String name = dName.getText();
        String fatherName = dFname.getText();
        String motherName = dMname.getText();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dob = dFormat.format(dDob.getDate());
        String mobileNo = dMobile.getText();
        String gender = (String)dGender.getSelectedItem();
        String email = dEmail.getText();
        String bloodGrp = (String)dBloodGrp.getSelectedItem();
        String address = dAddress.getText();
        String city = dCity.getText();
        
        
        
        try{
            Connection conn = ConnectionProvider.getCon();
//            Statement stat = conn.createStatement();
//            stat.executeUpdate("insert into donatedblood(name, dateOfPurchase, mobileNo, gender, email, bloodGrp, address, city ) values ('" +name+ "', '" +dob+ "', '" +mobileNo+ "', '" +gender+ "', '" +email+ "', '" +bloodGrp+ "', '" +address+ "', '" +city+ "')");
            
            PreparedStatement stat = conn.prepareStatement("insert into donor values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stat.setString(1, dId);
            stat.setString(2, name);
            stat.setString(3, fatherName);
            stat.setString(4, motherName);
            stat.setString(5, dob);
            stat.setString(6, mobileNo);
            stat.setString(7, gender);
            stat.setString(8, email);
            stat.setString(9, bloodGrp);
            stat.setString(10, address);
            stat.setString(11, city);
            
            stat.executeUpdate();
            
            bg = dBloodGrp.getSelectedItem().toString();
            if (bg.equals("A+")) {
                stat = conn.prepareStatement("select packetsofBlood from bloodquantity where bloodGrp='"+bg+"'");
            }
            if (bg.equals("A-")) {
                stat = conn.prepareStatement("select packetsofBlood from bloodquantity where bloodGrp='"+bg+"'");
            }
            if (bg.equals("B+")) {
                stat = conn.prepareStatement("select packetsofBlood from bloodquantity where bloodGrp='"+bg+"'");
            }
            if (bg.equals("B-")) {
                stat = conn.prepareStatement("select packetsofBlood from bloodquantity where bloodGrp='"+bg+"'");
            }
            if (bg.equals("O+")) {
                stat = conn.prepareStatement("select packetsofBlood from bloodquantity where bloodGrp='"+bg+"'");
            }
            if (bg.equals("O-")) {
                stat = conn.prepareStatement("select packetsofBlood from bloodquantity where bloodGrp='"+bg+"'");
            }
            if (bg.equals("AB+")) {
                stat = conn.prepareStatement("select packetsofBlood from bloodquantity where bloodGrp='"+bg+"'");
            }
            if (bg.equals("AB-")) {
                stat = conn.prepareStatement("select packetsofBlood from bloodquantity where bloodGrp='"+bg+"'");
            }

            ResultSet rs = stat.executeQuery();
            rs.next();
            int pkno = rs.getInt(1);
//            if (pkno == 0) {
//                JOptionPane.showMessageDialog(this, "First Donor of this Blood Group", "Note", JOptionPane.PLAIN_MESSAGE);
//            }
//            
                pkno += 1;
                stat = conn.prepareStatement("update bloodquantity set packetsofBlood=? where bloodGrp=?");
                stat.setInt(1, pkno);
                stat.setString(2, bg);
                this.dispose();
                stat.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "Donor Details Added Successfully");
            setVisible(false);
            new AddNewDonor().setVisible(true);
        }
            
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }       
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closebtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddNewDonor().setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewDonor().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closebtn;
    private javax.swing.JTextArea dAddress;
    private javax.swing.JComboBox<String> dBloodGrp;
    private javax.swing.JTextField dCity;
    private com.toedter.calendar.JDateChooser dDob;
    private javax.swing.JTextField dEmail;
    private javax.swing.JTextField dFname;
    private javax.swing.JComboBox<String> dGender;
    private javax.swing.JTextField dMname;
    private javax.swing.JTextField dMobile;
    private javax.swing.JTextField dName;
    private javax.swing.JLabel donorId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}