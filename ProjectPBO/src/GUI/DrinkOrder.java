/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Connection.Conn;
import MainClasses.Drink;
import MainClasses.Food;
import MainClasses.User;
import MainClasses.Item;
import MainClasses.Ticket;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author apit
 */
public class DrinkOrder extends javax.swing.JFrame {
protected User user;
protected Drink drink;
protected Conn con;
private Food food; 
private Ticket ticket;
    /**
     * Creates new form DrinkOrder
     */
    public DrinkOrder() {
        initComponents();
        this.con = new Conn();
        this.setLocationRelativeTo(null);
         this.setImage("coke");
    }
    
    public DrinkOrder(User user, Ticket ticket, Food food, Drink drink){
       initComponents();
       this.con = new Conn();
       this.user = user;
       this.drink = drink;
       this.setTitle("Order Minuman");
       this.food = food; 
        this.setImage("coke");
       this.ticket= ticket;
       this.setLocationRelativeTo(null);
       discount.setText("20000");
      
    }
    
      void setImage(String drink) { 
      String path = "src/Assets";
      File tempatTujuan = new File(path +"/"+drink+".png");
      ImageIcon icon = new ImageIcon(tempatTujuan.getPath());
      Image img = icon.getImage().getScaledInstance(labelGambar.getWidth(), labelGambar.getHeight(), java.awt.Image.SCALE_SMOOTH);
      icon = new ImageIcon(img); 
      labelGambar.setIcon(icon);
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
        discount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        drinkName = new javax.swing.JComboBox<>();
        size = new javax.swing.JComboBox<>();
        value = new javax.swing.JComboBox<>();
        labelGambar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        discount.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Submit.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 100, 30));

        drinkName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coca-cola", "Sprite", "Fanta", "Pepsi" }));
        drinkName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                drinkNameItemStateChanged(evt);
            }
        });
        jPanel1.add(drinkName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 110, 30));

        size.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Large", "Medium", "Small" }));
        size.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sizeItemStateChanged(evt);
            }
        });
        jPanel1.add(size, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 100, 30));

        value.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel1.add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 100, 30));
        jPanel1.add(labelGambar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 200, 270));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Back_Jadi.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 130, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/DrinksMenu_Jadi.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drinkNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_drinkNameItemStateChanged
        // TODO add your handling code here:
        if(drinkName.getSelectedItem().toString().equalsIgnoreCase("Coca-cola")) { 
            this.setImage("coke");
        }else if(drinkName.getSelectedItem().toString().equalsIgnoreCase("Sprite")) { 
            this.setImage("sprite");
        }else if(drinkName.getSelectedItem().toString().equalsIgnoreCase("fanta")) { 
            this.setImage("fanta-merinda");
        }else { 
            this.setImage("pepsi");
        }
        
        
    }//GEN-LAST:event_drinkNameItemStateChanged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
           String nama = drinkName.getSelectedItem().toString();
        String sz = size.getSelectedItem().toString();
        int jumlah = Integer.parseInt(value.getSelectedItem().toString());
        if(sz.equalsIgnoreCase("Large")){
            this.drink = new Drink(nama, "20000", sz, jumlah);
        }else if(sz.equalsIgnoreCase("Medium")){
             this.drink = new Drink(nama, "15000", sz, jumlah);
        }else{
            this.drink = new Drink(nama, "10000", sz, jumlah);
        }
        JOptionPane.showMessageDialog(null, "Berhasil memesanan silahkan checkout");
        Dashboard ds = new Dashboard(user,this.ticket, this.food, this.drink);
        ds.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Dashboard dash = new Dashboard(user,ticket,food,drink);
        dash.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void sizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sizeItemStateChanged
        // TODO add your handling code here:
        if(size.getSelectedItem().toString().equalsIgnoreCase("Large")) { 
            discount.setText("20000");
        }else if(size.getSelectedItem().toString().equals("Medium")) { 
            discount.setText("15000");
        }else { 
            discount.setText("10000");
        }
    }//GEN-LAST:event_sizeItemStateChanged

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
            java.util.logging.Logger.getLogger(DrinkOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrinkOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrinkOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrinkOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrinkOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel discount;
    private javax.swing.JComboBox<String> drinkName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelGambar;
    private javax.swing.JComboBox<String> size;
    private javax.swing.JComboBox<String> value;
    // End of variables declaration//GEN-END:variables
}