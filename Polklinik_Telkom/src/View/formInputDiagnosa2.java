/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Aplikasi;
import Model.Dokter;
import Model.Jadwal;
import Model.Obat;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Dhino
 */
public class formInputDiagnosa2 extends javax.swing.JFrame implements ActionListener {
    Aplikasi model;
    Dokter dokter;
    Pasien pasien;
    /**
     * Creates new form formInputDiagnosa2
     */
    public formInputDiagnosa2(Aplikasi model, Dokter dokter, Pasien pasien) {
        initComponents();
        this.model = model;
        this.dokter = dokter;
        this.pasien = pasien;
        this.setLocationRelativeTo(null);
        this.setTitle("Halaman Input Diagnosa");
        this.setjLabel_NamaDokter(dokter.getNamaDokter());
        this.setjLabel_namatext(pasien.getNamaPasien());
        this.setjLabel_umurtext(pasien.getUmur());
        this.setjLabel_kodepasientext(pasien.getKodePasien());
        this.setjTextArea_keluhan(pasien.getKeluhan());
        this.setjTextArea_diagnosadokter(pasien.getDiagnosa());
        this.setjTextArea_ResepObat(pasien.getKodeObat());
        this.setVisible(true);
        this.addListener(this);
    }

    public void addListener(ActionListener e) {
        jButton_LogOut.addActionListener(e);
        jButton_MelihatJadwalPeriksa.addActionListener(e);
        jButton_MenginputDiagnosa.addActionListener(e);
        jButton_MenginputObat.addActionListener(e);
        jButton_OK.addActionListener(e);
        jButton_kembali.addActionListener(e);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_MenginputObat = new javax.swing.JButton();
        jButton_MelihatJadwalPeriksa = new javax.swing.JButton();
        jButton_MenginputDiagnosa = new javax.swing.JButton();
        jButton_LogOut = new javax.swing.JButton();
        jPanel_foto = new javax.swing.JPanel();
        jLabel_NamaDokter = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_nama = new javax.swing.JLabel();
        jLabel_Umur = new javax.swing.JLabel();
        jLabel_KodePasien = new javax.swing.JLabel();
        jLabel_Keluhan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_keluhan = new javax.swing.JTextArea();
        jLabel_DiagnosDokter = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_diagnosadokter = new javax.swing.JTextArea();
        jLabel_ResepObat = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_ResepObat = new javax.swing.JTextArea();
        jButton_OK = new javax.swing.JButton();
        jButton_kembali = new javax.swing.JButton();
        jLabel_namatext = new javax.swing.JLabel();
        jLabel_umurtext = new javax.swing.JLabel();
        jLabel_kodepasientext = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel_Dokter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_MenginputObat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MenginputObat.setText("Menginput Obat");

        jButton_MelihatJadwalPeriksa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MelihatJadwalPeriksa.setText("Melihat Jadwal Periksa");

        jButton_MenginputDiagnosa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MenginputDiagnosa.setText("Menginput Diagnosa");

        jButton_LogOut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_LogOut.setText("LogOut");

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

        jLabel_NamaDokter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_NamaDokter.setText("Nama Dokter");

        jLabel_nama.setText("Nama :");

        jLabel_Umur.setText("Umur :");

        jLabel_KodePasien.setText("Kode Pasien :");

        jLabel_Keluhan.setText("Keluhan");

        jTextArea_keluhan.setColumns(20);
        jTextArea_keluhan.setRows(5);
        jScrollPane1.setViewportView(jTextArea_keluhan);

        jLabel_DiagnosDokter.setText("Diagnosa Dokter");

        jTextArea_diagnosadokter.setColumns(20);
        jTextArea_diagnosadokter.setRows(5);
        jScrollPane2.setViewportView(jTextArea_diagnosadokter);

        jLabel_ResepObat.setText("Resep Obat");

        jTextArea_ResepObat.setColumns(20);
        jTextArea_ResepObat.setRows(5);
        jScrollPane3.setViewportView(jTextArea_ResepObat);

        jButton_OK.setText("OK");

        jButton_kembali.setText("Kembali");

        jLabel_namatext.setText("jLabel1");

        jLabel_umurtext.setText("jLabel2");

        jLabel_kodepasientext.setText("jLabel3");

        jLabel_Dokter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Dokter.setText("DOKTER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_NamaDokter)
                            .addComponent(jLabel_Dokter)))
                    .addComponent(jButton_MelihatJadwalPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_MenginputObat, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_MenginputDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 675, Short.MAX_VALUE)
                        .addComponent(jButton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Keluhan)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                            .addComponent(jLabel_DiagnosDokter)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel_ResepObat)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_KodePasien)
                                    .addComponent(jLabel_Umur)
                                    .addComponent(jLabel_nama))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_namatext)
                                    .addComponent(jLabel_umurtext)
                                    .addComponent(jLabel_kodepasientext))))))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(306, 306, 306)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1030, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jPanel_foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel_Dokter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_NamaDokter)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jButton_MenginputDiagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_MenginputObat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_MelihatJadwalPeriksa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_nama)
                            .addComponent(jLabel_namatext))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Umur)
                            .addComponent(jLabel_umurtext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_KodePasien)
                            .addComponent(jLabel_kodepasientext))
                        .addGap(56, 56, 56)
                        .addComponent(jLabel_Keluhan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_DiagnosDokter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_ResepObat)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator2)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    public JButton getjButton_OK() {
        return jButton_OK;
    }

    public JButton getjButton_kembali() {
        return jButton_kembali;
    }

    public void setjLabel_NamaDokter(String jLabel_NamaDokter) {
        this.jLabel_NamaDokter.setText(jLabel_NamaDokter);
    }
    
       public JLabel getjLabel_namatext() {
        return jLabel_namatext;
    }

    public void setjLabel_namatext(String jLabel_namatext) {
        this.jLabel_namatext.setText(jLabel_namatext);
    }
    
     public JLabel getjLabel_umurtext() {
        return jLabel_umurtext;
    }

    public void setjLabel_umurtext(int jLabel_umurtext) {
        this.jLabel_umurtext.setText(Integer.toString(jLabel_umurtext));
    }

    public JTextArea getjTextArea_ResepObat() {
        return jTextArea_ResepObat;
    }

    public void setjTextArea_ResepObat(String obat) {
        this.jTextArea_ResepObat.setText(obat);
    }

    public JTextArea getjTextArea_diagnosadokter() {
        return jTextArea_diagnosadokter;
    }

    public void setjTextArea_diagnosadokter(String jTextArea_diagnosadokter) {
        this.jTextArea_diagnosadokter.setText(jTextArea_diagnosadokter);
    }

    public JTextArea getjTextArea_keluhan() {
        return jTextArea_keluhan;
    }

    public void setjTextArea_keluhan(String jTextArea_keluhan) {
        this.jTextArea_keluhan.setText(jTextArea_keluhan);
    }

    public JLabel getjLabel_kodepasientext() {
        return jLabel_kodepasientext;
    }
    
    public void setjLabel_kodepasientext(String jLabel_kodepasientext) {
        this.jLabel_kodepasientext.setText(jLabel_kodepasientext);
    }

 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LogOut;
    private javax.swing.JButton jButton_MelihatJadwalPeriksa;
    private javax.swing.JButton jButton_MenginputDiagnosa;
    private javax.swing.JButton jButton_MenginputObat;
    private javax.swing.JButton jButton_OK;
    private javax.swing.JButton jButton_kembali;
    private javax.swing.JLabel jLabel_DiagnosDokter;
    private javax.swing.JLabel jLabel_Dokter;
    private javax.swing.JLabel jLabel_Keluhan;
    private javax.swing.JLabel jLabel_KodePasien;
    private javax.swing.JLabel jLabel_NamaDokter;
    private javax.swing.JLabel jLabel_ResepObat;
    private javax.swing.JLabel jLabel_Umur;
    private javax.swing.JLabel jLabel_kodepasientext;
    private javax.swing.JLabel jLabel_nama;
    private javax.swing.JLabel jLabel_namatext;
    private javax.swing.JLabel jLabel_umurtext;
    private javax.swing.JPanel jPanel_foto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea_ResepObat;
    private javax.swing.JTextArea jTextArea_diagnosadokter;
    private javax.swing.JTextArea jTextArea_keluhan;
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
        } else if (source.equals(this.getjButton_kembali())) {
            new formInputDiagnosa1(model, dokter);
            this.dispose();
        } else if (source.equals(this.getjButton_OK())) {
            this.pasien.setDiagnosa(getjTextArea_diagnosadokter().getText());
            model.getDb().inputDiagnosa(pasien);
            new formInputDiagnosa1(model, dokter);
            JOptionPane.showMessageDialog(this, "Input diagnosa berhasil");
            this.dispose();
        }
    }
}
