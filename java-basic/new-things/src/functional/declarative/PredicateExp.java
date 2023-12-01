package functional.declarative;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static functional.declarative.PredicateExp.Gender.FEMALE;
import static functional.declarative.PredicateExp.Gender.MALE;

public class PredicateExp {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("1", MALE),
                new Person("2", MALE),
                new Person("3", FEMALE),
                new Person("4", FEMALE),
                new Person("5", FEMALE)
        );


        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

//        https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html


    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }


}
