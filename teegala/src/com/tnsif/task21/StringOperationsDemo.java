package com.tnsif.task21;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // String (immutable)
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String Operations:");
        System.out.println("str1 length: " + str1.length());
        System.out.println("charAt(1): " + str1.charAt(1));
        System.out.println("Concatenation: " + str1 + " " + str2);
        System.out.println("Substring (1,4): " + str1.substring(1, 4));
        System.out.println("Equals 'Hello'? " + str1.equals("Hello"));
        System.out.println();

        // StringBuffer (mutable, thread-safe)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer Operations:");
        System.out.println("After append: " + sb.toString());
        sb.insert(5, ",");
        System.out.println("After insert: " + sb.toString());
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb.toString());
        sb.delete(5, 6);
        System.out.println("After delete: " + sb.toString());
        System.out.println();

        // StringBuilder (mutable, not thread-safe)
        StringBuilder sbd = new StringBuilder("Hello");
        sbd.append(" World");
        System.out.println("StringBuilder Operations:");
        System.out.println("After append: " + sbd.toString());
        sbd.insert(5, ",");
        System.out.println("After insert: " + sbd.toString());
        sbd.replace(6, 11, "Java");
        System.out.println("After replace: " + sbd.toString());
        sbd.delete(5, 6);
        System.out.println("After delete: " + sbd.toString());
    }
}
