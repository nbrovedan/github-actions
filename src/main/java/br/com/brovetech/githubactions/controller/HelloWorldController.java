package br.com.brovetech.githubactions.controller;

import br.com.brovetech.githubactions.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    @GetMapping
    public Map<String, String> getHelloWorld(){
        return helloWorldService.getHelloWorld();
    }
}
