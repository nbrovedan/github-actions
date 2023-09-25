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
    void getHelloWorld() {
        Map<String, String> helloWorld = helloWorldService.getHelloWorld();
        Assertions.assertEquals(1, helloWorld.size());
        Assertions.assertNotNull(helloWorld.get("hello"));
        Assertions.assertEquals("world!!!", helloWorld.get("hello"));
    }

    @Test
    void sumNumbers() {
        Integer[] nums = new Integer[]{1,2,3};
        Integer sum = helloWorldService.sumNumbers(nums);
        Assertions.assertEquals(6, sum);
    }
}