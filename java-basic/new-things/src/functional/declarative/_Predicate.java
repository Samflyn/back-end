package functional.declarative;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isSam("San"));

        System.out.println(isSamFlynn.test("Sam"));

        System.out.println(isSamFlynn.negate().test("Sam"));

        System.out.println(isSamFlynn.and(isFlynn).test("SamFlynn"));

        System.out.println(isSamFlynn.or(isFlynn).test("SamFl"));

        System.out.println(isFlynnAge.test("Flynn",10));
    }

    static boolean isSam(String name) {
        return name.startsWith("Sam");
    }

    static Predicate<String> isSamFlynn = name -> name.startsWith("Sam");

    static Predicate<String> isFlynn = name -> name.endsWith("Flynn");

    static BiPredicate<String, Integer> isFlynnAge = (name, age) -> name.endsWith("Flynn") && age.equals(10);
}
