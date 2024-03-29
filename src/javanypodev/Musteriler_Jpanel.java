/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanypodev;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ahmet
 */
public class Musteriler_Jpanel extends javax.swing.JPanel {

    ArrayList<Musteri> musteriler;
    Musteri seciliMusteri;
    DefaultTableModel MusterilerModel,HesaplarModel,KartlarModel;
    public Musteriler_Jpanel() {
        initComponents();
        MusterilerModel=(DefaultTableModel) Musteriler_jTable.getModel();
        HesaplarModel=(DefaultTableModel) Hesaplar_jTable.getModel();
        KartlarModel=(DefaultTableModel) Kartlar_jTable.getModel();
    }

    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }

    public void setMusteriler(ArrayList<Musteri> musteriler) {
        this.musteriler = musteriler;
        MusterilerModel.setRowCount(0);
        for(Musteri i:musteriler){
        Object[] addRow={i.getMusteriNumarasi(),i.getAd(),i.getSoyad(),i.getEmail(),i.getTelefonNumarasi()};
        MusterilerModel.addRow(addRow);
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

        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Musteriler_jTable = new javax.swing.JTable();
        VadesizEkle_jButton = new javax.swing.JButton();
        YatirimEkle_jButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        kartLimit_jTextField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        seciliMusteri_jLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Kartlar_jTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Hesaplar_jTable = new javax.swing.JTable();
        HesapSil_jButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

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
        jScrollPane2.setViewportView(jTable1);

        Musteriler_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Müşteri Numarası", "Ad", "Soyad", "Email", "Telefon"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Musteriler_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Musteriler_jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Musteriler_jTable);
        if (Musteriler_jTable.getColumnModel().getColumnCount() > 0) {
            Musteriler_jTable.getColumnModel().getColumn(0).setResizable(false);
            Musteriler_jTable.getColumnModel().getColumn(1).setResizable(false);
            Musteriler_jTable.getColumnModel().getColumn(2).setResizable(false);
            Musteriler_jTable.getColumnModel().getColumn(4).setResizable(false);
        }

        VadesizEkle_jButton.setText("Vadesiz Hesap Ekle");
        VadesizEkle_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VadesizEkle_jButtonActionPerformed(evt);
            }
        });

        YatirimEkle_jButton.setText("Yatırım Hesap Ekle");
        YatirimEkle_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YatirimEkle_jButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Limit:");

        kartLimit_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kartLimit_jTextFieldActionPerformed(evt);
            }
        });

        jButton3.setText("Kredi Kartı Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        seciliMusteri_jLabel.setText("Seçili Müşteri: ");

        Kartlar_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kart No", "Limit", "Güncel Borç", "Kullanilabilir Limit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Kartlar_jTable);
        if (Kartlar_jTable.getColumnModel().getColumnCount() > 0) {
            Kartlar_jTable.getColumnModel().getColumn(0).setResizable(false);
            Kartlar_jTable.getColumnModel().getColumn(1).setResizable(false);
            Kartlar_jTable.getColumnModel().getColumn(2).setResizable(false);
            Kartlar_jTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel4.setText("Hesaplar");

        jLabel1.setText("Kartlar");

        Hesaplar_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "IBAN", "Bakiye", "Hesap Türü"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(Hesaplar_jTable);
        if (Hesaplar_jTable.getColumnModel().getColumnCount() > 0) {
            Hesaplar_jTable.getColumnModel().getColumn(0).setResizable(false);
            Hesaplar_jTable.getColumnModel().getColumn(1).setResizable(false);
            Hesaplar_jTable.getColumnModel().getColumn(2).setResizable(false);
        }

        HesapSil_jButton.setText("Hesap Sil");
        HesapSil_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HesapSil_jButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Kart Sil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Müşteriler (Lütfen müşteri seçiniz!)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(539, 539, 539)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(seciliMusteri_jLabel)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(VadesizEkle_jButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(YatirimEkle_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(64, 64, 64)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                            .addComponent(kartLimit_jTextField)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(HesapSil_jButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(YatirimEkle_jButton)
                                    .addComponent(VadesizEkle_jButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(seciliMusteri_jLabel)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(kartLimit_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(HesapSil_jButton)
                                .addGap(100, 100, 100)))))
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(125, 125, 125))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Musteriler_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Musteriler_jTableMouseClicked
        int selectedRow=Musteriler_jTable.getSelectedRow();
        
        seciliMusteri=musteriler.get(selectedRow);
        seciliMusteri_jLabel.setText("Seçilen Müşteri:"+seciliMusteri.getMusteriNumarasi()+" "+seciliMusteri.getAd()+" "+seciliMusteri.getSoyad());
        HesapListele();
        KartListele();
    }//GEN-LAST:event_Musteriler_jTableMouseClicked

    private void VadesizEkle_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VadesizEkle_jButtonActionPerformed
        if(seciliMusteri!=null){
        VadesizHesap hesap=new VadesizHesap(0);
        seciliMusteri.hesaplar.add(hesap);
        HesapListele();
        }
    }//GEN-LAST:event_VadesizEkle_jButtonActionPerformed

    private void YatirimEkle_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YatirimEkle_jButtonActionPerformed
        if(seciliMusteri!=null){
        YatirimHesabı hesap=new YatirimHesabı(0);
        seciliMusteri.hesaplar.add(hesap);
        HesapListele();
        }
    }//GEN-LAST:event_YatirimEkle_jButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(seciliMusteri!=null){
        KrediKarti kredi=new KrediKarti(Double.valueOf(kartLimit_jTextField.getText()),0);
        seciliMusteri.krediKartlari.add(kredi);
        KartListele();
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    public void KartListele(){
           KartlarModel.setRowCount(0);
        for(KrediKarti i:seciliMusteri.krediKartlari){
        Object[] addRow={i.getKartNumarasi(),i.getLimit(),i.getGuncelBorc(),i.getKullanilabilirLimit()};
        KartlarModel.addRow(addRow);
     
        }
    }
    private void kartLimit_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kartLimit_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kartLimit_jTextFieldActionPerformed

    private void HesapSil_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HesapSil_jButtonActionPerformed
          
        if(Hesaplar_jTable.getSelectedRow()>0){
        JOptionPane.showMessageDialog(this,seciliMusteri.hesapSil(Hesaplar_jTable.getSelectedRow()));
        HesapListele();
        }else{
        JOptionPane.showMessageDialog(this,"Lütfen bir hesabı seçiniz");
        
        }
    }//GEN-LAST:event_HesapSil_jButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                if(Kartlar_jTable.getSelectedRow()>0){
        JOptionPane.showMessageDialog(this,seciliMusteri.krediKartiSil(Kartlar_jTable.getSelectedRow()));
        KartListele();
        }else{
        JOptionPane.showMessageDialog(this,"Lütfen bir kartı seçiniz");
        
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    public void HesapListele(){
        HesaplarModel.setRowCount(0);
        for(BankaHesabi i:seciliMusteri.hesaplar){
        Object[] addRow={i.getIban(),i.getBakiye(),i.getHesapTuru()};
        HesaplarModel.addRow(addRow);
        }
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HesapSil_jButton;
    private javax.swing.JTable Hesaplar_jTable;
    private javax.swing.JTable Kartlar_jTable;
    private javax.swing.JTable Musteriler_jTable;
    private javax.swing.JButton VadesizEkle_jButton;
    private javax.swing.JButton YatirimEkle_jButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kartLimit_jTextField;
    private javax.swing.JLabel seciliMusteri_jLabel;
    // End of variables declaration//GEN-END:variables
}
