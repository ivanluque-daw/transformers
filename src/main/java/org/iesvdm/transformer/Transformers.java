package org.iesvdm.transformer;

import java.util.ArrayList;

public class Transformers
{
    public static <T> ArrayList<T> applyConst(Transformer<T> tran, ArrayList<T> a)
    {
        ArrayList<T> b = new ArrayList<>();
        for(T t : a)
            b.add(tran.transform(t));
        return b;
    }

    public static <T> void applyDest(Transformer<T> tran, ArrayList<T> a)  {
        for (int i = 0; i < a.size(); i++)  {
            T t = a.get(i);
            a.set(i, tran.transform(t));
        }
    }

    public static <T> LispList<T> transformList(Transformer<T> tran, LispList<T> l) {
        if (l.isEmpty()) {
            return LispList.empty();
        } else {
            T h = tran.transform(l.head());
            LispList<T> t = transformList(tran, l.tail());

            return t.cons(h);
        }
    }
}

