package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedWord {
    public static void main(String[] args) {
        String text = "Ram is employee of ABC company, ram is from Blore, RAM! is good in algorithms.";
        List<String> wordsList = Arrays.asList(text.split("[^a-zA-Z0-9]+"));
        Map<String, Long> wordFrequency = wordsList.stream().map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        long maxCount = Collections.max(wordFrequency.values());

        Map<String, Long> maxFrequencyList = wordFrequency.entrySet().stream().filter(e -> e.getValue() == maxCount)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(maxFrequencyList);
    }
}
