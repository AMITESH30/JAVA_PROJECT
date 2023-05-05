package BloodBankManagementSystem;


import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        registerBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        donor = new javax.swing.JMenu();
        addDonor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        updateDonor = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        ddeatils = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        regDonorsDetails = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        bloodGrp = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        location = new javax.swing.JMenuItem();
        purchase = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        bloodPacketsDetails = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        patients = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenu();
        deleteDonorDetails = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        logoutItem = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        closeAppItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        registerBtn.setBackground(new java.awt.Color(204, 255, 255));
        registerBtn.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(0, 0, 102));
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 63, 170, 50));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register for upcoming Blood Donation Camp ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 67, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainImage.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        donor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Donor.png"))); // NOI18N
        donor.setText("Donor");
        donor.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        donor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorActionPerformed(evt);
            }
        });

        addDonor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        addDonor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add new.png"))); // NOI18N
        addDonor.setText("Add New Donor");
        addDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDonorActionPerformed(evt);
            }
        });
        donor.add(addDonor);
        donor.add(jSeparator1);

        updateDonor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        updateDonor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Update details.png"))); // NOI18N
        updateDonor.setText("Update Details");
        updateDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDonorActionPerformed(evt);
            }
        });
        donor.add(updateDonor);
        donor.add(jSeparator2);

        ddeatils.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        ddeatils.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Details.png"))); // NOI18N
        ddeatils.setText("Donors Details");
        ddeatils.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddeatilsActionPerformed(evt);
            }
        });
        donor.add(ddeatils);
        donor.add(jSeparator7);

        regDonorsDetails.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        regDonorsDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        regDonorsDetails.setText("Registered Donors for Camp");
        regDonorsDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regDonorsDetailsActionPerformed(evt);
            }
        });
        donor.add(regDonorsDetails);

        jMenuBar1.add(donor);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search user.png"))); // NOI18N
        jMenu3.setText("Search Blood Donor");
        jMenu3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N

        bloodGrp.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        bloodGrp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Blood group.png"))); // NOI18N
        bloodGrp.setText("Blood Group ");
        bloodGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGrpActionPerformed(evt);
            }
        });
        jMenu3.add(bloodGrp);
        jMenu3.add(jSeparator3);

        location.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        location.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Location.png"))); // NOI18N
        location.setText("Location");
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });
        jMenu3.add(location);

        jMenuBar1.add(jMenu3);

        purchase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/stock.png"))); // NOI18N
        purchase.setText("Blood Stocks");
        purchase.setFocusable(false);
        purchase.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseActionPerformed(evt);
            }
        });

        jMenuItem6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Address.png"))); // NOI18N
        jMenuItem6.setText("Purchase of Blood");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        purchase.add(jMenuItem6);
        purchase.add(jSeparator4);

        bloodPacketsDetails.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        bloodPacketsDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        bloodPacketsDetails.setText("Stock Details");
        bloodPacketsDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodPacketsDetailsActionPerformed(evt);
            }
        });
        purchase.add(bloodPacketsDetails);
        purchase.add(jSeparator5);

        patients.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        patients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Details.png"))); // NOI18N
        patients.setText("Patients Details");
        patients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsActionPerformed(evt);
            }
        });
        purchase.add(patients);

        jMenuBar1.add(purchase);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete donor.png"))); // NOI18N
        delete.setText("Delete Donor");
        delete.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        deleteDonorDetails.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        deleteDonorDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete.png"))); // NOI18N
        deleteDonorDetails.setText("Delete Donor");
        deleteDonorDetails.setToolTipText("");
        deleteDonorDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDonorDetailsActionPerformed(evt);
            }
        });
        delete.add(deleteDonorDetails);

        jMenuBar1.add(delete);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        jMenu5.setText("Exit");
        jMenu5.setFocusable(false);
        jMenu5.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N

        logoutItem.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        logoutItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout.png"))); // NOI18N
        logoutItem.setText("Logout");
        logoutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutItemActionPerformed(evt);
            }
        });
        jMenu5.add(logoutItem);
        jMenu5.add(jSeparator6);

        closeAppItem.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        closeAppItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit application.png"))); // NOI18N
        closeAppItem.setText("Close Application");
        closeAppItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAppItemActionPerformed(evt);
            }
        });
        jMenu5.add(closeAppItem);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDonorActionPerformed
        // TODO add your handling code here:
        new UpdateDonorDetails().setVisible(true);
    }//GEN-LAST:event_updateDonorActionPerformed

    private void ddeatilsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddeatilsActionPerformed
        // TODO add your handling code here:
        new AllDonorDetails().setVisible(true);
    }//GEN-LAST:event_ddeatilsActionPerformed

    private void bloodGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGrpActionPerformed
        // TODO add your handling code here:
        new SearchDonorByBloodGrp().setVisible(true);
    }//GEN-LAST:event_bloodGrpActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        new SellBlood().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void bloodPacketsDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodPacketsDetailsActionPerformed
        // TODO add your handling code here:
        new NoOfBloodPackets().setVisible(true);
    }//GEN-LAST:event_bloodPacketsDetailsActionPerformed

    private void deleteDonorDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDonorDetailsActionPerformed
        // TODO add your handling code here:
        new DeleteDonor().setVisible(true);
    }//GEN-LAST:event_deleteDonorDetailsActionPerformed

    private void logoutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutItemActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to logout ? ", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logoutItemActionPerformed

    private void closeAppItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAppItemActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to close application ? ", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_closeAppItemActionPerformed

    private void addDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDonorActionPerformed
        // TODO add your handling code here:
        new AddNewDonor().setVisible(true);
    }//GEN-LAST:event_addDonorActionPerformed

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
        new SearchDonorByLocation().setVisible(true);
    }//GEN-LAST:event_locationActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

    }//GEN-LAST:event_deleteActionPerformed

    private void purchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_purchaseActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        new RegisterDonor().setVisible(true);
    }//GEN-LAST:event_registerBtnActionPerformed

    private void regDonorsDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regDonorsDetailsActionPerformed
        // TODO add your handling code here:
        new RegisteredCampDonor().setVisible(true);
    }//GEN-LAST:event_regDonorsDetailsActionPerformed

    private void donorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_donorActionPerformed

    private void patientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsActionPerformed
        // TODO add your handling code here:
        new PatientsDetails().setVisible(true);        
    }//GEN-LAST:event_patientsActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addDonor;
    private javax.swing.JMenuItem bloodGrp;
    private javax.swing.JMenuItem bloodPacketsDetails;
    private javax.swing.JMenuItem closeAppItem;
    private javax.swing.JMenuItem ddeatils;
    private javax.swing.JMenu delete;
    private javax.swing.JMenuItem deleteDonorDetails;
    private javax.swing.JMenu donor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JMenuItem location;
    private javax.swing.JMenuItem logoutItem;
    private javax.swing.JMenuItem patients;
    private javax.swing.JMenu purchase;
    private javax.swing.JMenuItem regDonorsDetails;
    private javax.swing.JButton registerBtn;
    private javax.swing.JMenuItem updateDonor;
    // End of variables declaration//GEN-END:variables
}
