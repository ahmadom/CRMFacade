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
public class Villa extends AddLead {
private String Watchman;
private String Cameras;
private String AC_Type;
@Override
boolean Rented(Date Rented_Date)
    {
        super.setRented_Date(Rented_Date);
        System.out.println("New rented date for "+ super.getName() 
               + " Villa is " + Rented_Date.toString());
        return true;
    }
    /**
     * @return the Watchman
     */
    public String getWatchman() {
        return Watchman;
    }

    /**
     * @param Watchman the Watchman to set
     */
    public void setWatchman(String Watchman) {
        this.Watchman = Watchman;
    }

    /**
     * @return the Cameras
     */
    public String getCameras() {
        return Cameras;
    }

    /**
     * @param Cameras the Cameras to set
     */
    public void setCameras(String Cameras) {
        this.Cameras = Cameras;
    }

    /**
     * @return the AC_Type
     */
    public String getAC_Type() {
        return AC_Type;
    }

    /**
     * @param AC_Type the AC_Type to set
     */
    public void setAC_Type(String AC_Type) {
        this.AC_Type = AC_Type;
    }

}
