/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerPackage;

/**
 *
 * @author utkarsh
 */
public class CusOrder {
  private int orderId;
  private int order_customerId;
  private String order_customerName;
  private String order_customerMobile;
  private int order_menuItemId;
  private int order_menuItemPrice;
  private String order_menuItemName;
  private int order_menuItemQuantity;
  private String order_cookedStatus;
  private String order_receivedStatus;

    public int getOrder_customerId() {
        return order_customerId;
    }

    public void setOrder_customerId(int order_customerId) {
        this.order_customerId = order_customerId;
    }

    public String getOrder_customerName() {
        return order_customerName;
    }

    public void setOrder_customerName(String order_customerName) {
        this.order_customerName = order_customerName;
    }

    public String getOrder_customerMobile() {
        return order_customerMobile;
    }

    public void setOrder_customerMobile(String order_customerMobile) {
        this.order_customerMobile = order_customerMobile;
    }

    public int getOrder_menuItemId() {
        return order_menuItemId;
    }

    public void setOrder_menuItemId(int order_menuItemId) {
        this.order_menuItemId = order_menuItemId;
    }

    public int getOrder_menuItemPrice() {
        return order_menuItemPrice;
    }

    public void setOrder_menuItemPrice(int order_menuItemPrice) {
        this.order_menuItemPrice = order_menuItemPrice;
    }

    public String getOrder_menuItemName() {
        return order_menuItemName;
    }

    public void setOrder_menuItemName(String order_menuItemName) {
        this.order_menuItemName = order_menuItemName;
    }

    public int getOrder_menuItemQuantity() {
        return order_menuItemQuantity;
    }

    public void setOrder_menuItemQuantity(int order_menuItemQuantity) {
        this.order_menuItemQuantity = order_menuItemQuantity;
    }

    public String getOrder_cookedStatus() {
        return order_cookedStatus;
    }

    public void setOrder_cookedStatus(String order_cookedStatus) {
        this.order_cookedStatus = order_cookedStatus;
    }

    public String getOrder_receivedStatus() {
        return order_receivedStatus;
    }

    public void setOrder_receivedStatus(String order_receivedStatus) {
        this.order_receivedStatus = order_receivedStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    
  
  
}
