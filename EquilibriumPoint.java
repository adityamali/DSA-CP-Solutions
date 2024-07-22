// https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1

public class EquilibriumPoint {

    public static int equilibriumPoint(long arr[]) {

        int n = arr.length;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (leftSum == sum) {
                return i + 1;
            }
            leftSum += arr[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        long[] arr = { 1, 3, 5, 2, 2 };
        System.out.println(equilibriumPoint(arr));
    }
}
