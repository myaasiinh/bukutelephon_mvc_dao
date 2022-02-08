/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myaasiinh.bukutelephon_mvc_dao.view;

import com.myaasiinh.bukutelephon_mvc_dao.controller.ControllerBukuTelphon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
/**
 *
 * @author Namikaze
 */
public class Main extends javax.swing.JFrame {
    
   
  public JTextField getIdTextField() {
      return IdTextField;
  }
  
  public JTextField getNoTelphonTextField() {
        return  NoTelphonTextField;
    }
    public JTextField getNamaTextField() {
        return NamaTextField;
    }
    public JTextField getAlamatTextField() {
        return AlamatTextField;
    }

    public JButton getINSERTButton() {
        return INSERTButton;
    }

    public JButton getUPDATEButton() {
        return UPDATEButton;
    }
    public JButton getDELETEButton() {
        return DELETEButton;
    }
    public JButton getRESETButton() {
        return RESETButton;
    }
    public JTextField getSearchWithNameTextField() {
        return SearchWithNameTextField;
    }
    public JButton getSEARCHButton() {
        return SEARCHButton;
    }
    public JTable getTable(){
        return Table;
    }


    /**
     * Creates new form Main
     * 
     * @return 
     */
    
    ControllerBukuTelphon cbt;
    

    
    public Main() {
        initComponents();
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JudulProgramLabel = new javax.swing.JLabel();
        IdLabel = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        NoTelpLabel = new javax.swing.JLabel();
        NoTelphonTextField = new javax.swing.JTextField();
        NamaLabel = new javax.swing.JLabel();
        NamaTextField = new javax.swing.JTextField();
        AlamatLabel = new javax.swing.JLabel();
        AlamatTextField = new javax.swing.JTextField();
        INSERTButton = new javax.swing.JButton();
        UPDATEButton = new javax.swing.JButton();
        DELETEButton = new javax.swing.JButton();
        RESETButton = new javax.swing.JButton();
        PencarianNamaLabel = new javax.swing.JLabel();
        SearchWithNameTextField = new javax.swing.JTextField();
        SEARCHButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JudulProgramLabel.setText("PROGAM BUKU TELEPHON");

        IdLabel.setText("ID");

        IdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IdTextField.setText("Masukan id anda");

        NoTelpLabel.setText("No Telphon");

        NoTelphonTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NoTelphonTextField.setText("Masukan no telphon anda");

        NamaLabel.setText("Nama");

        NamaTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NamaTextField.setText("Masukan nama anda");

        AlamatLabel.setText("Alamat");

        AlamatTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AlamatTextField.setText("Masukan alamat anda");

        INSERTButton.setText("INSERT");
        INSERTButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTButtonActionPerformed(evt);
            }
        });

        UPDATEButton.setText("UPDATE");
        UPDATEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEButtonActionPerformed(evt);
            }
        });

        DELETEButton.setText("DELETE");
        DELETEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEButtonActionPerformed(evt);
            }
        });

        RESETButton.setText("RESET");
        RESETButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETButtonActionPerformed(evt);
            }
        });

        PencarianNamaLabel.setText("Pencarian Berdasarkan Nama");

        SearchWithNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SearchWithNameTextField.setText("Masukan sesuai nama yang anda cari");

        SEARCHButton.setText("SEARCH");
        SEARCHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHButtonActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "No Telp", "Nama", "Alamat"
            }
        ));
        jScrollPane2.setViewportView(Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IdLabel)
                                    .addComponent(NoTelpLabel)
                                    .addComponent(NamaLabel)
                                    .addComponent(AlamatLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NoTelphonTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                                    .addComponent(IdTextField)
                                    .addComponent(NamaTextField)
                                    .addComponent(AlamatTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(INSERTButton)
                                .addGap(33, 33, 33)
                                .addComponent(UPDATEButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DELETEButton)
                                .addGap(33, 33, 33)
                                .addComponent(RESETButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchWithNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SEARCHButton)
                                .addGap(0, 2, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(JudulProgramLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(PencarianNamaLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JudulProgramLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdLabel)
                    .addComponent(IdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoTelpLabel)
                    .addComponent(NoTelphonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaLabel)
                    .addComponent(NamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlamatLabel)
                    .addComponent(AlamatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INSERTButton)
                    .addComponent(UPDATEButton)
                    .addComponent(DELETEButton)
                    .addComponent(RESETButton))
                .addGap(18, 18, 18)
                .addComponent(PencarianNamaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchWithNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SEARCHButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UPDATEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEButtonActionPerformed
        // TODO add
        cbt = new ControllerBukuTelphon(this);
         cbt.update();
            cbt.isiTable();
            cbt.reset();

        
    }//GEN-LAST:event_UPDATEButtonActionPerformed

    private void INSERTButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTButtonActionPerformed
        // TODO add your handling code here:
        cbt = new ControllerBukuTelphon(this);
         cbt.insert();
            cbt.isiTable();
            cbt.reset();
    }//GEN-LAST:event_INSERTButtonActionPerformed

    private void DELETEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEButtonActionPerformed
        // TODO add your handling code here:
        cbt = new ControllerBukuTelphon(this);
         cbt.delete();
            cbt.isiTable();
            cbt.reset();
    }//GEN-LAST:event_DELETEButtonActionPerformed

    private void RESETButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETButtonActionPerformed
        // TODO add your handling code here:
        cbt = new ControllerBukuTelphon(this);
            cbt.reset();
    }//GEN-LAST:event_RESETButtonActionPerformed

    private void SEARCHButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHButtonActionPerformed
        // TODO add your handling code here:
        cbt = new ControllerBukuTelphon(this);
         cbt.search();
    }//GEN-LAST:event_SEARCHButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel AlamatLabel;
    public javax.swing.JTextField AlamatTextField;
    private javax.swing.JButton DELETEButton;
    public javax.swing.JButton INSERTButton;
    public javax.swing.JLabel IdLabel;
    public javax.swing.JTextField IdTextField;
    private javax.swing.JLabel JudulProgramLabel;
    public javax.swing.JLabel NamaLabel;
    public javax.swing.JTextField NamaTextField;
    public javax.swing.JLabel NoTelpLabel;
    public javax.swing.JTextField NoTelphonTextField;
    private javax.swing.JLabel PencarianNamaLabel;
    private javax.swing.JButton RESETButton;
    private javax.swing.JButton SEARCHButton;
    private javax.swing.JTextField SearchWithNameTextField;
    public javax.swing.JTable Table;
    private javax.swing.JButton UPDATEButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
