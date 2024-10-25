package org.iesvdm.transformer;

import java.util.ArrayList;

public class Checkers {
    public static <T> ArrayList<T> filterItems(Checker<T> checker, ArrayList<T> l) {
        return new ArrayList<>(l.stream().filter(checker::check).toList());
    }
}
