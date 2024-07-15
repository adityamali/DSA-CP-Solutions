// https://www.naukri.com/code360/problems/sort-0-1-2_631055

public class Sort012 {
    public static void sort012(int[] arr) {
        // Write your code here

        // Shortcut
        // Arrays.sort(arr);

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            } else if (arr[i] == 1) {
                ones++;
            } else {
                twos++;
            }
        }

        for (int i = 0; i < zeros; i++) {
            arr[i] = 0;
        }
        for (int i = zeros; i < zeros + ones; i++) {
            arr[i] = 1;
        }
        for (int i = zeros + ones; i < zeros + ones + twos; i++) {
            arr[i] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2, 0, 1, 2 };
        sort012(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
