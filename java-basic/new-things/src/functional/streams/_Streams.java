package functional.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static functional.streams._Streams.Gender.FEMALE;
import static functional.streams._Streams.Gender.MALE;

public class _Streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("1", FEMALE),
                new Person("2", MALE),
                new Person("3", FEMALE),
                new Person("4", FEMALE),
                new Person("5", FEMALE)
        );

        Set<Gender> genders = people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet());

        System.out.println(genders);

//        map is used to convert the incoming object
        people.stream()
                .map(person -> person.name)
//                .map(Integer::parseInt)
                .mapToInt(String::length)
                .forEach(System.out::println);

//        to match
        boolean b = people.stream()
//                .allMatch(person -> FEMALE.equals(person.gender));
//                .anyMatch(person -> FEMALE.equals(person.gender));
                .noneMatch(person -> FEMALE.equals(person.gender));

        System.out.println(b);
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
