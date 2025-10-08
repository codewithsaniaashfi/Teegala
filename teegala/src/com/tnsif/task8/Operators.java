package com.tnsif.task8;

public class Operators {
    public static void main(String[] args) {
        // Declare variables
        int a = 10, b = 5;
        int result;

        // 1. Arithmetic Operators
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus

        // 2. Relational Operators
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b: " + (a == b));   // Equal to
        System.out.println("a != b: " + (a != b));   // Not equal to
        System.out.println("a > b: " + (a > b));     // Greater than
        System.out.println("a < b: " + (a < b));     // Less than
        System.out.println("a >= b: " + (a >= b));   // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));   // Less than or equal to

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\n=== Logical Operators ===");
        System.out.println("x && y: " + (x && y));   // AND
        System.out.println("x || y: " + (x || y));   // OR
        System.out.println("!x: " + (!x));           // NOT

        // 4. Assignment Operators
        System.out.println("\n=== Assignment Operators ===");
        result = a;
        System.out.println("result = a: " + result);
        result += b;
        System.out.println("result += b: " + result);
        result -= b;
        System.out.println("result -= b: " + result);
        result *= b;
        System.out.println("result *= b: " + result);
        result /= b;
        System.out.println("result /= b: " + result);
        result %= b;
        System.out.println("result %= b: " + result);

        // 5. Unary Operators
        System.out.println("\n=== Unary Operators ===");
        int num = 5;
        System.out.println("num = " + num);
        System.out.println("++num = " + (++num));  // Pre-increment
        System.out.println("num++ = " + (num++));  // Post-increment
        System.out.println("num after post-increment: " + num);
        System.out.println("--num = " + (--num));  // Pre-decrement
        System.out.println("num-- = " + (num--));  // Post-decrement
        System.out.println("num after post-decrement: " + num);

        // 6. Bitwise Operators
        int p = 6;   // 110
        int q = 3;   // 011
        System.out.println("\n=== Bitwise Operators ===");
        System.out.println("p & q = " + (p & q));  // AND
        System.out.println("p | q = " + (p | q));  // OR
        System.out.println("p ^ q = " + (p ^ q));  // XOR
        System.out.println("~p = " + (~p));        // NOT
        System.out.println("p << 1 = " + (p << 1)); // Left shift
        System.out.println("p >> 1 = " + (p >> 1)); // Right shift

        // 7. Ternary Operator
        System.out.println("\n=== Ternary Operator ===");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);
    }
}

