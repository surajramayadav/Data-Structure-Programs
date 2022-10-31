package Reverse;

import java.util.ArrayList;
import java.util.List;

public class ReverseOfArray {

    static List<Integer> list = new ArrayList<Integer>();

    public static void reverseArray() {
        int arr[] = { 1, 2, 3, 4, 5, 6 };

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
            list.add(arr[i]);
        }

    }

    public static void printArray() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" " + list.get(i));
        }
    }

    public static void main(String[] args) {
        reverseArray();
        printArray();
    }
}
