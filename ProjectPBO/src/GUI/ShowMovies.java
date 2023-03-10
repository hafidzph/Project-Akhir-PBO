/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import Connection.Conn;
import MainClasses.Drink;
import MainClasses.Food;
import MainClasses.Movies;
import MainClasses.Ticket;
import MainClasses.User;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author Rafly
 */
public class ShowMovies extends javax.swing.JFrame {
Conn con;
private int data = 0;
User user;
//Upcasting
Movies ticket;
private String trailer;
private String sinopsiss;
private String name;
private Drink drink; 
private Food food;
    /**
     * Creates new form ShowMovies
     */
    public ShowMovies() {
        initComponents();
        Conn.koneksi();
       
        con = new Conn();
        this.setup();
        this.setLocationRelativeTo(null);
        
    }
    
    public ShowMovies(User user, Ticket ticket, Food food, Drink drink) { 
        initComponents();
        Conn.koneksi();
        con = new Conn();
        this.setTitle("NOW SHOWING");
        this.setup();
        this.setLocationRelativeTo(null);
        this.user = user;
        this.food= food;
        this.drink = drink;
        
    }
    
    void setup() { 
           String query = "SELECT * FROM `movies` LIMIT 1 OFFSET 0" ;
    try {
        con.setRs(con.getStm().executeQuery(query));
      
    } catch (SQLException ex) {
        Logger.getLogger(ShowMovies.class.getName()).log(Level.SEVERE, null, ex);
    }
        try {
           if(con.getRs().next()){
               String image = con.getRs().getString("namaFile");
                  String namaMovies = con.getRs().getString("namaMovie");
                  String trailer = con.getRs().getString("trailer");
                  String sinop = con.getRs().getString("sinopsis");
                  String price = con.getRs().getString("harga");
                String kode = con.getRs().getString("code");
                String tanggal = con.getRs().getString("tahun");
               this.setData(image,namaMovies, trailer, sinop, price, kode, tanggal);
              
              
           }} catch (SQLException ex) {
           Logger.getLogger(ShowMovies.class.getName()).log(Level.SEVERE, null, ex);
       }          
        
        
    }
    
  
    void setData(String images, String nMovie, String trailer, String sinopsis, String price, String kode, String tanggal) { 
      String path = "src/moviesImages";
      File tempatTujuan = new File(path + "/" + images );
      ImageIcon icon = new ImageIcon(tempatTujuan.getPath());
      Image img = icon.getImage().getScaledInstance(image.getWidth(), image.getHeight(), java.awt.Image.SCALE_SMOOTH);
      icon = new ImageIcon(img);
      this.name = nMovie;
      this.trailer = trailer;
      this.sinopsiss = sinopsis;
      harga.setText(price);
      namaMovies.setText(nMovie);
      this.ticket = new Ticket(nMovie,tanggal, kode, price);
      image.setIcon(icon);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        namaMovies = new javax.swing.JLabel();
        harga = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Order_Jadi_1.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 210, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Back_Jadi.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 110, 110));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Next_Jadi.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 120, 110));

        image.setForeground(new java.awt.Color(51, 0, 204));
        image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMouseClicked(evt);
            }
        });
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 70, 230, 318));

        namaMovies.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        namaMovies.setForeground(new java.awt.Color(218, 154, 58));
        namaMovies.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namaMovies.setText("Nama Movies");
        jPanel1.add(namaMovies, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 250, 30));

        harga.setFont(new java.awt.Font("Hack", 1, 18)); // NOI18N
        harga.setForeground(new java.awt.Color(204, 142, 114));
        harga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        harga.setText(".");
        jPanel1.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 220, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Prevoious_Jadi.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/ShowMovies_Jadi.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 790, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked
        // TODO add your handling code here:
        Details detail = new Details(this.sinopsiss, this.trailer);
        detail.setVisible(true);
    }//GEN-LAST:event_imageMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Dashboard  das = new Dashboard(this.user);
        das.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
                   data = data-1;
      if(data >=0) { 

        String query = "SELECT * FROM `movies` LIMIT 1 OFFSET " + data ;
      
         try {
        con.setRs(con.getStm().executeQuery(query));
      
     } catch (SQLException ex) {
        Logger.getLogger(ShowMovies.class.getName()).log(Level.SEVERE, null, ex);
     }
        try {
           if(con.getRs().next()){
               String image = con.getRs().getString("namaFile");
                  String namaMovies = con.getRs().getString("namaMovie");
                   String trailer = con.getRs().getString("trailer");
                  String sinop = con.getRs().getString("sinopsis");
                   String price = con.getRs().getString("harga");
                   String kode = con.getRs().getString("code");
                     String tanggal = con.getRs().getString("tahun");
               this.setData(image,namaMovies, trailer, sinop, price, kode, tanggal);
           }
        
        
        } catch (SQLException ex) {
           Logger.getLogger(ShowMovies.class.getName()).log(Level.SEVERE, null, ex);
       }          
      }else { 
        data++;   
      }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
          data++;
        String query = "SELECT * FROM `movies` LIMIT 1 OFFSET " + data ;
    

    try {
        con.setRs(con.getStm().executeQuery(query));
      
    } catch (SQLException ex) {
        Logger.getLogger(ShowMovies.class.getName()).log(Level.SEVERE, null, ex);
    }
        try {
           if(con.getRs().next()){
               String image = con.getRs().getString("namaFile");
               String namaMovies = con.getRs().getString("namaMovie");
                  String trailer = con.getRs().getString("trailer");
                  String sinop = con.getRs().getString("sinopsis");
                  String price = con.getRs().getString("harga");
               String kode = con.getRs().getString("code");
                           String tanggal = con.getRs().getString("tahun");
               this.setData(image,namaMovies, trailer, sinop, price, kode, tanggal);
                    
           }else { 
            data--;   
           }
        
        } catch (SQLException ex) {
               
           Logger.getLogger(ShowMovies.class.getName()).log(Level.SEVERE, null, ex);
       }          
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
              
        if(this.ticket instanceof Ticket) { 
            ShowSeats show = new ShowSeats(this.user, (Ticket)this.ticket, this.food, this.drink);
            show.setVisible(true);
            
            this.setVisible(false);
            this.dispose();
            
        }
        
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(ShowMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowMovies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel harga;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namaMovies;
    // End of variables declaration//GEN-END:variables
}
