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
public class Compound extends AddLead {
private String Pool;
private String Gym;
private String Security_guard;
@Override
boolean Rented(Date Rented_Date)
    {
        super.setRented_Date(Rented_Date);
        System.out.println("New rented date for "+ super.getName() 
               + " Compound is " + Rented_Date.toString());
        return true;
    }
    /**
     * @return the Pool
     */
    public String getPool() {
        return Pool;
    }

    /**
     * @param Pool the Pool to set
     */
    public void setPool(String Pool) {
        this.Pool = Pool;
    }

    /**
     * @return the Gym
     */
    public String getGym() {
        return Gym;
    }

    /**
     * @param Gym the Gym to set
     */
    public void setGym(String Gym) {
        this.Gym = Gym;
    }

    /**
     * @return the Security_guard
     */
    public String getSecurity_guard() {
        return Security_guard;
    }

    /**
     * @param Security_guard the Security_guard to set
     */
    public void setSecurity_guard(String Security_guard) {
        this.Security_guard = Security_guard;
    }

            
}
