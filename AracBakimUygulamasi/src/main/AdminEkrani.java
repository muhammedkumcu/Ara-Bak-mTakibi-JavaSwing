package main;


import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import static main.Islemler.globalUserList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

public class AdminEkrani extends javax.swing.JDialog {

    DefaultTableModel model;
    Islemler islemler = new Islemler();
    
    /**
     * Creates new form AdminEkrani
     */
    public AdminEkrani() {
        initComponents();
        model = (DefaultTableModel) kullanici_tablosu.getModel();
        kullanicilariTabloyaEkle();  // Kullanıcıları tabloya ekleyin
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kullanici_tablosu = new javax.swing.JTable();
        sil_butonu = new javax.swing.JButton();
        mesaj_alani = new javax.swing.JLabel();
        arama_cubugu = new javax.swing.JTextField();
        ad_alani = new javax.swing.JTextField();
        soyad_alani = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ekle_butonu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        model_alani = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kullanici_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ad", "Soyad", "Araç"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        kullanici_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kullanici_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kullanici_tablosu);
        if (kullanici_tablosu.getColumnModel().getColumnCount() > 0) {
            kullanici_tablosu.getColumnModel().getColumn(0).setResizable(false);
            kullanici_tablosu.getColumnModel().getColumn(1).setResizable(false);
            kullanici_tablosu.getColumnModel().getColumn(2).setResizable(false);
        }

        sil_butonu.setBackground(new java.awt.Color(255, 51, 51));
        sil_butonu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sil_butonu.setText("Sil");
        sil_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_butonuActionPerformed(evt);
            }
        });

        arama_cubugu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                arama_cubuguMouseReleased(evt);
            }
        });
        arama_cubugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arama_cubuguActionPerformed(evt);
            }
        });
        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        ad_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad_alaniActionPerformed(evt);
            }
        });

        jLabel1.setText("Soyad :");

        jLabel2.setText("Ad :");

        ekle_butonu.setText("Ekle");
        ekle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekle_butonuActionPerformed(evt);
            }
        });

        jLabel3.setText("Kullanıcı Ekle");

        model_alani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                model_alaniActionPerformed(evt);
            }
        });

        jLabel4.setText("Model:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(sil_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(model_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(arama_cubugu)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(36, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mesaj_alani)))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(ekle_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(mesaj_alani)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(soyad_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(model_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ekle_butonu)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sil_butonu)
                .addGap(16, 16, 16))
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
    }// </editor-fold>//GEN-END:initComponents

    
    private void kullanicilariTabloyaEkle() {
        model.setRowCount(0); // Tüm satırları kaldır
        
    // globalUserList'teki her kullanıcıyı tabloya ekleyin
    for (Kullanici kullanici : globalUserList) {
        model.addRow(new Object[]{kullanici.getAd(), kullanici.getSoyad(), kullanici.getModel()});
    }
}
    private void sil_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_butonuActionPerformed
        int selectedRow = kullanici_tablosu.getSelectedRow();
        if (selectedRow != -1) {
            // Kullanıcıyı globalUserList'ten kaldır
            String ad = (String) model.getValueAt(selectedRow, 0);
            String soyad = (String) model.getValueAt(selectedRow, 1);
            
            globalUserList.removeIf(k -> k.getAd().equals(ad) && k.getSoyad().equals(soyad));
            islemler.dosyaYazdirmaKB();
            
            // Kullanıcıyı tablodan kaldır
            model.removeRow(selectedRow);
        }
    }//GEN-LAST:event_sil_butonuActionPerformed

    
    
    
    private void arama_cubuguMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arama_cubuguMouseReleased
   
    }//GEN-LAST:event_arama_cubuguMouseReleased

    private void arama_cubuguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arama_cubuguActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arama_cubuguActionPerformed

    private void ekle_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekle_butonuActionPerformed
        String ad = ad_alani.getText();
    String soyad = soyad_alani.getText();
    String model = model_alani.getText();
    
    // ArabaBakimBilgileri'ni ilgili model için oluştur
    ArabaBakimBilgileri bakimBilgileri = new ArabaBakimBilgileri(model);
    
    // Araba modeline göre bakım bilgilerini ekleyin
    switch (model) {
        case "Toyota Corolla":
                bakimBilgileri.setBakimBilgisi("Yağ Değişim", 6);
                bakimBilgileri.setBakimBilgisi("Filtre Değişim", 12);
                bakimBilgileri.setBakimBilgisi("Lastik Rotasyonu", 9);
                bakimBilgileri.setBakimBilgisi("Fren Balata Değişimi", 24);
                bakimBilgileri.setBakimBilgisi("Akü Değişimi", 30);
                break;
            case "Honda Civic":
                bakimBilgileri.setBakimBilgisi("Yağ Değişim", 5);
                bakimBilgileri.setBakimBilgisi("Filtre Değişim", 11);
                bakimBilgileri.setBakimBilgisi("Lastik Rotasyonu", 8);
                bakimBilgileri.setBakimBilgisi("Fren Balata Değişimi", 20);
                bakimBilgileri.setBakimBilgisi("Akü Değişimi", 36);
                break;
            case "Volkswagen Golf":
                bakimBilgileri.setBakimBilgisi("Yağ Değişim", 5);
                bakimBilgileri.setBakimBilgisi("Filtre Değişim", 10);
                bakimBilgileri.setBakimBilgisi("Lastik Rotasyonu", 9);
                bakimBilgileri.setBakimBilgisi("Fren Balata Değişimi", 24);
                bakimBilgileri.setBakimBilgisi("Akü Değişimi", 28);
                break;
            case "Ford Focus":
                bakimBilgileri.setBakimBilgisi("Yağ Değişim", 6);
                bakimBilgileri.setBakimBilgisi("Filtre Değişim", 14);
                bakimBilgileri.setBakimBilgisi("Lastik Rotasyonu", 11);
                bakimBilgileri.setBakimBilgisi("Fren Balata Değişimi", 24);
                bakimBilgileri.setBakimBilgisi("Akü Değişimi", 30);
                break;
            case "Chevrolet Cruze":
                bakimBilgileri.setBakimBilgisi("Yağ Değişim", 8);
                bakimBilgileri.setBakimBilgisi("Filtre Değişim", 14);
                bakimBilgileri.setBakimBilgisi("Lastik Rotasyonu", 9);
                bakimBilgileri.setBakimBilgisi("Fren Balata Değişimi", 28);
                bakimBilgileri.setBakimBilgisi("Akü Değişimi", 30);
                break;
            case "BMW 320":
                bakimBilgileri.setBakimBilgisi("Yağ Değişim", 7);
                bakimBilgileri.setBakimBilgisi("Filtre Değişim", 16);
                bakimBilgileri.setBakimBilgisi("Lastik Rotasyonu", 14);
                bakimBilgileri.setBakimBilgisi("Fren Balata Değişimi", 20);
                bakimBilgileri.setBakimBilgisi("Akü Değişimi", 34);
                break;
            case "Renault Kangoo":
                bakimBilgileri.setBakimBilgisi("Yağ Değişim", 6);
                bakimBilgileri.setBakimBilgisi("Filtre Değişim", 14);
                bakimBilgileri.setBakimBilgisi("Lastik Rotasyonu", 10);
                bakimBilgileri.setBakimBilgisi("Fren Balata Değişimi", 18);
                bakimBilgileri.setBakimBilgisi("Akü Değişimi", 30);
                break;
            case "Audi A4":
                bakimBilgileri.setBakimBilgisi("Yağ Değişim", 5);
                bakimBilgileri.setBakimBilgisi("Filtre Değişim", 14);
                bakimBilgileri.setBakimBilgisi("Lastik Rotasyonu", 10);
                bakimBilgileri.setBakimBilgisi("Fren Balata Değişimi", 24);
                bakimBilgileri.setBakimBilgisi("Akü Değişimi", 30);
                break;
            case "Hyundai Elantra":
                bakimBilgileri.setBakimBilgisi("Yağ Değişim", 7);
                bakimBilgileri.setBakimBilgisi("Filtre Değişim", 9);
                bakimBilgileri.setBakimBilgisi("Lastik Rotasyonu", 12);
                bakimBilgileri.setBakimBilgisi("Fren Balata Değişimi", 20);
                bakimBilgileri.setBakimBilgisi("Akü Değişimi", 30);
                break;
            case "Kia Optima":
                bakimBilgileri.setBakimBilgisi("Yağ Değişim", 6);
                bakimBilgileri.setBakimBilgisi("Filtre Değişim", 12);
                bakimBilgileri.setBakimBilgisi("Lastik Rotasyonu", 10);
                bakimBilgileri.setBakimBilgisi("Fren Balata Değişimi", 26);
                bakimBilgileri.setBakimBilgisi("Akü Değişimi", 40);
                break;
        // Diğer araba modelleri ve bakim bilgilerini ekleyin
        default:
            // Varsayılan bakım bilgileri ekleyin veya hata fırlatın
            break;
    }
    
    // Kullanici nesnesi oluştur ve bakım bilgilerini ekleyin
    Kullanici kullanici = new Kullanici(ad, soyad, model, bakimBilgileri.getBakimBilgileri());

    globalUserList.add(kullanici);
    islemler.dosyaYazdirmaKB();
    kullanicilariTabloyaEkle();
    }//GEN-LAST:event_ekle_butonuActionPerformed

    
    public void dinamikAra(String ara){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        kullanici_tablosu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
        String ara = arama_cubugu.getText();
        dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void ad_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ad_alaniActionPerformed

    private void kullanici_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kullanici_tablosuMouseClicked
        

    }//GEN-LAST:event_kullanici_tablosuMouseClicked

    private void model_alaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_model_alaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_model_alaniActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_alani;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton ekle_butonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable kullanici_tablosu;
    private javax.swing.JLabel mesaj_alani;
    private javax.swing.JTextField model_alani;
    private javax.swing.JButton sil_butonu;
    private javax.swing.JTextField soyad_alani;
    // End of variables declaration//GEN-END:variables

    private Kullanici Kullanici(String ad, String soyad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
