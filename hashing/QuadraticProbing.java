// Copyright (c) 2014 Jan Böker
// MIT License

package hashing;

public class QuadraticProbing extends ProbeSequence {
    private double c1;
    private double c2;
    public QuadraticProbing(HashFunction hf, double c1, double c2){
        super(hf);
        this.c1 = c1;
        this.c2 = c2;

        if (!(c1 != 0 && c2 != 0)) {
            throw new IllegalArgumentException();
        }
    }
    public String toString() {
        return super.toString() + ", c1 = " + c1 + ", c2 = " + c2;
    }
    public int probe(int key, int i) {
        return ((int)(hashFunction.hash(key) + c1*i + c2*i*i)) % hashFunction.getM();
    }
}