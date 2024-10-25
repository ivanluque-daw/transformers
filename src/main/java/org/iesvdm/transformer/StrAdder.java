package org.iesvdm.transformer;

public class StrAdder implements Transformer<String> {
    private String adder;

    public StrAdder(String adder) {
        this.adder = adder;
    }

    public String transform(String str) {
        return adder + str;
    }
}
