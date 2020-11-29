
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.property;

import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.*; 
/**
 *
 * @author ahmad
 */
public class CRMFacade {
    private static CRMFacade instance;
    private ArrayList<AddLead>PropertiyAddLead;

private CRMFacade()
{
  this.PropertiyAddLead = new ArrayList<AddLead>();
}
  
    public static CRMFacade getInstance()
    {
       if(instance != null)
       {
           return instance;
       }
       else
       {
           instance = new CRMFacade();
           return instance;
       }
    }
    public AddLead getAddLead(int i)
    {
        return this.PropertiyAddLead.get(i);
    }
    public boolean addAddLead(AddLead newAddLead)
    {
        this.getPropertiyAddLead().add(newAddLead);
        return true;
    }
    public boolean addAddLead(String name, String type,String phone,String last,String inter, Dictionary info)
    {
        AddLead toAdd;
        if(type.equals("Villa"))
        {
            toAdd = new Villa();
            ((Villa)toAdd).setWatchman(info.get("Watchman").toString());
            ((Villa)toAdd).setAC_Type(info.get("Ac_Type").toString());
            ((Villa)toAdd).setCameras(info.get("Cameras").toString());
        }
        else
        {
            toAdd = new Compound();
            ((Compound)toAdd).setPool(info.get("Pool").toString());
            ((Compound)toAdd).setGym(info.get("Gym").toString());
            ((Compound)toAdd).setSecurity_guard(info.get("Security_guard").toString());
        }
        toAdd.setName(name);
        toAdd.setLast(last);
        toAdd.setInter(inter);
        toAdd.setType(type);
        toAdd.setPhone(phone);
        this.getPropertiyAddLead().add(toAdd);
        return true;
    }
    
    public boolean RentedCompound(AddLead Compound, Date Rented_Date)
    {
        for (AddLead PropertiyAddLead : this.getPropertiyAddLead()) {
            if(PropertiyAddLead.getName().equals(Compound.getName()))
            {
                if(PropertiyAddLead.isRented())
                {
                    PropertiyAddLead.Rented(Rented_Date);
                    PropertiyAddLead.setRented(true);
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
                    return false;
    }
    public boolean RentedVilla(AddLead Villa, Date Rented_Date)
    {
        for (AddLead PropertiyAddLead : this.getPropertiyAddLead()) {
            if(PropertiyAddLead.getName().equals(Villa.getName()))
            {
                if(!PropertiyAddLead.isRented())
                {
                    PropertiyAddLead.Rented(Rented_Date);
                    PropertiyAddLead.setRented(true);
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return false;
    }
   
    
    
    

    
    /**
     * @return the PropertiyAddLead
     */
    public ArrayList<AddLead> getPropertiyAddLead() {
        return PropertiyAddLead;
    }
}

