package com.jvision.admin.web;

import com.jvision.admin.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello123";
    }

    @GetMapping("/helloDto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount, @RequestParam("address") String address) {
        return new HelloResponseDto(name, amount, address);
    }
}

