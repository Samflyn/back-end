package org.example;

// time complexity -> time taken for code to run
// space complexity -> memory consumed for the code to run
// Omega -> Best case
// Theta -> Average case
// Omicron (O) -> Worst case
// O(1) > O(log n) > O(n) > O(n log n) > O(n^2)
public class BigO {

    public static void main(String[] args) {
        oOfN();
        oOfNSquare();
        oOfOne();
        oOfLogN();
    }

    private static void oOfLogN() {
        // split an array and check if the number exists in the divided half
    }

    private static void oOfOne() {
        System.out.println(10);
    }

    // drop non-dominants O(n^2 + n) -> O(n^2)
    // O(n^2)
    // even if we have another nested loop it would not be O(n^3)
    // it's just called O(n^2)
    private static void oOfNSquare() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    // drop constants O(2n) -> O(n)
    // always proportional
    // even if we loop through them multiple times it's never O(2n)
    // we drop the constants and call it O(n)
    private static void oOfN() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
