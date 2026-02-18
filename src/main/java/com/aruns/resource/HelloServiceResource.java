package com.aruns.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.aruns.outbound.HelloResourceProxy;

@RestController
public class HelloServiceResource {

	@Autowired
	private HelloResourceProxy proxy;
	
	@GetMapping("/hello/{name}")
	public String invokeRemoteMethod(@PathVariable("name")String name) {
		return proxy.invokeSayHello(name);
	}
}
