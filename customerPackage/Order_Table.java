/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerPackage;

import gustorestaurant.MyConnection;
import gustorestaurant.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import starting.LoginForm;
import starting.SignUpForm;

/**
 *
 * @author utkarsh
 */
public class Order_Table {
 
	private String   id,user_id,product_id,product_quantity,price,oreder_date,is_served,customer_mobile,user_full_name;
	Order_Table(){
		this.id = "";
		this.user_id = "";
		this.product_id = "";
		this.product_quantity  = "";
		this.price = "";
		this.oreder_date = "";
		this.is_served = "";
		this.customer_mobile = "";
		this.user_full_name = "";
	}
	Order_Table(String id,String user_id,String product_id,String product_quantity,String price, String order_date,String is_served,String customer_mobile,String user_full_name ){
		this.id = id;
		this.user_id = user_id;
		this.product_id = product_id;
		this.product_quantity  = product_quantity;
		this.price = price;
		this.oreder_date = order_date;
		this.is_served = is_served;
		this.customer_mobile = customer_mobile;
		this.user_full_name = user_full_name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(String product_quantity) {
		this.product_quantity = product_quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getOreder_date() {
		return oreder_date;
	}
	public void setOreder_date(String oreder_date) {
		this.oreder_date = oreder_date;
	}
	public String getIs_served() {
		return is_served;
	}
	public void setIs_served(String is_served) {
		this.is_served = is_served;
	}
	public void setCustomer_mobile(String customer_mobile){
		this.customer_mobile = customer_mobile;
	}
	public String getCustomer_mobile(){
		return this.customer_mobile;
	}
	public String getUser_full_name() {
		return user_full_name;
	}
	public void setUser_full_name(String user_full_name) {
		this.user_full_name = user_full_name;
	}
        
        
}
