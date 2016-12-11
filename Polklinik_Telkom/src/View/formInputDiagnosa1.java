/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Aplikasi;
import Model.Dokter;
import Model.Jadwal;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ganis
 */
public class formInputDiagnosa1 extends javax.swing.JFrame implements ActionListener {

    Aplikasi model;
    Dokter dokter;
    Pasien pasien;

    /**
     * Creates new form formInputDiagnosa1
     */
    public formInputDiagnosa1(Aplikasi model, Dokter dokter) {
        initComponents();
        this.model = model;
        this.dokter = dokter;
        this.pasien = new Pasien();
        this.setLocationRelativeTo(null);
        this.setTitle("Halaman Input Diagnosa");
        this.setjLabel_NamaDokter1(dokter.getNamaDokter());
        this.setVisible(true);
        this.addListener(this);

        DefaultTableModel dm = (DefaultTableModel) this.getjTable1().getModel();
        Object rowData[] = new Object[3];
        ArrayList<Jadwal> jad = model.getDb().getAllJadwal();
        if (jad.size() == 0) {
            rowData[0] = " - ";
            rowData[1] = " - ";
            rowData[2] = " - ";
            dm.addRow(rowData);
        } else {
            for (int i = 0; i < jad.size(); i++) {
                if ((jad.get(i).getKodeDokter().equals(dokter.getKodeDokter())) && jad.get(i).getKodePasien() != null) {
                    rowData[0] = jad.get(i).getShift();
                    rowData[1] = jad.get(i).getTanggal();
                    rowData[2] = jad.get(i).getKodePasien();
                    dm.addRow(rowData);
                }
            }
        }
    }

    public void addListener(ActionListener e) {
        jButton_LogOut.addActionListener(e);
        jButton_MelihatJadwalPeriksa.addActionListener(e);
        jButton_MenginputDiagnosa.addActionListener(e);
        jButton_MenginputObat.addActionListener(e);
        jButton1_pilih.addActionListener(e);
    }

    public void addAdapter(MouseListener e) {
        jTable1.addMouseListener(e);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_MelihatJadwalPeriksa = new javax.swing.JButton();
        jButton_MenginputObat = new javax.swing.JButton();
        jButton_MenginputDiagnosa = new javax.swing.JButton();
        jButton_LogOut = new javax.swing.JButton();
        jLabel_Dokter = new javax.swing.JLabel();
        jPanel_foto = new javax.swing.JPanel();
        jLabel_DataPAsien = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_NamaDokter1 = new javax.swing.JLabel();
        jButton1_pilih = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jButton_MelihatJadwalPeriksa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MelihatJadwalPeriksa.setText("Melihat Jadwal Periksa");

        jButton_MenginputObat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MenginputObat.setText("Menginput Obat");

        jButton_MenginputDiagnosa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MenginputDiagnosa.setText("Menginput Diagnosa");

        jButton_LogOut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_LogOut.setText("LogOut");

        jLabel_Dokter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Dokter.setText("DOKTER");

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

        jLabel_DataPAsien.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_DataPAsien.setText("DATA PASIEN");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Shift", "Tanggal", "Kode Pasien"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel_NamaDokter1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_NamaDokter1.setText("Nama Dokter");

        jButton1_pilih.setText("Pilih");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jPanel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Dokter)
                                    .addComponent(jLabel_NamaDokter1)))
                            .addComponent(jButton_MelihatJadwalPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_MenginputObat, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_MenginputDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel_DataPAsien))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel_Dokter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_NamaDokter1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(jButton_MenginputDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_MenginputObat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_MelihatJadwalPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel_DataPAsien)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setjLabel_NamaDokter1(String jLabel_NamaDokter1) {
        this.jLabel_NamaDokter1.setText(jLabel_NamaDokter1);
    }

    public Dokter getDokter() {
        return dokter;
    }

    public JButton getjButton1_pilih() {
        return jButton1_pilih;
    }

    public JButton getjButton_LogOut() {
        return jButton_LogOut;
    }

    public JButton getjButton_MelihatJadwalPeriksa() {
        return jButton_MelihatJadwalPeriksa;
    }

    public JButton getjButton_MenginputDiagnosa() {
        return jButton_MenginputDiagnosa;
    }

    public JButton getjButton_MenginputObat() {
        return jButton_MenginputObat;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_pilih;
    private javax.swing.JButton jButton_LogOut;
    private javax.swing.JButton jButton_MelihatJadwalPeriksa;
    private javax.swing.JButton jButton_MenginputDiagnosa;
    private javax.swing.JButton jButton_MenginputObat;
    private javax.swing.JLabel jLabel_DataPAsien;
    private javax.swing.JLabel jLabel_Dokter;
    private javax.swing.JLabel jLabel_NamaDokter1;
    private javax.swing.JPanel jPanel_foto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(this.getjButton_LogOut())) {
            new PoliklinikTelkom(model);
            this.dispose();
        } else if (source.equals(this.getjButton_MelihatJadwalPeriksa())) {
            new halamanViewJadwalPeriksaDokter(model, dokter);
            this.dispose();
        } else if (source.equals(this.getjButton_MenginputDiagnosa())) {
            new formInputDiagnosa1(model, dokter);
            this.dispose();
        } else if (source.equals(this.getjButton_MenginputObat())) {
            new formInputObat1(model, dokter);
            this.dispose();
        } else if (source.equals(this.getjButton1_pilih())) {
            pasien = model.getDb().getPasien((String) this.getjTable1().getValueAt(this.getjTable1().getSelectedRow(), 2));
            new formInputDiagnosa2(model, dokter, pasien);
            this.dispose();
        }
    }
}
