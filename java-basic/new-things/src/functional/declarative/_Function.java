package functional.declarative;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(0));

        System.out.println(incrementOne.apply(1));

        System.out.println(multiplyByTen.apply(incrementOne.apply(2)));

        System.out.println(incMul.apply(4));

        System.out.println(incOneMulTem.apply(1, 100));
    }

    static Function<Integer, Integer> incrementOne = number -> number + 1;

    static Function<Integer, Integer> multiplyByTen = number -> number * 10;

    static Function<Integer, Integer> incMul = incrementOne.andThen(multiplyByTen);

    static BiFunction<Integer, Integer, Integer> incOneMulTem = (numToInc, numToMul) -> (numToInc + 1) * numToMul;

    static int increment(int number) {
        return number + 1;
    }
}
