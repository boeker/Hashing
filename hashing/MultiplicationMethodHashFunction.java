// Copyright (c) 2014 Jan Böker
// MIT License

package hashing;

import static java.lang.Math.*;

public class MultiplicationMethodHashFunction extends HashFunction {
    private double c;
    public MultiplicationMethodHashFunction(double c) {
        this.c = c;

        if (!(c > 0 && c < 1)) {
            throw new IllegalArgumentException();
        }
    }
    public String toString() {
        return super.toString() + ", c = " + c;
    }
    public int hash(int key) {
        return (int)floor(m*(key*c - floor(key*c)));
    }
}