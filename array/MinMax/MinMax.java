package MinMax;

class MinMax {

    static int arr[] = { 2, 5, 3, 9, 10, 45, 26, 5, 3 };
    static int temp;

    public static void maxNumber() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("=======MIN Number======== : " + arr[arr.length - 1]);
        System.out.println("========MAX Number========= : " + arr[0]);
    }

    public static void main(String[] args) {
        maxNumber();
    }

}