/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Aplikasi;
import Model.Jadwal;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dhino
 */
public class halamanMilihShiftJadwal1 extends javax.swing.JFrame implements ActionListener {

    Aplikasi model;
    Pasien pasien;
    Jadwal jadwal;

    /**
     * Creates new form halamanMilihShiftJadwal
     */
    public halamanMilihShiftJadwal1(Aplikasi model, Pasien pasien) {
        initComponents();
        this.model = model;
        this.setLocationRelativeTo(null);
        this.setTitle("Halaman Milih Shift Jadwal");
        this.setjLabel_NamaPasien(pasien.getNamaPasien());
        this.setVisible(true);
        this.addListener(this);
        this.jadwal = null;
        this.pasien = pasien;

        DefaultTableModel dm = (DefaultTableModel) this.getjTable_shiftDokter().getModel();
        Object rowData[] = new Object[3];
        ArrayList<Jadwal> jdw = model.getDb().getAllJadwal();
        for (int i = 0; i < jdw.size(); i++) {
            rowData[0] = jdw.get(i).getShift();
            rowData[1] = jdw.get(i).getTanggal();
            rowData[2] = jdw.get(i).getKodeDokter();
            dm.addRow(rowData);
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

        jLabel_NamaPasien = new javax.swing.JLabel();
        jLabel_Pasien = new javax.swing.JLabel();
        jButton_LogOut = new javax.swing.JButton();
        jButton_MelihatShiftDokter = new javax.swing.JButton();
        jPanel_foto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_shiftDokter = new javax.swing.JTable();
        jLabel_shiftDokter = new javax.swing.JLabel();
        jButton_Pilih = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_NamaPasien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_NamaPasien.setText("Nama Pasien");

        jLabel_Pasien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Pasien.setText("PASIEN");

        jButton_LogOut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_LogOut.setText("LogOut");

        jButton_MelihatShiftDokter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MelihatShiftDokter.setText("Melihat Shift Dokter");

        javax.swing.GroupLayout jPanel_fotoLayout = new javax.swing.GroupLayout(jPanel_foto);
        jPanel_foto.setLayout(jPanel_fotoLayout);
        jPanel_fotoLayout.setHorizontalGroup(
            jPanel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        jPanel_fotoLayout.setVerticalGroup(
            jPanel_fotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        jTable_shiftDokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shift", "Tanggal", "Dokter"
            }
        ));
        jScrollPane1.setViewportView(jTable_shiftDokter);
        if (jTable_shiftDokter.getColumnModel().getColumnCount() > 0) {
            jTable_shiftDokter.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel_shiftDokter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_shiftDokter.setText("SHIFT DOKTER");

        jButton_Pilih.setText("Pilih");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_Pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jPanel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_NamaPasien)
                                    .addComponent(jLabel_Pasien)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton_MelihatShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_shiftDokter))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel_Pasien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_NamaPasien))
                            .addComponent(jPanel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_MelihatShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel_shiftDokter)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton_Pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjButton_LogOut() {
        return jButton_LogOut;
    }

    public JButton getjButton_MelihatShiftDokter() {
        return jButton_MelihatShiftDokter;
    }

    public JTable getjTable_shiftDokter() {
        return jTable_shiftDokter;
    }

    public void setjTable_shiftDokter(JTable jTable_shiftDokter) {
        this.jTable_shiftDokter = jTable_shiftDokter;
    }

    public JButton getjButton_Pilih() {
        return jButton_Pilih;
    }

    public void setjLabel_NamaPasien(String jLabel_NamaPasien) {
        this.jLabel_NamaPasien.setText(jLabel_NamaPasien);
    }

    public void addListener(ActionListener e) {
        jButton_LogOut.addActionListener(e);
        jButton_MelihatShiftDokter.addActionListener(e);
        jButton_Pilih.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LogOut;
    private javax.swing.JButton jButton_MelihatShiftDokter;
    private javax.swing.JButton jButton_Pilih;
    private javax.swing.JLabel jLabel_NamaPasien;
    private javax.swing.JLabel jLabel_Pasien;
    private javax.swing.JLabel jLabel_shiftDokter;
    private javax.swing.JPanel jPanel_foto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_shiftDokter;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(this.getjButton_MelihatShiftDokter())) {
            //do nothing
        } else if (source.equals(this.getjButton_LogOut())) {
            new PoliklinikTelkom(model);
            this.dispose();
        } else if (source.equals(this.getjButton_Pilih())) {
            jadwal = new Jadwal();
            jadwal = model.getDb().getJadwal("JADWAL" + (this.getjTable_shiftDokter().getSelectedRow()+1));
            jadwal.setKodePasien(pasien.getKodePasien());
            model.getDb().pilihJadwal(jadwal, pasien);
            new halamanMilihShiftJadwal2(model, pasien, jadwal);
            this.dispose();
        }
    }
}
