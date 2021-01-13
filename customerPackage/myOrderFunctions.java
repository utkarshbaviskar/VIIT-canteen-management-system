/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerPackage;

import static customerPackage.OrderForm.customer;
import gustorestaurant.MyConnection;
import gustorestaurant.User;
import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import starting.LoginForm;

/**
 *
 * @author utakrsh
 */
public class myOrderFunctions {

    public boolean placeOrder(int id, String cus_name, String cus_mobile, String menu_item_name, int order_menuItemQuantity) {

        boolean inserted = false;
        String cookedStatus = "Cooking";
        String receievedStatus = "Pending";

        try {

            ArrayList menu_data = getMenu(menu_item_name);
            if (menu_data.isEmpty()) {
                System.out.println("customerPackage.myOrderFunctions.placeOrder() Menu Data not found" + menu_item_name);
            } else {

                String query = "INSERT INTO cus_order_info (order_customerId, order_customerName,order_customerMobile, order_menuItemId, order_menuItemPrice,order_menuItemName, order_cookedStatus, order_receivedStatus,order_menuItemQuantity ) " + " VALUES(?,?,?,?,?,?,?,?,?)";
                PreparedStatement preparedStmt = MyConnection.getConnection().prepareStatement(query);

                preparedStmt.setInt(1, Integer.valueOf(id));
                preparedStmt.setString(2, cus_name);
                preparedStmt.setLong(3, Long.parseLong(cus_mobile));
                preparedStmt.setInt(4, (Integer) menu_data.get(0));
                preparedStmt.setInt(5, (Integer) menu_data.get(1));
                preparedStmt.setString(6, menu_item_name);
                preparedStmt.setString(7, cookedStatus);
                preparedStmt.setString(8, receievedStatus);
                preparedStmt.setInt(9, order_menuItemQuantity);

                preparedStmt.execute();
                preparedStmt.closeOnCompletion();
                inserted = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return inserted;
    }

    public ArrayList getMenu(String menu_name) {

        ArrayList menu_data = new ArrayList();
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT idmenu_item,pricemenu_item, category FROM menu_item WHERE namemenu_item = ? ;";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, menu_name);
            rs = ps.executeQuery();
            ps.closeOnCompletion();

            if (rs.next()) {
                System.out.println(rs.toString());
                menu_data.add(rs.getInt("idmenu_item"));
                menu_data.add(rs.getInt("pricemenu_item"));
                menu_data.add(rs.getString("category"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return menu_data;

    }

    public ArrayList<CusOrder> getOrdersByCusId(int cus_id) {

        ArrayList<CusOrder> order_data = new ArrayList();
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM cus_order_info WHERE order_customerId = ? ;";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setInt(1, cus_id);
            rs = ps.executeQuery();
            ps.closeOnCompletion();

            while (rs.next()) {
                CusOrder cusOrder = new CusOrder();
                cusOrder.setOrder_customerId(rs.getInt("order_customerId"));
                cusOrder.setOrder_customerMobile(rs.getString("order_customerMobile"));
                cusOrder.setOrder_cookedStatus(rs.getString("order_cookedStatus"));
                cusOrder.setOrder_customerName(rs.getString("order_customerName"));
                cusOrder.setOrder_menuItemId(rs.getInt("order_menuItemId"));
                cusOrder.setOrder_menuItemName(rs.getString("order_menuItemName"));
                cusOrder.setOrder_menuItemPrice(rs.getInt("order_menuItemPrice"));
                cusOrder.setOrder_menuItemQuantity(rs.getInt("order_menuItemQuantity"));
                cusOrder.setOrder_receivedStatus(rs.getString("order_receivedStatus"));
                order_data.add(cusOrder);
            }

            return order_data;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return order_data;
    }

    public ArrayList<CusOrder> getAllOrders() {

        ArrayList<CusOrder> order_data = new ArrayList();
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM cus_order_info WHERE order_cookedStatus=?;";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, "Cooking");
            rs = ps.executeQuery();
            ps.closeOnCompletion();

            while (rs.next()) {
                CusOrder cusOrder = new CusOrder();
                cusOrder.setOrderId(rs.getInt("order_id"));
                cusOrder.setOrder_customerId(rs.getInt("order_customerId"));
                cusOrder.setOrder_customerMobile(rs.getString("order_customerMobile"));
                cusOrder.setOrder_cookedStatus(rs.getString("order_cookedStatus"));
                cusOrder.setOrder_customerName(rs.getString("order_customerName"));
                cusOrder.setOrder_menuItemId(rs.getInt("order_menuItemId"));
                cusOrder.setOrder_menuItemName(rs.getString("order_menuItemName"));
                cusOrder.setOrder_menuItemPrice(rs.getInt("order_menuItemPrice"));
                cusOrder.setOrder_menuItemQuantity(rs.getInt("order_menuItemQuantity"));
                cusOrder.setOrder_receivedStatus(rs.getString("order_receivedStatus"));
                order_data.add(cusOrder);
            }

            return order_data;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return order_data;
    }

    public boolean updateOrder(int OrderId) {
        boolean updated = false;
        String coocked = "Served";

        try {


            String query = "UPDATE cus_order_info SET order_cookedStatus=? WHERE order_id=?";
            PreparedStatement preparedStmt = MyConnection.getConnection().prepareStatement(query);
         
            preparedStmt.setString(1, "Served");
            preparedStmt.setInt(2, OrderId);
            
            preparedStmt.execute();
            preparedStmt.closeOnCompletion();
            updated = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return updated;

    }

}
