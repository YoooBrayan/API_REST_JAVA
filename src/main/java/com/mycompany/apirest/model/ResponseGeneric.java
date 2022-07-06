/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.apirest.model;

/**
 *
 * @author braya
 */
public class ResponseGeneric {
    
    public String message;
    public Boolean rta;
    public int value;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getRta() {
        return rta;
    }

    public void setRta(Boolean rta) {
        this.rta = rta;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
}
