package com.shyamal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shyamal.remoteclient.HellloClient;



@RestController
public class Hiclient {
@Autowired
 private HellloClient client;
	@GetMapping("/hi/{name}")
	public String sayHiee(@PathVariable("name") String name) {
		
	System.out.println("Implementation classname is :: " + client.getClass().getName());

		String hieeMsg = "hiee";

	String helloMsg = client.invokeHelloService(name);

		return hieeMsg + "----  " + name +helloMsg+ ""+" how r u ?";
	}
}
