package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1st");
        arrayList.add("2nd");
        arrayList.add("3rd");
        arrayList.add("4rd");

        System.out.println("Traversing the ArrayList using for loop:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("\nTraversing the ArrayList using for-each loop:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("\nTraversing the ArrayList using while loop:");
        int index = 0;
        while (index < arrayList.size()) {
            System.out.println(arrayList.get(index));
            index++;
        }

        System.out.println("\nTraversing the ArrayList using iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}