package br.com.brovetech.githubactions.controller;

import br.com.brovetech.githubactions.service.HelloWorldService;
import ch.qos.logback.core.util.InvocationGate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    @GetMapping
    public Map<String, String> getHelloWorld(){
        return helloWorldService.getHelloWorld();
    }

    @PostMapping("/sum")
    public Map<String, Integer> sumNumbers(@RequestBody Map<String, Integer> numbers){
        Integer[] mappedNumbers = numbers.entrySet().parallelStream().map(Map.Entry::getValue).toArray(Integer[]::new);
        Integer sum = helloWorldService.sumNumbers(mappedNumbers);
        return Collections.singletonMap("sum", sum);
    }

    @PostMapping("/max")
    public Map<String, Integer> maxNumber(@RequestBody Map<String, Integer> numbers){
        Integer[] mappedNumbers = numbers.entrySet().parallelStream().map(Map.Entry::getValue).toArray(Integer[]::new);
        Integer max = helloWorldService.maxNumber(mappedNumbers);
        return Collections.singletonMap("max", max);
    }

    @PostMapping("/min")
    public Map<String, Integer> minNumber(@RequestBody Map<String, Integer> numbers){
        Integer[] mappedNumbers = numbers.entrySet().parallelStream().map(Map.Entry::getValue).toArray(Integer[]::new);
        Integer min = helloWorldService.minNumber(mappedNumbers);
        return Collections.singletonMap("min", min);
    }

    @PostMapping("/avg")
    public Map<String, Double> average(@RequestBody Map<String, Integer> numbers){
        Integer[] mappedNumbers = numbers.entrySet().parallelStream().map(Map.Entry::getValue).toArray(Integer[]::new);
        Double average = helloWorldService.average(mappedNumbers);
        return Collections.singletonMap("average", average);
    }
}
