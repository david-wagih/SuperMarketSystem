/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermarket_project.GUI;

import supermarket_project.helpers.Manager;

/**
 *
 * @author asaid
 */
public class Manger_CreatProoduct extends javax.swing.JFrame {

    /**
     * Creates new form Manger_CreatProoduct
     */
    Manager m =new Manager();
    public Manger_CreatProoduct() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TextField_Brand = new javax.swing.JTextField();
        TextField_Category = new javax.swing.JTextField();
        jLabel_ProductName = new javax.swing.JLabel();
        TextField_Production = new javax.swing.JTextField();
        Label_Price = new javax.swing.JLabel();
        TextField_ExpiryDate = new javax.swing.JTextField();
        TextField_Name = new javax.swing.JTextField();
        TextField_Price = new javax.swing.JTextField();
        Label_Brand = new javax.swing.JLabel();
        Label_Catrgory = new javax.swing.JLabel();
        Label_ProductionDate = new javax.swing.JLabel();
        Label_ExpiryDate = new javax.swing.JLabel();
        jLabel3_id = new javax.swing.JLabel();
        jTextField2_id = new javax.swing.JTextField();
        Add_Product = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel4 = new javax.swing.JLabel();
        jTextField2_qty = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setText("jTextField1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextField_Brand.setText("Brand");
        TextField_Brand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_BrandActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 71, -1));

        TextField_Category.setText("Category");
        jPanel1.add(TextField_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 174, 71, -1));

        jLabel_ProductName.setText("Product Name");
        jPanel1.add(jLabel_ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, 37, -1));

        TextField_Production.setText("production_date");
        TextField_Production.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_ProductionActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Production, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 214, 71, -1));

        Label_Price.setText("Price");
        jPanel1.add(Label_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 103, 37, -1));

        TextField_ExpiryDate.setText("expiry_date");
        TextField_ExpiryDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_ExpiryDateActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_ExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 254, 71, -1));

        TextField_Name.setText("Name");
        TextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_NameActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 71, -1));

        TextField_Price.setText("price");
        TextField_Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_PriceActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 71, -1));

        Label_Brand.setText("Brand");
        jPanel1.add(Label_Brand, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 143, 37, -1));

        Label_Catrgory.setText("Category");
        jPanel1.add(Label_Catrgory, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 177, -1, -1));

        Label_ProductionDate.setText("Production_date");
        jPanel1.add(Label_ProductionDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 217, -1, -1));

        Label_ExpiryDate.setText("Expiry_date");
        jPanel1.add(Label_ExpiryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 257, -1, -1));

        jLabel3_id.setText("ID");
        jPanel1.add(jLabel3_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 37, -1));

        jTextField2_id.setText("ID");
        jPanel1.add(jTextField2_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 70, -1));

        Add_Product.setText("Creat");
        Add_Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ProductActionPerformed(evt);
            }
        });

        jLabel4.setText("QTY");

        jTextField2_qty.setText("QTY");
        jTextField2_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_qtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)
                        .addComponent(jTextField2_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(Add_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Product, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_BrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_BrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_BrandActionPerformed

    private void TextField_ProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_ProductionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_ProductionActionPerformed

    private void TextField_ExpiryDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_ExpiryDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_ExpiryDateActionPerformed

    private void TextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_NameActionPerformed

    private void TextField_PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_PriceActionPerformed

    private void Add_ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ProductActionPerformed
        // TODO add your handling code here:
        //creatProduct(int product_id, String product_name, double product_price, String product_brand,
          //  String product_categorg, int product_production_date, int product_expiry_date, int qty)
          try{
          int id =Integer.parseInt(jTextField2_id.getText());
          String name = TextField_Name.getText();
          double price =Double.parseDouble(TextField_Price.getText());
          String brand = TextField_Brand.getText();
          String category = TextField_Category.getText();
          int pdate  = Integer.parseInt(TextField_Production.getText());
          int exdate = Integer.parseInt(TextField_ExpiryDate.getText());
          int qty = Integer.parseInt(jTextField2_qty.getText());
          
          m.creatProduct(id, name, price, brand, category, exdate, pdate,qty);
          }catch(Exception e){
              System.out.println(e.getMessage());
          }
    }//GEN-LAST:event_Add_ProductActionPerformed

    private void jTextField2_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_qtyActionPerformed

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
            java.util.logging.Logger.getLogger(Manger_CreatProoduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manger_CreatProoduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manger_CreatProoduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manger_CreatProoduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manger_CreatProoduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Product;
    private javax.swing.JLabel Label_Brand;
    private javax.swing.JLabel Label_Catrgory;
    private javax.swing.JLabel Label_ExpiryDate;
    private javax.swing.JLabel Label_Price;
    private javax.swing.JLabel Label_ProductionDate;
    private javax.swing.JTextField TextField_Brand;
    private javax.swing.JTextField TextField_Category;
    private javax.swing.JTextField TextField_ExpiryDate;
    private javax.swing.JTextField TextField_Name;
    private javax.swing.JTextField TextField_Price;
    private javax.swing.JTextField TextField_Production;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3_id;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_ProductName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2_id;
    private javax.swing.JTextField jTextField2_qty;
    // End of variables declaration//GEN-END:variables
}