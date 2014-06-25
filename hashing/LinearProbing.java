// Copyright (c) 2014 Jan Böker
// MIT License

package hashing;

public class LinearProbing extends ProbeSequence {
    public LinearProbing(HashFunction hf){
        super(hf);
    }
    public int probe(int key, int i) {
        return (hashFunction.hash(key) + i) % hashFunction.getM();
    }
}