package com.example.rest;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Rest {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String get() throws UnknownHostException {
		InetAddress ip = InetAddress.getLocalHost();
		return "IP --->  " + ip.getHostAddress();
	}
}
