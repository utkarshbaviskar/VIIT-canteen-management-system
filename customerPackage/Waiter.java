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
import gustorestaurant.MyConnection;
import java.awt.Menu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Waiter
{
    private String id;
    private String name;
    static final int maxOrders = 2;
    private boolean available;
    private Date end;
    private Date start;
    private ArrayList<Order> ordersList;
    private Order order = new Order();
    DateFormat dateFormat = new SimpleDateFormat("h:mm aa");
    public static HashMap<String, Waiter> waiterList = new HashMap<>();
    //System.out.println(dateFormat.format (date));
    
    public Waiter()
    {
        this.ordersList = new ArrayList<>();
    }

    public Waiter(String id, String name, boolean available, ArrayList<Order> ordersList)
    {
        this.id = id;
        this.name = name;
        this.available = available;
        this.ordersList = ordersList;
    }
    // to fill waiters List from database 

    void addOrder(String orderId)
    {
        //to read null Strings from data base
        if (orderId == null)
        {
            return;
        }

        this.ordersList.add(order);
    }

    public Date getEnd()
    {
        return end;
    }

    public Date getStart()
    {
        return start;
    }

    public String getId()
    {
        return id;
    }

    public void setOrder(Order order)
    {
        this.order = order;
    }

    public Order getOrder()
    {
        return order;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isAvailable()
    {
        return available;
    }

    public void setAvailable(boolean available)
    {
        this.available = available;
    }

    public ArrayList<Order> getOrdersList()
    {
        return ordersList;
    }

    public void setOrdersList(ArrayList<Order> ordersList)
    {
        this.ordersList = ordersList;
    }

    public void setEnd(Date end)
    {
        this.end = end;
    }

    public void setStart(Date start)
    {

        this.start = start;
    }

    public void setWaiters()
    {
        Waiter waiter;
        try
        {

            PreparedStatement preparedStmt = MyConnection.getConnection().prepareStatement("select * from menu_item.Waiters");
            ResultSet rs = preparedStmt.executeQuery();

            while (rs.next())
            {

                waiter = new Waiter();
                waiter.setId(rs.getString("id_Waiters"));
                waiter.setName(rs.getString("name_Waiters"));

                waiter.setStart(dateFormat.parse(rs.getString("start_time_waiters")));
                

                waiter.setEnd(dateFormat.parse(rs.getString("finish_time_waiters")));

                waiter.setAvailable(rs.getBoolean("status_Waiters"));
                
                if (rs.getString("order1_Waiters") != null)
                {
                    waiter.addOrder(rs.getString("order1_Waiters"));
                }
                if (rs.getString("order2_Waiters") != null)
                {
                    waiter.addOrder(rs.getString("order2_Waiters"));
                }
                System.out.println(waiter.getName()+" "+waiter.isAvailable()+" "
                        +dateFormat.format(waiter.getStart())+" "+dateFormat.format(waiter.getEnd())+" "+waiter.getOrdersList().size()+" in reading");
                waiterList.put(waiter.getId(), waiter);

            }
        } catch (SQLException ex)
        {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex)
        {
            Logger.getLogger(Waiter.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
