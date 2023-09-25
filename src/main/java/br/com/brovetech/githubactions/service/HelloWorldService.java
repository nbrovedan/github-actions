package br.com.brovetech.githubactions.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

@Service
public class HelloWorldService {

    public Map<String, String> getHelloWorld() {
        return Collections.singletonMap("hello","world!!!");
    }

    public Integer sumNumbers(Integer... numbers) {
        return Arrays.stream(numbers).reduce(0, Integer::sum);
    }
}
