package br.com.brovetech.githubactions.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloWorldServiceTest {

    @Autowired
    private HelloWorldService helloWorldService;

    @Test
    void sumNumbers() {
        Integer sum = helloWorldService.sumNumbers(1,2,3);
        Assertions.assertEquals(6, sum);
    }
}