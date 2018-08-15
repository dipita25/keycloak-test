/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto;


/**
 *
 * @author dipita
 */

public class LoginDTO {
    private String login;
    private String password;

    public LoginDTO(String login,String password){
        this.login = login;
        this.password = password;
    }

    public String getLogin(){
        return this.login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPasword(String password){
        this.password = password;
    }
}