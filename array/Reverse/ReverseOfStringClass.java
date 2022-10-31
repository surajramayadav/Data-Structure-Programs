package Reverse;

class ReverseOfStringClass {

    public static void rvereseArray() {
        String name = "data";
        String result = "";
        System.out.println("Before reverse String :  " + name);

        for (int i = name.length() - 1; i >= 0; i--) {
            // System.out.println(name.charAt(i));
            result = result + name.charAt(i);
        }
        System.out.println("After reverse String : " + result);
    }

    public static void main(String args[]) {
        rvereseArray();
    }

}