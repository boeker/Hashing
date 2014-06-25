// Copyright (c) 2014 Jan Böker
// MIT License

package hashing;

public class DivisionMethodHashFunction extends HashFunction {
    public int hash(int key) {
        return key % m;
    }
}