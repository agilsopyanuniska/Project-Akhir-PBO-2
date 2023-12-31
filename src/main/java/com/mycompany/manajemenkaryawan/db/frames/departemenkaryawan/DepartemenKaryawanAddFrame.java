/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manajemenkaryawan.db.frames.departemenkaryawan;

import com.mycompany.manajemenkaryawan.db.Basisdata;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class DepartemenKaryawanAddFrame extends javax.swing.JFrame {

    /**
     * Creates new form DepartemenKaryawanAddFrame
     */
    public DepartemenKaryawanAddFrame() {
        initComponents();
        memanggilIdKaryawan();
        memanggilIdDepartemen();
        ubahButton.setEnabled(false);
               
}
    public void memanggilIdKaryawan() {
    try {
        Connection koneksi = Basisdata.getConnection();
        String findSQL = "SELECT id_karyawan FROM karyawan";
        Statement statement = koneksi.createStatement();
        ResultSet resultSet = statement.executeQuery(findSQL);
        while (resultSet.next()) {
            idKaryawanComboBox.addItem(Integer.toString(resultSet.getInt("id_karyawan")));
        }
        koneksi.close();
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }

    // Hapus index 0 dari ComboBox
    
}
    public void memanggilIdDepartemen() {
   
    try {
        Connection koneksi = Basisdata.getConnection();
        String findSQL = "SELECT id_departemen from departemen";
        Statement statement = koneksi.createStatement();
        ResultSet resultSet = statement.executeQuery(findSQL);
        while (resultSet.next()) {
            idDepartemenComboBox.addItem(Integer.toString(resultSet.getInt("id_departemen")));
        }
        koneksi.close();
    } catch (SQLException ex) {
        System.err.println(ex.getMessage());
    }
    
}
    public DepartemenKaryawanAddFrame(int id_karyawan) {
        initComponents();
        memanggilIdKaryawan();
        memanggilIdDepartemen();
        idKaryawanComboBox.setEnabled(false);
        idDepartemenComboBox.setEnabled(false);
        simpanButton.setEnabled(false);
        try {
            Connection koneksi = Basisdata.getConnection();
            String findSQL = "SELECT * FROM departemen_karyawan WHERE id_karyawan=" + id_karyawan;
            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(findSQL);
            while(resultSet.next()){
                idKaryawanComboBox.setSelectedItem(Integer.toString(resultSet.getInt("id_karyawan")));
                idDepartemenComboBox.setSelectedItem(Integer.toString(resultSet.getInt("id_departemen")));
                dariTanggalDatePicker.setDate(resultSet.getDate("dari_tanggal"));
                sampaiTanggalDatePicker.setDate(resultSet.getDate("sampai_tanggal"));
            }
            koneksi.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        simpanButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dariTanggalDatePicker = new org.jdesktop.swingx.JXDatePicker();
        sampaiTanggalDatePicker = new org.jdesktop.swingx.JXDatePicker();
        idKaryawanComboBox = new javax.swing.JComboBox<>();
        idDepartemenComboBox = new javax.swing.JComboBox<>();
        ubahButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judulLabel.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        judulLabel.setForeground(new java.awt.Color(0, 153, 0));
        judulLabel.setText("Tambah Data Departemen Karyawan");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Pilih ID Karyawan");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("Pilih ID Departemen");

        simpanButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        simpanButton.setForeground(new java.awt.Color(0, 153, 51));
        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        batalButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        batalButton.setForeground(new java.awt.Color(0, 153, 51));
        batalButton.setText("Batal");
        batalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Dari Tanggal");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Sampai Tanggal");

        idKaryawanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idKaryawanComboBoxActionPerformed(evt);
            }
        });

        ubahButton.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ubahButton.setForeground(new java.awt.Color(0, 153, 51));
        ubahButton.setText("Ubah");
        ubahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(judulLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(batalButton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sampaiTanggalDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(idDepartemenComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idKaryawanComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dariTanggalDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(simpanButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ubahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(judulLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idKaryawanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idDepartemenComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dariTanggalDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sampaiTanggalDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanButton)
                    .addComponent(ubahButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(batalButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        Date selectedDateDariTanggal = dariTanggalDatePicker.getDate();
        Date selectedDateSampaiTanggal = sampaiTanggalDatePicker.getDate();
        if (selectedDateDariTanggal == null || selectedDateSampaiTanggal == null) {
    JOptionPane.showMessageDialog(null, "Data Belum Lengkap");
    return;
}
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDateDariTanggal = sdf1.format(selectedDateDariTanggal);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDateSampaiTanggal = sdf2.format(selectedDateSampaiTanggal);
        try {
    Connection koneksi = Basisdata.getConnection();
    String id_karyawan = idKaryawanComboBox.getSelectedItem().toString();
    String id_departemen = idDepartemenComboBox.getSelectedItem().toString();
    

    String checkSQL = "SELECT id_karyawan FROM departemen_karyawan WHERE id_karyawan =" + id_karyawan;
    Statement checkStatement = koneksi.createStatement();
    ResultSet checkResult = checkStatement.executeQuery(checkSQL);

                  
    if(!checkResult.next()){
       String insertSQL = "INSERT INTO departemen_karyawan (id_karyawan, id_departemen, dari_tanggal, sampai_tanggal ) " +
    "VALUES ('" +  id_karyawan + "', '" +  id_departemen + "', '" + formattedDateDariTanggal + "', '" + formattedDateSampaiTanggal + "')";
Statement insertStatement = koneksi.createStatement();
insertStatement.executeUpdate(insertSQL);
    koneksi.close();
    dispose(); 
    }else{
           JOptionPane.showMessageDialog(null, "Karyawan sudah ada!");
    }
    

} catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        dispose();
    }//GEN-LAST:event_batalButtonActionPerformed

    private void idKaryawanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idKaryawanComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idKaryawanComboBoxActionPerformed

    private void ubahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahButtonActionPerformed
        Date selectedDateDariTanggal = dariTanggalDatePicker.getDate();
        Date selectedDateSampaiTanggal = sampaiTanggalDatePicker.getDate();
        if (selectedDateDariTanggal == null || selectedDateSampaiTanggal == null) {
    JOptionPane.showMessageDialog(null, "Data Belum Lengkap");
    return;
}
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDateDariTanggal = sdf1.format(selectedDateDariTanggal);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDateSampaiTanggal = sdf2.format(selectedDateSampaiTanggal);
        try {
    Connection koneksi = Basisdata.getConnection();
    String id_karyawan = idKaryawanComboBox.getSelectedItem().toString();
    String id_departemen = idDepartemenComboBox.getSelectedItem().toString();
String updateSQL = "UPDATE departemen_karyawan SET " +
    "dari_tanggal = ?, " +
    "sampai_tanggal = ? " +
    "WHERE id_karyawan = ? AND id_departemen = ?";
PreparedStatement preparedStatement = koneksi.prepareStatement(updateSQL);
preparedStatement.setString(1, formattedDateDariTanggal);
preparedStatement.setString(2, formattedDateSampaiTanggal);
preparedStatement.setString(3, id_karyawan);
preparedStatement.setString(4, id_departemen);
preparedStatement.executeUpdate();
        koneksi.close();
    dispose();
    
} catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_ubahButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DepartemenKaryawanAddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartemenKaryawanAddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartemenKaryawanAddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartemenKaryawanAddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartemenKaryawanAddFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalButton;
    private org.jdesktop.swingx.JXDatePicker dariTanggalDatePicker;
    private javax.swing.JComboBox<String> idDepartemenComboBox;
    private javax.swing.JComboBox<String> idKaryawanComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel judulLabel;
    private org.jdesktop.swingx.JXDatePicker sampaiTanggalDatePicker;
    private javax.swing.JButton simpanButton;
    private javax.swing.JButton ubahButton;
    // End of variables declaration//GEN-END:variables
}
