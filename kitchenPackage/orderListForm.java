/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitchenPackage;

import customerPackage.CusOrder;
import customerPackage.myOrderFunctions;
import menuItems.*;
import menuItems.Menu;
import java.awt.Font;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import managerPackage.Manager;
import managerPackage.ManagerAnnouncementsForm;
import managerPackage.ManagerWelcomeForm;
import starting.HomepageForm;

/**
 *
 * @author utkarsh
 */
public class orderListForm extends javax.swing.JFrame {

    /**
     * Creates new form InventoryForm
     */
    //HashMap<String, Double > orderMap = new HashMap<String,Double>(); //reem
    String choice;
    public static DefaultTableModel model;
    Manager manager; //to access inventory items

    public orderListForm() throws SQLException {
        initComponents();
        initializeComp();
    }

    public orderListForm(Manager m) throws SQLException {
        initComponents();
        this.manager = m;
        initializeComp();

    }

    private void initializeComp() {
        this.setLocationRelativeTo(null); //center form in screen
        // inventory.rateItem(orderMap);
        model = (DefaultTableModel) tbl_viewItems.getModel();
        tbl_viewItems.setVisible(true);
        tbl_viewItems.getTableHeader().setFont(new Font("Rockwell", Font.BOLD, 20));
        displayAllOrders(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_bg = new javax.swing.JPanel();
        btn_serveItem = new javax.swing.JButton();
        txt_itemID = new javax.swing.JTextField();
        lbl_itemName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_viewItems = new javax.swing.JTable();
        lbl_bg = new javax.swing.JLabel();
        pHeader2 = new javax.swing.JPanel();
        btnLogout2 = new javax.swing.JButton();
        lbLogo = new javax.swing.JLabel();
        btnOrdersCustomer = new javax.swing.JButton();
        btnMenuCustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnl_bg.setLayout(null);

        btn_serveItem.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        btn_serveItem.setForeground(new java.awt.Color(102, 0, 102));
        btn_serveItem.setText("Food  Cooked Successfully Serve to Customer");
        btn_serveItem.setPreferredSize(new java.awt.Dimension(169, 37));
        btn_serveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_serveItemActionPerformed(evt);
            }
        });
        pnl_bg.add(btn_serveItem);
        btn_serveItem.setBounds(260, 660, 640, 60);

        txt_itemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_itemIDActionPerformed(evt);
            }
        });
        pnl_bg.add(txt_itemID);
        txt_itemID.setBounds(620, 570, 150, 50);

        lbl_itemName.setFont(new java.awt.Font("Rockwell", 0, 28)); // NOI18N
        lbl_itemName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_itemName.setText("Enter Order ID");
        pnl_bg.add(lbl_itemName);
        lbl_itemName.setBounds(380, 570, 210, 40);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Order and Serve to Customer");
        pnl_bg.add(jLabel1);
        jLabel1.setBounds(320, 480, 530, 50);

        tbl_viewItems.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        tbl_viewItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Item ID", "Item Name", "Item Quantity", "Customer Name", "Customer Messgae"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_viewItems.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_viewItems.setOpaque(false);
        jScrollPane1.setViewportView(tbl_viewItems);
        if (tbl_viewItems.getColumnModel().getColumnCount() > 0) {
            tbl_viewItems.getColumnModel().getColumn(0).setHeaderValue("Order ID");
            tbl_viewItems.getColumnModel().getColumn(1).setMinWidth(90);
            tbl_viewItems.getColumnModel().getColumn(1).setMaxWidth(120);
            tbl_viewItems.getColumnModel().getColumn(1).setHeaderValue("Item ID");
            tbl_viewItems.getColumnModel().getColumn(2).setMinWidth(270);
            tbl_viewItems.getColumnModel().getColumn(2).setMaxWidth(280);
            tbl_viewItems.getColumnModel().getColumn(2).setHeaderValue("Item Name");
            tbl_viewItems.getColumnModel().getColumn(3).setMinWidth(120);
            tbl_viewItems.getColumnModel().getColumn(3).setMaxWidth(150);
            tbl_viewItems.getColumnModel().getColumn(3).setHeaderValue("Item Quantity");
            tbl_viewItems.getColumnModel().getColumn(4).setMinWidth(100);
            tbl_viewItems.getColumnModel().getColumn(4).setMaxWidth(150);
            tbl_viewItems.getColumnModel().getColumn(4).setHeaderValue("Customer Name");
            tbl_viewItems.getColumnModel().getColumn(5).setMinWidth(150);
            tbl_viewItems.getColumnModel().getColumn(5).setMaxWidth(200);
            tbl_viewItems.getColumnModel().getColumn(5).setHeaderValue("Customer Messgae");
        }

        pnl_bg.add(jScrollPane1);
        jScrollPane1.setBounds(50, 130, 1050, 330);

        lbl_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuItems/Food-Inventory-Management-What-It-Is-and-How-to-Do-It-Well-1.jpg"))); // NOI18N
        lbl_bg.setText("jLabel1");
        pnl_bg.add(lbl_bg);
        lbl_bg.setBounds(0, 80, 1220, 710);

        pHeader2.setBackground(new java.awt.Color(255, 213, 0));
        pHeader2.setName("pHeader"); // NOI18N
        pHeader2.setPreferredSize(new java.awt.Dimension(1062, 70));
        pHeader2.setLayout(null);

        btnLogout2.setBackground(new java.awt.Color(255, 213, 0));
        btnLogout2.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnLogout2.setForeground(new java.awt.Color(127, 72, 101));
        btnLogout2.setText("Log out");
        btnLogout2.setToolTipText("");
        btnLogout2.setBorder(null);
        btnLogout2.setBorderPainted(false);
        btnLogout2.setContentAreaFilled(false);
        btnLogout2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout2.setName(""); // NOI18N
        btnLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout2ActionPerformed(evt);
            }
        });
        pHeader2.add(btnLogout2);
        btnLogout2.setBounds(1080, 19, 101, 40);

        lbLogo.setBackground(new java.awt.Color(255, 255, 255));
        lbLogo.setFont(new java.awt.Font("Rockwell Condensed", 0, 52)); // NOI18N
        lbLogo.setForeground(new java.awt.Color(127, 72, 101));
        lbLogo.setText("VIIT Canteen");
        lbLogo.setToolTipText("");
        pHeader2.add(lbLogo);
        lbLogo.setBounds(30, 10, 350, 62);

        btnOrdersCustomer.setBackground(new java.awt.Color(255, 213, 0));
        btnOrdersCustomer.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnOrdersCustomer.setForeground(new java.awt.Color(127, 72, 101));
        btnOrdersCustomer.setText("Orders List");
        btnOrdersCustomer.setBorder(null);
        btnOrdersCustomer.setBorderPainted(false);
        btnOrdersCustomer.setContentAreaFilled(false);
        btnOrdersCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdersCustomer.setPreferredSize(new java.awt.Dimension(87, 29));
        btnOrdersCustomer.setRequestFocusEnabled(false);
        btnOrdersCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersCustomerActionPerformed(evt);
            }
        });
        pHeader2.add(btnOrdersCustomer);
        btnOrdersCustomer.setBounds(901, 26, 184, 29);

        btnMenuCustomer.setBackground(new java.awt.Color(255, 213, 0));
        btnMenuCustomer.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        btnMenuCustomer.setForeground(new java.awt.Color(127, 72, 101));
        btnMenuCustomer.setText("Main Menu");
        btnMenuCustomer.setBorder(null);
        btnMenuCustomer.setBorderPainted(false);
        btnMenuCustomer.setContentAreaFilled(false);
        btnMenuCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuCustomer.setPreferredSize(new java.awt.Dimension(87, 29));
        btnMenuCustomer.setRequestFocusEnabled(false);
        btnMenuCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuCustomerActionPerformed(evt);
            }
        });
        pHeader2.add(btnMenuCustomer);
        btnMenuCustomer.setBounds(750, 20, 153, 40);

        pnl_bg.add(pHeader2);
        pHeader2.setBounds(0, 0, 1220, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_serveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_serveItemActionPerformed
        // TODO add your handling code here:

        if (txt_itemID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pls provide Id of order", "Error", JOptionPane.PLAIN_MESSAGE);
        } else {
            if (new myOrderFunctions().updateOrder(Integer.parseInt(txt_itemID.getText()))) {
                displayAllOrders((DefaultTableModel) tbl_viewItems.getModel());
            } else {

                JOptionPane.showMessageDialog(this, "Pls provide valid Id of order", "Error", JOptionPane.PLAIN_MESSAGE);

            }
        }


    }//GEN-LAST:event_btn_serveItemActionPerformed

    private void btnLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout2ActionPerformed
        HomepageForm homepage = new HomepageForm();
        homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogout2ActionPerformed

    private void btnOrdersCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersCustomerActionPerformed
        //        ShowOrders s = new ShowOrders(customer, orderinString);
        //        s.setVisible(true);
        //        this.dispose();
    }//GEN-LAST:event_btnOrdersCustomerActionPerformed

    private void btnMenuCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuCustomerActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_btnMenuCustomerActionPerformed

    private void txt_itemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_itemIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_itemIDActionPerformed

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
            java.util.logging.Logger.getLogger(orderListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderListForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new orderListForm().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(orderListForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void displayAllOrders(DefaultTableModel model) {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged(); // notifies the JTable that the model has changed
        ArrayList<CusOrder> order_data = new myOrderFunctions().getAllOrders();
        if (order_data.isEmpty()) {
            System.out.println("customerPackage.OrderForm.btn_orderStatusActionPerformed()  Error");
            JOptionPane.showMessageDialog(this, "No Order Found");

        } else {
            for (int i = 0; i < order_data.size(); i++) {
                CusOrder cusOrder = order_data.get(i);
                model.addRow(new Object[]{cusOrder.getOrderId(), cusOrder.getOrder_menuItemId(), cusOrder.getOrder_menuItemName(), cusOrder.getOrder_menuItemQuantity(), cusOrder.getOrder_customerName()});
            }
            System.out.println(order_data);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout2;
    private javax.swing.JButton btnMenuCustomer;
    private javax.swing.JButton btnOrdersCustomer;
    private javax.swing.JButton btn_serveItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbl_bg;
    private javax.swing.JLabel lbl_itemName;
    public static javax.swing.JPanel pHeader2;
    private javax.swing.JPanel pnl_bg;
    public static javax.swing.JTable tbl_viewItems;
    private javax.swing.JTextField txt_itemID;
    // End of variables declaration//GEN-END:variables
}