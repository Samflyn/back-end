package org.example;

public class NumberToWords {

    private static final String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] groups = {"", "Thousand", "Million", "Billion"};

    public static String numberToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        StringBuilder sb = new StringBuilder();
        int groupIndex = 0;

        while (number > 0) {
            int chunk = number % 1000; // Extract the last three digits
            sb.insert(0, convertChunk(chunk) + groups[groupIndex] + " ");
            number /= 1000;
            groupIndex++;
        }

        return sb.toString().trim();
    }

    private static String convertChunk(int chunk) {
        StringBuilder sb = new StringBuilder();
        int hundred = chunk / 100;
        chunk %= 100;

        if (hundred > 0) {
            sb.append(ones[hundred] + " Hundred ");
        }

        if (chunk < 20) {
            sb.append(ones[chunk]);
        } else {
            sb.append(tens[chunk / 10]);
            if (chunk % 10 > 0) {
                sb.append(" " + teens[chunk % 10]);
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        int number = 12345;
        String words = numberToWords(number);
        System.out.println(words); // Output: Twelve Thousand Three Hundred Forty Five
    }
}