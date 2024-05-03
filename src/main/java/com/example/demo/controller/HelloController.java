package com.example.demo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/hello")
@RequiredArgsConstructor
public class HelloController {

	@GetMapping
	public Mono<String> helloRequest() {
		Mono<String> response = Mono.just("Hello");
		return response;
	}
}