package org.iesvdm.transformer;

public class Odd implements Checker<Integer> {
    public boolean check(Integer n) {
        return n % 2 != 0;
    }
}
