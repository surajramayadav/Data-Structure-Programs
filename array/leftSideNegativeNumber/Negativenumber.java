package leftSideNegativeNumber;

public class Negativenumber {

    static int[] arr = { 5, 62, 83, -23, 82, -73, 33, -75, -74, 0 };

    static public void SortNegativeNumber() {
        int j = 0, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        SortNegativeNumber();
    }
}
