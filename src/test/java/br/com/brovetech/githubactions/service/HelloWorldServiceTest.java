package br.com.brovetech.githubactions.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloWorldServiceTest {

    @Autowired
    private HelloWorldService helloWorldService;

    @Test
    void testSumNumbers() {
        Integer result = helloWorldService.sumNumbers(1,2,3);
        Assertions.assertEquals(6, result);
    }

    @Test
    void maxNumber() {
        Integer result = helloWorldService.maxNumber(1,2,3);
        Assertions.assertEquals(3, result);
    }

    @Test
    void minNumber() {
        Integer result = helloWorldService.minNumber(1,2,3);
        Assertions.assertEquals(1, result);
    }

    @Test
    void average() {
        Double result = helloWorldService.average(1,2,3);
        Assertions.assertEquals(2, result);
    }

    @Test
    void getHelloWorld() {
        Map<String, String> result = helloWorldService.getHelloWorld();
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("world!!!", result.get("hello"));
    }
}