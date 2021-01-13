/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerPackage;

import gustorestaurant.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author utkarsh
 */
public class Order
{

    private String Id;
    private String complainMessage;
    private String customerId;
    private String customerName;
    private String customerMobile;
    private String customerAddress;
    //private Date deliveryTime;
    private String associatedWaiterId;
    protected HashMap<String, Integer> orderList = new HashMap<>();
    public HashMap<String, Double> ratings = new HashMap<>();
    DateFormat dateFormat = new SimpleDateFormat("h:mm aa");
    private boolean voucherFound = false;
    boolean assigned = false;
    //private Date orderStartTime;
    private long CanelTimeInMillis = (60000 * 0);
    private long startTimeInMillis = (60000 * 0);
    private long servedTimeInMillis = (60000 * 0);

    private boolean status = false;

    public Order(String Id, String customerId, String customerName, String customerAddress, String customerMobile)
    {
        this.Id = Id;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerMobile = customerMobile;
    }

    public static int getNoOrders() //for genearting id numbers of new orders
    {
        int count = 0;
        try
        {
            PreparedStatement preparedStmt = MyConnection.getConnection().prepareStatement("SELECT count(*) FROM menu_item.order_info");
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next())
            {
                count = rs.getInt("count(*)");
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    public Order()
    {
    }

    public Order(String Id)
    {
        this.Id = Id;
    }

    public void setAssociatedWaiterId(String associatedWaiterId)
    {
        this.associatedWaiterId = associatedWaiterId;
    }

    public void setOrderList(HashMap<String, Integer> orderList)
    {
        this.orderList = orderList;
    }

    public void setCanelTimeInMillis(long CanelTimeInMillis)
    {
        this.CanelTimeInMillis = CanelTimeInMillis;
    }

    public void setId(String Id)
    {
        this.Id = Id;
    }

    public void setservedTimeInMillis(long servedTimeInMillis) {
        this.servedTimeInMillis = servedTimeInMillis;
    }

    public long getDeliveryTimeInMillis() {
        return servedTimeInMillis;
    }

    public void setStartTimeInMillis(long startTimeInMillis) {
        this.startTimeInMillis = startTimeInMillis;
    }

    public long getStartTimeInMillis() {
        return startTimeInMillis;
    }

    public boolean isVoucherFound()
    {
        return voucherFound;
    }

    public void setVoucherFound(boolean voucherFound)
    {
        this.voucherFound = voucherFound;
    }

    public void setComplainMessage(String complainMessage)
    {
        this.complainMessage = complainMessage;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public String getAssociatedWaiterId()
    {
        return associatedWaiterId;
    }

//    public Date getOrderStartTime()
//    {
//        return orderStartTime;
//    }

    public String getId()
    {
        return Id;
    }

//    public Date getDeliveryTime()
//    {
//        return deliveryTime;
//    }

    public long getCanelTimeInMillis()
    {
        return CanelTimeInMillis;
    }

    public String getComplainMessage()
    {
        return complainMessage;
    }

    static public boolean checkStatus(Order order)
    {
        //Date currentTime = new Date();
        long currentTime = System.currentTimeMillis();
        //long ONE_MINUTE_IN_MILLIS = 60000;
        if (order.getDeliveryTimeInMillis()<=currentTime/*currentTime.after(order.getDeliveryTime()) || currentTime.equals(order.getDeliveryTime())*/)
        {
            order.setStatus(true);
        }
        
        return order.getStatus();
    }

    public boolean getStatus()
    {
        return status;
    }

    public void writeNewOrder(String orderIds)
    {
        //boolean isEmptyList = false;
//        String start = (String) dateFormat.format(orderStartTime);
//        String duration = dateFormat.format(deliveryTime);
        String menuItemsIds = "";
        //Add the new order to order_info table in data base
        try
        {
            //Add new added item into database in menu_item table
            String query = "INSERT INTO order_info ( order_id, order_cutomerName,order_StartMillis ,order_waiter, order_receivedStatus , order_complainMessage , order_menuItemList , order_servedMillis )" + " VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStmt = MyConnection.getConnection().prepareStatement(query);

            preparedStmt.setInt(1, Integer.valueOf(Id));
            preparedStmt.setString(2, customerName);
            preparedStmt.setLong(3, startTimeInMillis);
            preparedStmt.setString(4, associatedWaiterId);
            preparedStmt.setBoolean(5, status);
            //preparedStmt.setString(5, String.valueOf(status));
            preparedStmt.setString(6, complainMessage);
            //take the ordered food items ids from the inventoryList map in a string
            for (String foodItem : orderList.keySet())
            {
                menuItemsIds += String.valueOf(foodItem);
                menuItemsIds += "#";
                menuItemsIds += String.valueOf(orderList.get(foodItem));
                menuItemsIds += "&";
            }
            menuItemsIds = menuItemsIds.substring(0, menuItemsIds.length() - 1);
            preparedStmt.setString(7, menuItemsIds);
            preparedStmt.setLong(8,  servedTimeInMillis);
            //preparedStmt.setLong(9, startTimeInMillis);
            
            preparedStmt.execute();

        } catch (SQLException ex)
        {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Add the new order id to the list of order ids
        try
        {
            //Add new added item into database in menu_item table
            if (orderIds == null)
            {
                //write the order id as string in the data base
                orderIds = Id;
            }
            else
            {
                orderIds += "/" + Id;
            }
            /*String query = "UPDATE customer SET customer_listOfOrders='" + orderIds + "'"
             + " WHERE customer_name =" + customerName + "";
             PreparedStatement preparedStmt = MyConnection.getConnection().prepareStatement(query);
             preparedStmt.execute();*/
             System.out.println(customerId+" "+Integer.valueOf(customerId));
            String query = "UPDATE customer SET customer_listOfOrders = '" + orderIds
                    + "' WHERE customer_id = " + Integer.valueOf(customerId);
            PreparedStatement preparedStmt = MyConnection.getConnection().prepareStatement(query);
            preparedStmt.execute();
        } catch (SQLException ex)
        {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateOrder(Order order)
    {
        try
        {
             System.out.println(order.getId()+" "+Integer.valueOf(Id)+" in updateorders fun");
            String query = "UPDATE order_info SET order_receivedStatus = " + order.getStatus()
                    + " WHERE order_id = " + Integer.valueOf(order.getId());
            PreparedStatement preparedStmt = MyConnection.getConnection().prepareStatement(query);
            preparedStmt.execute();
        } catch (SQLException ex)
        {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void updateWaiters(Waiter waiter)
    {
        int status;

        try
        {
            System.out.println(waiter.getOrdersList().size()+" "+waiter.isAvailable()+" we are in update function");
            if (waiter.isAvailable())
            {
                status = 1;
            }
            else
            {
                status = 0;
            }
             System.out.println(status+" we are in update function");
            if (waiter.getOrdersList().isEmpty())
            {

                String Query = " UPDATE menu_item.waiters SET status_waiters=" + waiter.isAvailable()
                        + ",order1_waiters = " + null
                        + ",order2_waiters =" + null
                        + " WHERE id_waiters =" + waiter.getId() + "";
                PreparedStatement preparedStmt = MyConnection.getConnection().prepareStatement(Query);
                preparedStmt.execute();
            }
            else if (waiter.getOrdersList().size() == 1)
            {
                String Query = " UPDATE menu_item.waiters SET status_waiters=" + waiter.isAvailable()
                        + ",order1_waiters = " + waiter.getOrdersList().get(0).Id
                        + ",order2_waiters =" + null
                        + " WHERE id_waiters =" + waiter.getId() + "";
                PreparedStatement preparedStmt = MyConnection.getConnection().prepareStatement(Query);
                preparedStmt.execute();
            }

            else if (waiter.getOrdersList().size() == 2)
            {
                String Query = " UPDATE menu_item.waiters SET status_waiters=" + waiter.isAvailable()
                        + ",order1_waiters = " + waiter.getOrdersList().get(0).Id
                        + ",order2_waiters =" + waiter.getOrdersList().get(1).Id
                        + " WHERE id_waiters =" + waiter.getId() + "";
                PreparedStatement preparedStmt = MyConnection.getConnection().prepareStatement(Query);
                preparedStmt.execute();

            }

        } catch (SQLException ex)
        {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    boolean assignOrder()
    {
        try
        {
            Date currentTime = new Date();
            String Now = dateFormat.format(currentTime/*Date.from(Instant.now())*/);
            Date now = dateFormat.parse(Now);
            
            
            for (String waiterId : Waiter.waiterList.keySet())
            {
                System.out.println(assigned+" "+Waiter.waiterList.get(waiterId).getOrdersList().size()+" "+Waiter.waiterList.get(waiterId).getName()+" "+dateFormat.format(Waiter.waiterList.get(waiterId).getStart())+" "+now+" "+dateFormat.format(Waiter.waiterList.get(waiterId).getEnd())+" in assign function");
                if ((!assigned) && (Waiter.waiterList.get(waiterId).getStart().before(now) || Waiter.waiterList.get(waiterId).getStart().equals(now)) && Waiter.waiterList.get(waiterId).getEnd().after(now)) // we can add
                {

                    if (Waiter.waiterList.get(waiterId).isAvailable())
                    {
                        assigned = true;
                        Waiter.waiterList.get(waiterId).getOrdersList().add(this);
                        associatedWaiterId = waiterId;

                        if (Waiter.waiterList.get(waiterId).getOrdersList().size() == Waiter.maxOrders)
                        {
                            Waiter.waiterList.get(waiterId).setAvailable(false);
                        }
                        if (assigned)
                        {
                            System.out.println(assigned+" "+Waiter.waiterList.get(waiterId).getOrdersList().size()+" "+Waiter.waiterList.get(waiterId).isAvailable()+" in assign function");
                            break;
                        }

                    }
                }
                

            }
            
            if (!assigned)
            {
                JOptionPane.showMessageDialog(null, "We are so sorry but there is no service available for now.\nTry to order after a while.");
            }
        } catch (ParseException ex)
        {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        return assigned;

    }
}
