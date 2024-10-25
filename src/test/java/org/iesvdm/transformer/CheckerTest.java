package org.iesvdm.transformer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckerTest {
    @Test
    void testOdd() {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Odd checker = new Odd();

        ArrayList<Integer> fl = Checkers.filterItems(checker, l);

        assertEquals(Arrays.asList(1, 3, 5, 7, 9), fl);
    }

    @Test
    void testLength() {
        ArrayList<String> l = new ArrayList<>(Arrays.asList("ivan", "examen", "daw", "entornos", "java"));
        Length checker = new Length(5);

        ArrayList<String> fl = Checkers.filterItems(checker, l);

        assertEquals(Arrays.asList("ivan", "daw", "java"), fl);
    }
}
