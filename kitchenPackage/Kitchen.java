/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitchenPackage;

import customerPackage.Customer;
import kitchenPackage.*;
import gustorestaurant.MyConnection;
import gustorestaurant.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import menuItems.Inventory;
import menuItems.MainMenu;
import menuItems.MenuItem;
import starting.LoginForm;
import starting.SignUpForm;

/**
 *
 * @author utkarsh
 */
public class Kitchen extends User
{

    private String address;
    private int id;

    public int getId()
    {
        return id;
    }

    public String getMobilePhone()
    {
        return mobilePhone;
    }

    public Kitchen(int id, String name, String username, String mobilePhone, String password, String address)
    {
        super(name, username, mobilePhone, password);
        this.id = id;
        this.address = address;
    }
    public static int getNoKitchens() //for genearting id numbers of new customers
    {
        int count = 0;
        try
        {
            PreparedStatement preparedStmt = MyConnection.getConnection().prepareStatement("SELECT count(*) FROM menu_item.kitchen");
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next())
            {
                count = rs.getInt("count(*)");
            }
            
            preparedStmt.closeOnCompletion();
        } catch (SQLException ex)
        {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
        
    }

    public String getAddress()
    {
        return address;
    }


    public String getName()
    {
        return name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }



    public Kitchen()
    {
    }

    @Override
    public boolean register()
    {
        boolean registered = false; //to hide signup form if successfully signed in
        PreparedStatement ps = null;
        ResultSet rs;
        String query = "SELECT * FROM kitchen WHERE kitchen_username = ?";
        try
        {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, this.userName);
            rs = ps.executeQuery();
            if (rs.next()) //check if username already exists to prevent duplicate entries
            {
                JOptionPane.showMessageDialog(null, "This Username Already Exists");
                SignUpForm.setTextField();
                return registered;
            }
            else
            {
                query = "INSERT INTO `kitchen`(`kitchen_username`, `kitchen_mobile`, `kitchen_password`, `kitchen_name`, `kitchen_address`, `kitchen_id`) VALUES (?,?,?,?,?,?)";
                ps = MyConnection.getConnection().prepareStatement(query);

                String encrypted = User.encryptThisString(this.password);
                ps.setString(1, this.userName);
                ps.setString(2, this.mobilePhone);
                ps.setString(3, encrypted);
                ps.setString(4, this.name);
                ps.setString(5, this.address);
                ps.setInt(6, this.id);
                this.password = encrypted;
                if (ps.executeUpdate() > 0)
                {
                    KitchenWelcomeForm cf = new KitchenWelcomeForm(this, null);
                    cf.setVisible(true);
                    registered = true;
                }
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(Kitchen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return registered;
    }

    @Override
    public boolean login(String cuserName, String cPassword)
    {
        boolean loggedIn = false;
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM kitchen WHERE kitchen_username=? AND  kitchen_password=?";
        try
        {
            ps = MyConnection.getConnection().prepareStatement(query);
            String encrypted = User.encryptThisString(cPassword);
            ps.setString(1, cuserName);
            ps.setString(2, encrypted);
            rs = ps.executeQuery();
            if (rs.next())
            {
                String cphone = rs.getString("kitchen_mobile");
                String cname = rs.getString("kitchen_name");
                String caddress = rs.getString("kitchen_address");
                int cid = rs.getInt("kitchen_id");
                Kitchen c = new Kitchen(cid, cname, cuserName, cphone, cPassword, caddress);
                System.out.println(c.getId());
                KitchenWelcomeForm cf = new KitchenWelcomeForm(c, null);
                cf.setVisible(true);
                loggedIn = true;
            }
            else
            {
                LoginForm.setTextFields();
                JOptionPane.showMessageDialog(null, "Username or password incorrect.", "Login Failed", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex)
        {
            Logger.getLogger(Kitchen.class.getName()).log(Level.SEVERE, null, ex);
        }
        return loggedIn;
    }


}
