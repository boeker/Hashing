// Copyright (c) 2014 Jan Böker
// MIT License

package hashing;

import java.util.*;

public class SeparateChainingHashTable implements HashTable {
    private LinkedList<Integer>[] array;
    private HashFunction hashFunction;
    @SuppressWarnings("unchecked")
    public SeparateChainingHashTable(int n, HashFunction hf) {
        array = (LinkedList<Integer>[]) new LinkedList<?>[n];
        for (int i = 0; i < n; ++i) {
            array[i] = new LinkedList<Integer>();
        }

        hashFunction = hf;
        hashFunction.setM(n);
    }
    public void insert(int key) {
        array[hashFunction.hash(key)].add(key);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(hashFunction.toString() + "\n");
        for (int i = 0; i < array.length; ++i) {
            sb.append("" + i + ": ");

            for (int h : array[i]) {
                sb.append("" + h + ",");
            }
            if (array[i].size() > 0) {
                sb.setLength(sb.length()-1);
            }

            sb.append("\n");
        }

        return sb.toString();
    }
}