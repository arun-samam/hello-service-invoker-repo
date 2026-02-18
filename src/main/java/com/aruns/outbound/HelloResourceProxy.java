package com.aruns.outbound;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name ="hello-service")//,url = "${hello.service.url}")
public interface HelloResourceProxy {

	@GetMapping("/hello/{name}")
	public String invokeSayHello(@PathVariable("name") String name);
}
