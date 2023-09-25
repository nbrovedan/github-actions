package br.com.brovetech.githubactions.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
public class HelloWorldService {

    public Map<String, String> getHelloWorld() {
        return Collections.singletonMap("hello","world!!!");
    }
}
