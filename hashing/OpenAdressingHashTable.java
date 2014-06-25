// Copyright (c) 2014 Jan Böker
// MIT License

package hashing;

import java.util.*;

public class OpenAdressingHashTable implements HashTable {
    private int[] array;
    private ProbeSequence probeSequence;
    public OpenAdressingHashTable(int n, ProbeSequence ps) {
        array = new int[n];
        Arrays.fill(array, -1);

        probeSequence = ps;
        probeSequence.setM(n);
    }
    public void insert(int key) {
        if (!(key >= 0)) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < array.length; ++i) {
            int pos = probeSequence.probe(key, i);
            if (array[pos] == -1) {
                array[pos] = key;
                return;
            }
        }
        throw new NoFreeSlotException();
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(probeSequence.toString() + "\n");
        sb.append(Arrays.toString(array).replaceAll("-1", ""));

        return sb.toString();
    }
    static class NoFreeSlotException extends RuntimeException {
    }
}
