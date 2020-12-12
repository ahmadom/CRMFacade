/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.property;

import java.util.Date;

/**
 *
 * @author ahmad
 */
abstract class AddLead {
private String Name; 
private String type;
private String phone;
private String inter;
private String Last;
private Date Rented_Date;
private boolean Rented=false;

abstract boolean Rented(Date Rented_Date);
    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

  
    /**
     * @return the Rented_Date
     */
    public Date getRented_Date() {
        return Rented_Date;
    }

    /**
     * @param Rented_Date the Rented_Date to set
     */
    public void setRented_Date(Date Rented_Date) {
        this.Rented_Date = Rented_Date;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the phone
     */
  
    /**
     * @return the inter
     */
    public String getInter() {
        return inter;
    }

    /**
     * @param inter the inter to set
     */
    public void setInter(String inter) {
        this.inter = inter;
    }

    /**
     * @return the Last
     */
    public String getLast() {
        return Last;
    }

    /**
     * @param Last the Last to set
     */
    public void setLast(String Last) {
        this.Last = Last;
    }

    /**
     * @return the Rented
     */
    public boolean isRented() {
        return Rented;
    }

    /**
     * @param Rented the Rented to set
     */
    public void setRented(boolean Rented) {
        this.Rented = Rented;
    }

    
}
