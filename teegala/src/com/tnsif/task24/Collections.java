package com.tnsif.task24;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // 1. ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Apple");  // duplicates allowed
        System.out.println("ArrayList: " + arrayList);

        // 2. HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple");  // duplicates ignored
        System.out.println("HashSet: " + hashSet);

        // 3. LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");  // duplicates ignored
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // 4. LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Apple");  // duplicates allowed
        System.out.println("LinkedList: " + linkedList);

        // 5. PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        System.out.print("PriorityQueue (poll order): ");
        while (!priorityQueue.isEmpty()) {
            System.out.print(priorityQueue.poll() + " ");  // natural ascending order
        }
        System.out.println();

        // 6. Stack
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.print("Stack (pop order): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");  // LIFO
        }
        System.out.println();

        // 7. TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        System.out.println("TreeSet (sorted): " + treeSet);

        // 8. Vector
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Apple");  // duplicates allowed
        System.out.println("Vector: " + vector);
    }
}
