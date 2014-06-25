// Copyright (c) 2014 Jan Böker
// MIT License

import hashing.*;

public class Example {
    public static void main(String[] args) {
        HashTable hashTable;

        System.out.println("T1) a)");
        int[] t1a = {60, 64, 63, 49, 56, 44, 68, 86, 80, 7, 13, 14, 19, 20, 32};
        hashTable = new SeparateChainingHashTable(13,
                new DivisionMethodHashFunction());
        for (int i : t1a) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
        System.out.println("");

        System.out.println("T1) b)");
        int[] t1b = {44, 38, 9, 17, 67, 48, 14, 83, 95, 13, 28, 42, 78, 51, 31};
        hashTable = new SeparateChainingHashTable(13,
                new MultiplicationMethodHashFunction(0.62));
        for (int i : t1b) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
        System.out.println("");

        System.out.println("T3) a)");
        int[] t3a = {63, 2, 5, 89, 33, 74, 95, 42, 5, 86};
        hashTable = new OpenAdressingHashTable(11,
                new LinearProbing(new DivisionMethodHashFunction()));
        for (int i : t3a) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
        System.out.println("");

        System.out.println("T3) b)");
        int[] t3b = {20, 93, 90, 42, 21, 67, 81, 72, 97, 84};
        hashTable = new OpenAdressingHashTable(13,
                new QuadraticProbing(new DivisionMethodHashFunction(), 3.0, 7.0));
        for (int i : t3b) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
        System.out.println("");

        System.out.println("T3) c)");
        int[] t3c = {16, 22, 54, 27, 52, 57, 97, 58, 97, 80};
        hashTable = new OpenAdressingHashTable(11,
                new LinearProbing(new MultiplicationMethodHashFunction(0.56)));
        for (int i : t3c) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
        System.out.println("");

        System.out.println("T3) d)");
        int[] t3d = {74, 96, 95, 52, 26, 24, 6, 52, 22, 31};
        hashTable = new OpenAdressingHashTable(11,
                new QuadraticProbing(new MultiplicationMethodHashFunction(0.23), 2.0, 5.0));
        for (int i : t3d) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
        System.out.println("");


        System.out.println("A2) a)");
        int[] a2a = {36, 74, 39, 57, 21, 53, 19, 34, 20, 58, 69, 10, 42, 61, 94};
        hashTable = new SeparateChainingHashTable(13,
                new DivisionMethodHashFunction());
        for (int i : a2a) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
        System.out.println("");

        System.out.println("A2) b)");
        int[] a2b = {55, 54, 37, 36, 5, 15, 26, 33, 88, 25, 11, 45, 29, 68, 22};
        hashTable = new SeparateChainingHashTable(13,
                new MultiplicationMethodHashFunction(0.62));
        for (int i : a2b) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
        System.out.println("");

        System.out.println("A4) a)");
        int[] a4a = {53, 80, 98, 41, 35, 75, 44, 17, 48, 96};
        hashTable = new OpenAdressingHashTable(11,
                new LinearProbing(new DivisionMethodHashFunction()));
        for (int i : a4a) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
        System.out.println("");

        System.out.println("A4) b)");
        int[] a4b = {30, 6, 9, 31, 64, 97, 96};
        hashTable = new OpenAdressingHashTable(11,
                new QuadraticProbing(new DivisionMethodHashFunction(), 3.0, 7.0));
        for (int i : a4b) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
        System.out.println("");

        System.out.println("A4) c)");
        int[] a4c = {46, 45, 98, 13, 29, 46, 1, 93, 2, 90};
        hashTable = new OpenAdressingHashTable(11,
                new LinearProbing(new MultiplicationMethodHashFunction(0.34)));
        for (int i : a4c) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
        System.out.println("");

        System.out.println("A4) d)");
        int[] a4d = {10, 25, 23, 25, 64, 69, 47, 61, 73, 72};
        hashTable = new OpenAdressingHashTable(13,
                new QuadraticProbing(new MultiplicationMethodHashFunction(0.34), 0.5, 0.5));
        for (int i : a4d) {
            hashTable.insert(i);
        }
        System.out.println(hashTable);
    }
}