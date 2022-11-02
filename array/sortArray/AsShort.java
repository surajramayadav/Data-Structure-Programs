package sortArray;

public class AsShort {
    static int[] arr = { 2, 0, 1, 1, 0, 2 };
    static int temp = 0;

    public static void sort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        sort();
    }
}
