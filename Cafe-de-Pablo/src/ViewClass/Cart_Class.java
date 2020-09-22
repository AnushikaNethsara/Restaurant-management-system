/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Acer
 */
public class Cart_Class {
    private String id;
    private String name;
    private String category;
    private int quantity;
    private double price;
    public static ArrayList <Cart_Class> cartArray=new ArrayList<Cart_Class>();
    
    public Cart_Class(String id,String name,String category,int quantity,double price){
        this.id=id;
        this.name=name;
        this.category=category;
        this.price=price;
        this.quantity=quantity;  
   
    }
    
    

    public Cart_Class() {
        this.id="";
        this.name="";
        this.category="";
        this.price=0;
        this.quantity=0; 
    }
    
    
    public ArrayList <Cart_Class> viewItems(){
        return cartArray;
    }
    
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    
}
