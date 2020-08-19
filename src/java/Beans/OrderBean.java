/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;

/**
 *
 * @author shameen karunanayake
 */
public class OrderBean implements Serializable {

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
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
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the flavour
     */
    public String getFlavour() {
        return flavour;
    }

    /**
     * @param flavour the flavour to set
     */
    public void setFlavour(String flavour) {
        this.flavour = flavour;
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
    public float calculateAmount(){
        float amount=0;
        
    if(this.flavour.equalsIgnoreCase("cheese Pizza"))
    {
       amount=amount+this.quantity*1500;
    }
    else if(this.flavour.equalsIgnoreCase("chicken Pizza"))
    {
        amount=amount+ this.quantity*1700;
    }
    else if(this.flavour.equalsIgnoreCase("seafood Pizza"))
    {
        amount=amount+ this.quantity*1500;
    }
    else if (this.flavour.equalsIgnoreCase("fish Pizza"))
    {
        amount=amount+ this.quantity*550;
    }
    else{
        amount=amount+ this.quantity*500;
    }
    
    
    return amount;
    }

    private String size;
    private String name;
    private String address;
    private String flavour;
    private int quantity;
    private float amount;

}
