/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tbd;

//import tbd.mapMotor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class mapMotor extends javax.swing.JFrame {

    /**
     * Creates new form mapMotor
     */
    public mapMotor() {
        initComponents();
        Connect();
        //Memanggil method Lokasi kosong
        LokasiKosong();
        //Memanggil method Lokasi Penuh
        LokasiPenuh();
        //Memanggil method Hitung Lokasi Penuh
        HitungLokasiPenuh();
        HitungLokasiKosong();
    }

    // Menyiapkan objek yang diperlukan untuk mengelola database
    Connection conn;
    Statement stmt;
    ResultSet rs;
    PreparedStatement pst;

    //Method Connect ke DB
    public void Connect() {
        String url = "jdbc:jtds:sqlserver://127.0.0.1:1433/SmartParking"; //buka =  nama database yang digunakan 
        try {
            conn = DriverManager.getConnection(url, "kelompok3", "semangat");
        } catch (SQLException ex) {
            Logger.getLogger(mapMotor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTersedia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTerisi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTersedia = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTerisi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mapping Motor");

        jPanel1.setBackground(new java.awt.Color(255, 235, 205));

        jButton1.setBackground(new java.awt.Color(244, 164, 96));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-back-24.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(139, 69, 19));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-motorcycle-48.png"))); // NOI18N
        jLabel1.setText("Mapping Motor");

        txtTersedia.setBackground(new java.awt.Color(255, 248, 220));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(139, 69, 19));
        jLabel3.setText("Terisi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(139, 69, 19));
        jLabel2.setText("Tersedia");

        txtTerisi.setBackground(new java.awt.Color(255, 248, 220));
        txtTerisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerisiActionPerformed(evt);
            }
        });

        jScrollPane1.setToolTipText("");

        jTableTersedia.setBackground(new java.awt.Color(255, 235, 205));
        jTableTersedia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Tersedia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTersedia);

        jScrollPane2.setToolTipText("");

        jTableTerisi.setBackground(new java.awt.Color(255, 235, 205));
        jTableTerisi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Terisi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableTerisi);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTerisi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(txtTersedia, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel1))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTersedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTerisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void LokasiKosong() {
        try {
            pst = conn.prepareStatement("select IDLokasi from Lokasi where Status=? and Keterangan=? ");
            pst.setString(1, "Kosong");
            pst.setString(2, "Motor");
            rs = pst.executeQuery();
            //Deklarasi object yang berperilaku untuk memanggil meta data table
            ResultSetMetaData RSM = rs.getMetaData();
            int c = RSM.getColumnCount();
            DefaultTableModel DF = (DefaultTableModel) jTableTersedia.getModel();
            DF.setRowCount(0);

            //Memasukkan data SQL ke Table GUI
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("IDLokasi"));
                }
                DF.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(mapMotor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void LokasiPenuh() {
        try {
            pst = conn.prepareStatement("select IDLokasi from Lokasi where Status=? and Keterangan=? ");
            pst.setString(1, "Terisi");
            pst.setString(2, "Motor");
            rs = pst.executeQuery();
            //Deklarasi object yang berperilaku untuk memanggil meta data table
            ResultSetMetaData RSM = rs.getMetaData();
            int c = RSM.getColumnCount();
            DefaultTableModel DF = (DefaultTableModel) jTableTerisi.getModel();
            DF.setRowCount(0);

            //Memasukkan data SQL ke Table GUI
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("IDLokasi"));
                }
                DF.addRow(v2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(mapMotor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void HitungLokasiPenuh() {
        try {
            pst = conn.prepareStatement("select count(*) from Lokasi where Status=? and Keterangan=? ");
            pst.setString(1, "Terisi");
            pst.setString(2, "Motor");
            rs = pst.executeQuery();
            rs.next();
            //Memasukkan hasil select ke text box
            txtTerisi.setText(rs.getString(""));
        } catch (SQLException ex) {
            Logger.getLogger(mapMotor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void HitungLokasiKosong() {
        try {
            pst = conn.prepareStatement("select count(*) from Lokasi where Status=? and Keterangan=? ");
            pst.setString(1, "Kosong");
            pst.setString(2, "Motor");
            rs = pst.executeQuery();
            rs.next();
            //Memasukkan hasil select ke text box
            txtTersedia.setText(rs.getString(""));
        } catch (SQLException ex) {
            Logger.getLogger(mapMotor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void txtTerisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTerisiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HalamanUtama Beranda = new HalamanUtama();
        Beranda.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(mapMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mapMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mapMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mapMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mapMotor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTerisi;
    private javax.swing.JTable jTableTersedia;
    private javax.swing.JTextField txtTerisi;
    private javax.swing.JTextField txtTersedia;
    // End of variables declaration//GEN-END:variables
}
