package HW5;

import java.util.LinkedList;

public class Ex5_ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        System.out.println("Original LinkedList: " + numbers);
        reverseLinkedList(numbers);
        System.out.println("Reversed LinkedList: " + numbers);

    }

    public static void reverseLinkedList(LinkedList<Integer>numbers) {
        LinkedList<Integer> reversedList = new LinkedList<>();

        for (int i = numbers.size() -1; i >= 0 ; i--) {
            reversedList.add(numbers.get(i));
        }
        numbers.clear();
        numbers.addAll(reversedList);
    }
}