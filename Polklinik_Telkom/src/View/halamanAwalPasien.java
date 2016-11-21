/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Aplikasi;
import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ganis
 */
public class halamanAwalPasien extends javax.swing.JFrame implements ActionListener {
    Aplikasi model;
    Pasien pasien;
    /**
     * Creates new form halamanAwalPasien
     */

    halamanAwalPasien(Aplikasi model, Pasien pasien) {
        initComponents();
        this.model = model;
        this.setLocationRelativeTo(null);
        this.setTitle("Halaman Awal Pasien");
        this.setjLabel_NamaPasien(pasien.getNamaPasien());
        this.setjLabel_Welkom("Selamat Datang "+ pasien.getNamaPasien());
        this.setVisible(true);
        this.addListener(this);
        
        this.pasien = pasien;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_LogOut = new javax.swing.JButton();
        jLabel_Pasien = new javax.swing.JLabel();
        jLabel_NamaPasien = new javax.swing.JLabel();
        jPanel_Foto = new javax.swing.JPanel();
        jLabel_Welkom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton_MelihatShiftDokter = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_LogOut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_LogOut.setText("LogOut");

        jLabel_Pasien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Pasien.setText("PASIEN");

        jLabel_NamaPasien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_NamaPasien.setText("Nama Pasien");

        javax.swing.GroupLayout jPanel_FotoLayout = new javax.swing.GroupLayout(jPanel_Foto);
        jPanel_Foto.setLayout(jPanel_FotoLayout);
        jPanel_FotoLayout.setHorizontalGroup(
            jPanel_FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );
        jPanel_FotoLayout.setVerticalGroup(
            jPanel_FotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        jLabel_Welkom.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel_Welkom.setText("Selamat Datang Nama Pasien");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Silahkan Memilih menu yang telah disediakan");

        jButton_MelihatShiftDokter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_MelihatShiftDokter.setText("Melihat Shift Dokter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_NamaPasien)
                            .addComponent(jLabel_Pasien)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton_MelihatShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel_Welkom)))
                .addGap(202, 202, 202))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel_Pasien)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_NamaPasien))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jPanel_Foto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel_Welkom)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButton_MelihatShiftDokter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 426, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setjLabel_NamaPasien(String jLabel_NamaPasien) {
        this.jLabel_NamaPasien.setText(jLabel_NamaPasien);
    }

    public void setjLabel_Welkom(String jLabel_Welkom) {
        this.jLabel_Welkom.setText(jLabel_Welkom);
    }
    
    public JButton getjButton_LogOut() {
        return jButton_LogOut;
    }

    public JButton getjButton_MelihatShiftDokter() {
        return jButton_MelihatShiftDokter;
    }
    
    public void addListener(ActionListener e) {
        jButton_LogOut.addActionListener(e);
        jButton_MelihatShiftDokter.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LogOut;
    private javax.swing.JButton jButton_MelihatShiftDokter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_NamaPasien;
    private javax.swing.JLabel jLabel_Pasien;
    private javax.swing.JLabel jLabel_Welkom;
    private javax.swing.JPanel jPanel_Foto;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source.equals(this.getjButton_MelihatShiftDokter())) {
            new halamanMilihShiftJadwal1(model, pasien);
            this.dispose();
        } else if (source.equals(this.getjButton_LogOut())) {
            new PoliklinikTelkom(model);
            this.dispose();
        }
    }
}
