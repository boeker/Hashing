// Copyright (c) 2014 Jan Böker
// MIT License

package hashing;

public abstract class ProbeSequence {
    protected HashFunction hashFunction;
    public ProbeSequence(HashFunction hf) {
        hashFunction = hf;
    }
    public void setM(int m) {
        hashFunction.setM(m);
    }
    public String toString() {
        return hashFunction.toString();
    }
    public abstract int probe(int key, int i);
}