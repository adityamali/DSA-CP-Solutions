// https://www.naukri.com/code360/problems/find-unique_625159

public class FindUnique {

    public static int findUnique(int[] arr) {
        // Your code goes here
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5 };
        System.out.println(findUnique(arr));
    }
}