package KthSmallestElement;

public class KthSmall {

    static int[] arr = { 3, 2, 8, 10, 57, 27 };
    static int temp = 0;

    public static void findKth(int a) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Kth Minimum Element : " + arr.length + " " + arr[arr.length - a]);
    }

    public static void main(String[] args) {
        findKth(3);
    }
}
