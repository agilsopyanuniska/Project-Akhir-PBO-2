package com.mycompany.manajemenkaryawan.db.frames.karyawan;

import com.mycompany.manajemenkaryawan.db.Basisdata;
import java.sql.Connection;
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
public class KaryawanAddFrame extends javax.swing.JFrame {

    /**
     * Creates new form KaryawanAddFrame
     */
    public KaryawanAddFrame() {
        initComponents();
        idKaryawanTextField.setEnabled(false);
    }
    public KaryawanAddFrame(int id_karyawan) {
        initComponents();
        idKaryawanTextField.setEnabled(false);
        try {
            Connection koneksi = Basisdata.getConnection();
            String findSQL = "SELECT * FROM karyawan WHERE id_karyawan="+id_karyawan;
            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(findSQL);
            while(resultSet.next()){
                idKaryawanTextField.setText(resultSet.getString("id_karyawan"));
                tanggalLahirDatePicker.setDate(resultSet.getDate("tanggal_lahir"));
                namaDepanTextField.setText(resultSet.getString("nama_depan"));
                namaBelakangTextField.setText(resultSet.getString("nama_belakang"));
                genderComboBox.setSelectedItem(resultSet.getString("gender"));
                tanggalMasukDatePicker.setDate(resultSet.getDate("tanggal_masuk"));
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
        idKaryawanTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        simpanButton = new javax.swing.JButton();
        batalButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        namaDepanTextField = new javax.swing.JTextField();
        namaBelakangTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        tanggalMasukDatePicker = new org.jdesktop.swingx.JXDatePicker();
        tanggalLahirDatePicker = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judulLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        judulLabel.setForeground(new java.awt.Color(0, 153, 0));
        judulLabel.setText("Tambah Data Karyawan");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("ID Karyawan");

        idKaryawanTextField.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("Tanggal Lahir");

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
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("Nama Depan");

        namaDepanTextField.setBackground(new java.awt.Color(204, 255, 204));
        namaDepanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaDepanTextFieldActionPerformed(evt);
            }
        });

        namaBelakangTextField.setBackground(new java.awt.Color(204, 255, 204));
        namaBelakangTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaBelakangTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setText("Nama Belakang");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Pilih Gender");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("Tanggal Masuk");

        genderComboBox.setBackground(new java.awt.Color(204, 255, 204));
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L", "P" }));

        tanggalMasukDatePicker.setBackground(new java.awt.Color(204, 255, 204));

        tanggalLahirDatePicker.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(simpanButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(batalButton)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tanggalMasukDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idKaryawanTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(namaDepanTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(namaBelakangTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(genderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tanggalLahirDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(5, 5, 5))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(judulLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulLabel)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idKaryawanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tanggalLahirDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaDepanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaBelakangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tanggalMasukDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpanButton)
                    .addComponent(batalButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        Date selectedDateTanggalLahir = tanggalLahirDatePicker.getDate();
        Date selectedDateTanggalMasuk = tanggalMasukDatePicker.getDate();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDateTanggalLahir = sdf1.format(selectedDateTanggalLahir);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDateTanggalMasuk = sdf2.format(selectedDateTanggalMasuk);
        
        if(namaDepanTextField.getText().equals("") || namaBelakangTextField.getText().equals("") || genderComboBox.getSelectedItem() == null || tanggalLahirDatePicker.getDate() == null || tanggalMasukDatePicker.getDate() == null){
    JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!");
} else if(idKaryawanTextField.getText().equals("")){
            try {
                
                Connection koneksi = Basisdata.getConnection();
               String insertSQL = "INSERT INTO karyawan SET " +
"tanggal_lahir = '" + formattedDateTanggalLahir +"'," +
"nama_depan = '" + namaDepanTextField.getText() +"'," +
"nama_belakang = '" + namaBelakangTextField.getText() +"'," +
"gender = '" + genderComboBox.getSelectedItem() +"'," +
"tanggal_masuk = '" + formattedDateTanggalMasuk +"'";
                Statement statement = koneksi.createStatement();
                statement.executeUpdate(insertSQL);
                koneksi.close();
                dispose();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        } 
        else {
            try {
                Connection koneksi = Basisdata.getConnection();
                String updateSQL = "UPDATE karyawan SET " +
"tanggal_lahir = '" + formattedDateTanggalLahir +"'," +
"nama_depan = '" + namaDepanTextField.getText() +"'," +
"nama_belakang = '" + namaBelakangTextField.getText() +"'," +
"gender = '" + genderComboBox.getSelectedItem() +"'," +
"tanggal_masuk = '" + formattedDateTanggalMasuk +"' " +
"WHERE id_karyawan = " + idKaryawanTextField.getText();
                Statement statement = koneksi.createStatement();
                statement.executeUpdate(updateSQL);
                koneksi.close();
                dispose();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
//        if(idKaryawanTextField.getText().equals("")){
//            try {
//                
//                Connection koneksi = Basisdata.getConnection();
//               String insertSQL = "INSERT INTO karyawan SET " +
//"tanggal_lahir = '" + formattedDateTanggalLahir +"'," +
//"nama_depan = '" + namaDepanTextField.getText() +"'," +
//"nama_belakang = '" + namaBelakangTextField.getText() +"'," +
//"gender = '" + genderComboBox.getSelectedItem() +"'," +
//"tanggal_masuk = '" + formattedDateTanggalMasuk +"'";
//                Statement statement = koneksi.createStatement();
//                statement.executeUpdate(insertSQL);
//                koneksi.close();
//                dispose();
//            } catch (SQLException ex) {
//                System.err.println(ex.getMessage());
//            }
//        } 
//        else {
//            try {
//                Connection koneksi = Basisdata.getConnection();
//                String updateSQL = "UPDATE karyawan SET " +
//"tanggal_lahir = '" + formattedDateTanggalLahir +"'," +
//"nama_depan = '" + namaDepanTextField.getText() +"'," +
//"nama_belakang = '" + namaBelakangTextField.getText() +"'," +
//"gender = '" + genderComboBox.getSelectedItem() +"'," +
//"tanggal_masuk = '" + formattedDateTanggalMasuk +"' " +
//"WHERE id_karyawan = " + idKaryawanTextField.getText();
//                Statement statement = koneksi.createStatement();
//                statement.executeUpdate(updateSQL);
//                koneksi.close();
//                dispose();
//            } catch (SQLException ex) {
//                System.err.println(ex.getMessage());
//            }
//        }
        
        

    }//GEN-LAST:event_simpanButtonActionPerformed

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        dispose();
    }//GEN-LAST:event_batalButtonActionPerformed

    private void namaDepanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaDepanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaDepanTextFieldActionPerformed

    private void namaBelakangTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaBelakangTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaBelakangTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(KaryawanAddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaryawanAddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaryawanAddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaryawanAddFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KaryawanAddFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batalButton;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JTextField idKaryawanTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JTextField namaBelakangTextField;
    private javax.swing.JTextField namaDepanTextField;
    private javax.swing.JButton simpanButton;
    private org.jdesktop.swingx.JXDatePicker tanggalLahirDatePicker;
    private org.jdesktop.swingx.JXDatePicker tanggalMasukDatePicker;
    // End of variables declaration//GEN-END:variables
}
