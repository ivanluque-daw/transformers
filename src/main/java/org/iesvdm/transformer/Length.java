package org.iesvdm.transformer;

public class Length implements Checker<String> {
    private int max;

    public Length(int max) {
        this.max = max;
    }

    public boolean check(String str) {
        return str.length() <= max;
    }
}
