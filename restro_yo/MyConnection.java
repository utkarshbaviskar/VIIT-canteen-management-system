/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gustorestaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Utkarsh
 */
public class MyConnection
{

    public static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/menu_item", "root", "root");
//            "jdbc:mysql://localhost:3306/projectdb?useSSL=false&autoReconnect=true","root","root");  

        } catch (SQLException | ClassNotFoundException e)
        {
            System.out.println(e.getMessage());

        }

        return con;
    }

    static Object getconnection()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
