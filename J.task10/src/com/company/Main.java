package com.company;


import java.util.Set;
import java.util.TreeSet;

public class Main {


    private static Set <Integer> union(Set <Integer> firstSet, Set <Integer> secondSet) {
        Set <Integer> unionSet = new TreeSet <Integer> ();
        for (Integer currentElement : firstSet) {
            unionSet.add(currentElement);
        }
        for (Integer currentElement : secondSet) {
            unionSet.add(currentElement);
        }
        return unionSet;
    }

    private static Set <Integer> intersect(Set <Integer> firstSet, Set <Integer> secondSet) {
        Set <Integer> intersectSet = new TreeSet <Integer> ();
        for (Integer firstSetElement : firstSet) {
            for (Integer secondSetElement : secondSet) {
                if (firstSetElement == secondSetElement) {
                    intersectSet.add(firstSetElement);
                }
            }
        }
        return intersectSet;
    }
    private static void print_set(String string, Set <Integer> set) {
        if (set.size() != 0) {
            System.out.print(string);
            for (Integer currentElement : set) {
                System.out.print(currentElement + " ");
            }
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        Set <Integer> first = new TreeSet <Integer> ();
        first.add(3);
        first.add(7);
        first.add(8);
        first.add(1);
        first.add(5);
        first.add(4);
        print_set("First set: ", first);

        Set <Integer> second = new TreeSet <Integer> ();
        second.add(1);
        second.add(9);
        second.add(7);
        second.add(0);
        second.add(4);
        second.add(2);

        print_set("Second set: ", second);
        print_set("Union: ", union(first, second));
        print_set("Intersect: ", intersect(first, second));
    }
}



