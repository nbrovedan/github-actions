package br.com.brovetech.githubactions.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.Map;

@SpringBootTest
class HelloWorldControllerTest {

    @Autowired
    private HelloWorldController helloWorldController;

    @Test
    void getHelloWorld() {
        Map<String,String> result = helloWorldController.getHelloWorld();
        Assertions.assertFalse(result.isEmpty());
        Assertions.assertEquals("world!!!", result.get("hello"));
    }

    @Test
    void sumNumbers() {
        Map<String, Integer> result = helloWorldController.sumNumbers(Collections.singletonMap("1", 1));
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(1, result.get("sum"));
    }

    @Test
    void maxNumber() {
        Map<String, Integer> result = helloWorldController.maxNumber(Collections.singletonMap("1", 1));
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(1, result.get("max"));
    }

    @Test
    void minNumber() {
        Map<String, Integer> result = helloWorldController.minNumber(Collections.singletonMap("1", 1));
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(1, result.get("min"));
    }

    @Test
    void average() {
        Map<String, Double> result = helloWorldController.average(Collections.singletonMap("1", 1));
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(1.0, result.get("average"));
    }
}