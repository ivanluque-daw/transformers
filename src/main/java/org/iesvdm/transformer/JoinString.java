package org.iesvdm.transformer;

public class JoinString implements Joiner<String> {
    public String join(String str1, String str2) {
        return str1 + " " + str2;
    }
}
