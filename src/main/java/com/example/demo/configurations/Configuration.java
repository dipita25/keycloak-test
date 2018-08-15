/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.configurations;


/**
 *
 * @author dipita
 */

public class Configuration {
    private String jwks_uri;
    public String authorization_endpoint;
    public String token_endpoint;

    public String getJwks_uri(){
        return this.jwks_uri;
    }

	public void setJwks_uri(String jwks_uri){
        this.jwks_uri = jwks_uri;
    }
}