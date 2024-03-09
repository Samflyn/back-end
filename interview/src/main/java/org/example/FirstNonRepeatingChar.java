package org.example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "you are awesome";

        var first = str.chars()
                .mapToObj(i -> Character.toLowerCase((char) i))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst();

        first.ifPresent(System.out::println);
    }
}
