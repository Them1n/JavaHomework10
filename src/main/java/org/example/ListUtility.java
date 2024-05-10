package org.example;
import java.util.ArrayList;
import java.util.List;

public class ListUtility {
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int num : numbers) {
            stringList.add(String.valueOf(num));
        }
        return stringList;
    }

    public static List<String> doubling(List<String> strings) {
        List<String> doubledStrings = new ArrayList<>();
        for (String str : strings) {
            doubledStrings.add(str + str);
        }
        return doubledStrings;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("Sum of numbers: " + getSum(numbers));
        List<Integer> oddNumbers = getOddNumbers(numbers);
        System.out.println("Odd numbers: " + oddNumbers);
        List<String> stringList = convertToStringList(numbers);
        System.out.println("String list: " + stringList);
        List<String> doubledStrings = doubling(stringList);
        System.out.println("Doubled strings: " + doubledStrings);
    }
}