package com.shyamal.remoteclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient("Hello-SERVICE")
public interface HellloClient {
	@GetMapping("/hello/{name}")
	public String invokeHelloService(@PathVariable("name") String name);
}
