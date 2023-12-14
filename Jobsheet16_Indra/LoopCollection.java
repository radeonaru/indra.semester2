package Jobsheet16_Indra;

import java.util.Stack;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        fruits.set(fruits.size()-1, "Strawberry");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println();
        System.out.print("\nSetelah disort : ");
        //Sorting fruits
        Collections.sort(fruits);

        System.out.println("\n" + fruits.toString());

        System.out.println("\nMengkosongkan elemen : ");
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        // fruits.push("Melon");
        // fruits.push("Durian");
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
