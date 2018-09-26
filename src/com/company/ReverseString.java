package com.company;

public class ReverseString {
    public static void main(String[] args) {
        StringBuffer strbr = new StringBuffer("987654321");
        strbr.reverse();
        System.out.println(strbr);
        strbr.delete(4,9);
        String x="Sumit";
        System.out.println(strbr);
        x.replace('u','o');
    }
}
