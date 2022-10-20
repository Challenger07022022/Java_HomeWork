package OOP_HomeWork3.Task1;

import java.util.Iterator;
import java.util.Random;

public class Randomiser implements Iterable<Integer> {
    private int count;
    private int bound;

    public Randomiser(int count, int bound) {
        this.count = count;
        this.bound = bound;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int i = count;
            private Random rd = new Random();

            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public Integer next() {
                i--;
                return rd.nextInt(bound);
            }
        };
    }
}
