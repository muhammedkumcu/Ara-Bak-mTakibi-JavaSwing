package main;

import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static main.Islemler.globalUserList;

public class kullaniciEkrani extends javax.swing.JDialog {

    DefaultTableModel model;
    Islemler islemler = new Islemler();
    
    public kullaniciEkrani(String kullaniciAdi) {
    initComponents();
    model = (DefaultTableModel) bakim_tablosu.getModel();
    // Bakım bilgilerini tabloya yazdırırken kullanıcı adını kullanabilirsiniz
    hosgeldiniz.setText("Hoş Geldiniz " + kullaniciAdi);
    bakimBilgileriniTabloyaYazdir(kullaniciAdi);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arabaAdiKismi = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bakim_tablosu = new javax.swing.JTable();
        ayIlerle_butonu = new javax.swing.JButton();
        bakimi_tamamla_butonu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        mesaj_alani = new javax.swing.JLabel();
        hosgeldiniz = new javax.swing.JLabel();
        adKismi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bakim_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bakım", "Kalan Süre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bakim_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bakim_tablosuMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bakim_tablosuMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(bakim_tablosu);
        if (bakim_tablosu.getColumnModel().getColumnCount() > 0) {
            bakim_tablosu.getColumnModel().getColumn(0).setResizable(false);
            bakim_tablosu.getColumnModel().getColumn(1).setResizable(false);
        }

        ayIlerle_butonu.setText("1 Ay İlerle");
        ayIlerle_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayIlerle_butonuActionPerformed(evt);
            }
        });

        bakimi_tamamla_butonu.setText("Bakımı tamamla");
        bakimi_tamamla_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bakimi_tamamla_butonuActionPerformed(evt);
            }
        });

        jLabel4.setText("Aracınızın Bakım Listesi :");

        hosgeldiniz.setText("Hoşgeldiniz, ");

        adKismi.setText(" ");

        javax.swing.GroupLayout arabaAdiKismiLayout = new javax.swing.GroupLayout(arabaAdiKismi);
        arabaAdiKismi.setLayout(arabaAdiKismiLayout);
        arabaAdiKismiLayout.setHorizontalGroup(
            arabaAdiKismiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arabaAdiKismiLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(arabaAdiKismiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(arabaAdiKismiLayout.createSequentialGroup()
                        .addComponent(hosgeldiniz, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adKismi))
                    .addGroup(arabaAdiKismiLayout.createSequentialGroup()
                        .addGroup(arabaAdiKismiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(arabaAdiKismiLayout.createSequentialGroup()
                                .addComponent(ayIlerle_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bakimi_tamamla_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(mesaj_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(arabaAdiKismiLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        arabaAdiKismiLayout.setVerticalGroup(
            arabaAdiKismiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arabaAdiKismiLayout.createSequentialGroup()
                .addGroup(arabaAdiKismiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(arabaAdiKismiLayout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(mesaj_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(arabaAdiKismiLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(arabaAdiKismiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hosgeldiniz)
                            .addComponent(adKismi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(arabaAdiKismiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(arabaAdiKismiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ayIlerle_butonu)
                    .addComponent(bakimi_tamamla_butonu))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(arabaAdiKismi, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(arabaAdiKismi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bakimBilgileriniTabloyaYazdir(String kullaniciAdi) {
    // Tablo modelini temizle
    model.setRowCount(0);

    // globalUserList'teki her bir kullanıcı için bakım bilgilerini al ve tabloya ekle
    for (Kullanici kullanici : globalUserList) {
        // Kullanıcı adlarını karşılaştırın
        if (kullanici.getAd().equals(kullaniciAdi)) {
            Map<String, Integer> bakimBilgileri = kullanici.getBakimBilgileri();
            for (Map.Entry<String, Integer> entry : bakimBilgileri.entrySet()) {
                model.addRow(new Object[]{entry.getKey(), entry.getValue()});
            }
            // Kullanıcı bulunduğunda işlemi sonlandırın
            return;
            }
        }
    }
    
    private void bakimi_tamamla_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bakimi_tamamla_butonuActionPerformed
         DefaultTableModel model = (DefaultTableModel) bakim_tablosu.getModel();

        // Seçili satırın indeksini al
        int secili_row = bakim_tablosu.getSelectedRow();

        // Seçili satır kontrolü
        if (secili_row == -1) {
            if (bakim_tablosu.getRowCount() == 0) {
                mesaj_alani.setText("Bakım tablosu şu an boş...");
            } else {
                mesaj_alani.setText("Lütfen tamamlanacak bakımı seçin...");
            }
        } else {
            // Seçili satırdaki bakım ismini al
            String bakimIsmi = (String) model.getValueAt(secili_row, 0);

            // Giriş yapan kullanıcıyı al
            Kullanici girisYapanKullanici = GirisEkrani.getGirisYapanKullanici();

            if (girisYapanKullanici != null) {
                // Bakım süresini globalUserList'ten güncelle
                Map<String, Integer> bakimBilgileri = girisYapanKullanici.getBakimBilgileri();
                if (bakimBilgileri.containsKey(bakimIsmi)) {
                    int yeniSure = bakimBilgileri.get(bakimIsmi);

                    // Kalan süre sütununu belirlenen yeni süre olarak güncelle
                    model.setValueAt(yeniSure, secili_row, 1);

                    // İşlemin tamamlandığına dair mesaj göster
                    mesaj_alani.setText("Bakım başarıyla tamamlandı");
                    JOptionPane.showMessageDialog(this, "Bakım başarıyla tamamlandı.\nİyi günler dileriz.");
                } else {
                    mesaj_alani.setText("Bilinmeyen bakım türü...");
                }
            } else {
                mesaj_alani.setText("Giriş yapan kullanıcı bulunamadı...");
            }
        }
        islemler.dosyaYazdirmaKB();
    
    }//GEN-LAST:event_bakimi_tamamla_butonuActionPerformed

    
    private void ayIlerle_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayIlerle_butonuActionPerformed
        islemler.birAyIlerle();
        // Calisan tablosu modelini al
        DefaultTableModel model = (DefaultTableModel) bakim_tablosu.getModel();
        // Tablo satır sayısını al
        int rowCount = model.getRowCount();
        
            for (int i = 0; i < rowCount; i++) {
                // Mevcut kalan süreyi al
                int kalanSure = (int) model.getValueAt(i, 1);

                // Kalan süreyi 1 artır
                kalanSure -= 1;
        
                // Yeni değeri tabloya güncelle
                model.setValueAt(kalanSure, i, 1);
            }
            
    }//GEN-LAST:event_ayIlerle_butonuActionPerformed

    private void bakim_tablosuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bakim_tablosuMouseReleased
        
    }//GEN-LAST:event_bakim_tablosuMouseReleased

    private void bakim_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bakim_tablosuMouseClicked
        // int selectedrow = kullanici_tablosu.getSelectedRow(   );
    }//GEN-LAST:event_bakim_tablosuMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adKismi;
    private javax.swing.JPanel arabaAdiKismi;
    private javax.swing.JButton ayIlerle_butonu;
    private javax.swing.JTable bakim_tablosu;
    private javax.swing.JButton bakimi_tamamla_butonu;
    private javax.swing.JLabel hosgeldiniz;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mesaj_alani;
    // End of variables declaration//GEN-END:variables

   
}
