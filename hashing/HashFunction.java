// Copyright (c) 2014 Jan Böker
// MIT License

package hashing;

public abstract class HashFunction {
    protected int m;
    public void setM(int m) {
        this.m = m;
    }
    public int getM() {
        return m;
    }
    public String toString() {
        return "m = " + m;
    }
    public abstract int hash(int key);
}