package br.com.brovetech.githubactions.controller;

import br.com.brovetech.githubactions.service.HelloWorldService;
import ch.qos.logback.core.util.InvocationGate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Map<String, Integer> sumNumbers(@RequestBody Map<String, Integer> numbers){
        Integer[] mappedNumbers = numbers.entrySet().parallelStream().map(Map.Entry::getValue).toArray(Integer[]::new);
        Integer sum = helloWorldService.sumNumbers(mappedNumbers);
        return Collections.singletonMap("sum", sum);
    }
}
