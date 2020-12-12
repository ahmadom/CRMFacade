/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.property;

/**
 *
 * @author ahmad
 */
public class User {
    private String Username;
    private String Password;
    /**
     * @return the Username
     */
     public User(String user, String pass)
    {
        this.Username = user;
        this.Password = pass;
    }
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

     
}
