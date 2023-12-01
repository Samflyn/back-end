package functional.declarative;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
//        consumer doesn't return a value
        saySomething("Sam");
        greetSomeone.accept("Sam");
        details.accept("Sam", 11);
    }

    static void saySomething(String name) {
        System.out.println("Hello " + name);
    }

    static Consumer<String> greetSomeone = name -> System.out.println("Hello " + name);

    static BiConsumer<String, Integer> details = (name, age) -> System.out.println("Name " + name + "\n" + "Age " + age);
}
