package com.tnsif.task17;

public class WrapperDemo {
    public static void main(String[] args) {
        // --- Autoboxing ---
        int a = 10;                          // primitive
        Integer objA = a;                   // autoboxing: int -> Integer
        System.out.println("Autoboxed Integer object: " + objA);

        double d = 5.5;
        Double objD = d;                    // autoboxing: double -> Double
        System.out.println("Autoboxed Double object: " + objD);

        char ch = 'X';
        Character objC = ch;                // autoboxing: char -> Character
        System.out.println("Autoboxed Character object: " + objC);

        // --- Auto-unboxing ---
        Integer num = new Integer(100);     // wrapper object
        int b = num;                        // auto-unboxing: Integer -> int
        System.out.println("Auto-unboxed int: " + b);

        Double pi = new Double(3.14);
        double value = pi;                  // auto-unboxing: Double -> double
        System.out.println("Auto-unboxed double: " + value);

        Character letter = new Character('Z');
        char c = letter;                    // auto-unboxing: Character -> char
        System.out.println("Auto-unboxed char: " + c);
    }
}
