package br.com.brovetech.githubactions.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

@Service
public class HelloWorldService {

    public Map<String, String> getHelloWorld() {
        return Collections.singletonMap("hello","world!!!");
    }

    public Integer sumNumbers(Integer... numbers) {
        if(numbers.length == 0)
        {
            return 0;
        }
        return Arrays.stream(numbers).reduce(0, Integer::sum);
    }

    public Integer maxNumber(Integer... numbers) {
        return Arrays.stream(numbers).max(Comparator.naturalOrder()).orElse(0);
    }

    public Integer minNumber(Integer... numbers) {
        return Arrays.stream(numbers).min(Comparator.naturalOrder()).orElse(0);
    }

    public Double average(Integer... numbers) {
        Integer sum = Arrays.stream(numbers).reduce(0, Integer::sum);
        return sum / (double) numbers.length;
    }
}
