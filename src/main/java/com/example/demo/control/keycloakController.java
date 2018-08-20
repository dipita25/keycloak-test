/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.control;

import java.net.HttpURLConnection;
import java.net.URL;

import com.example.demo.dto.LoginDTO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author dipita
 */

@Controller
public class keycloakController {
	@CrossOrigin(origins = "*")
	@PostMapping("/api/connexionTest")
	@ResponseBody
	public LoginDTO home(@RequestBody LoginDTO logindto) throws Exception{

		//redirirect user to the  openIDConnect url

		//if everything is ok,user is redirected here with a code

		//we make a request to the url openidconnect with this code
		//and we receive a jeton

		//we return this jeton to the client who will present it for its futures calls
		
		URL url = new URL("http://localhost:8180");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		return logindto;
	}

	@CrossOrigin(origins="*")
	@GetMapping("dashboard")
	@ResponseBody
	public String gettest(){
		return "DASHBOARD";
	}

	@CrossOrigin(origins="*")
	@GetMapping("configuration")
	@ResponseBody
	public LoginDTO getConfiguration(){

		LoginDTO conf = new LoginDTO("sa","fsf");
		return conf;
	}

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "page1";
	}
		
	@GetMapping("page/test")
	@ResponseBody
	public String customers() {
		return "page2";
	}
}
