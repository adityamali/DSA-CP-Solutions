import java.util.*;
import java.io.*;

public class threeSum {

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K) {

        // Write your code here.
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        Arrays.sort(arr);

        int j = 1;
        int k = n - 1;
        for (int i = 0; i < n; i++) {
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] == K) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    res.add(temp);
                }
                if (arr[i] + arr[j] + arr[k] > K) {
                    k--;
                }
                if (arr[i] + arr[j] + arr[k] < K) {
                    j++;
                }
            }

        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<ArrayList<Integer>> res = findTriplets(arr, n, K);
        for (ArrayList<Integer> i : res) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}