package org.iesvdm.transformer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StrAdderTest {
    @Test
    void testApplyDest() {
        StrAdder tran = new StrAdder("Hello ");
        ArrayList<String> a = new ArrayList<>();
        a.add("Ivan");

        Transformers.applyDest(tran, a);

        assertEquals("Hello Ivan", a.getFirst());
    }

    @Test
    void testTransformList() {
        StrAdder tran = new StrAdder("Hello ");
        LispList<String> l = LispList.<String>empty().cons("Ivan");

        LispList<String> stack = Transformers.transformList(tran, l);

        assertEquals("Hello Ivan", stack.head());
        assertTrue(stack.tail().isEmpty());
    }
}
