package functional.declarative;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getName());

        System.out.println(getNameFull.get());
    }

    static String getName() {
        return "Sam";
    }

    static Supplier<String> getNameFull = () -> "Sam Flynn";
}
