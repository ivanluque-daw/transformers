package org.iesvdm.transformer;


import java.util.ArrayList;

public class Joiners
{
    public static <T> LispList<T> zipLists(Joiner<T> joiner,LispList<T> ls1,LispList<T> ls2)
    {
        if(ls1.isEmpty()||ls2.isEmpty())
            return LispList.empty();
        else
        {
            T h = joiner.join(ls1.head(),ls2.head());
            LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());
            return t.cons(h);
        }
    }

    public static <T> ArrayList<T> zipArrayLists(Joiner<T> joiner, ArrayList<T> ls1, ArrayList<T> ls2) {
        ArrayList<T> stack = new ArrayList<>();
        int min = Math.min(ls1.size(), ls2.size());

        for (int i = 0; i < min; i++) {
            T h = joiner.join(ls1.get(i), ls2.get(i));
            stack.add(h);
        }

        return stack;
    }

    public static <T> T fold(Joiner<T> joiner, ArrayList<T> list) {
        return list.stream().reduce(joiner::join).orElse(null);
    }
}