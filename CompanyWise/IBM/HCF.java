// Write a program to find HCF of two numbers by without using recursion.

// Input format:
// The first line contains any 2 positive numbers separated by space.
// Output format:
// Print the HCF of given two numbers.

// Sample Input:
// 70 15
// Sample Output:
// 5

public class HCF {
    public static void main(String[] args) {
        int q1 = 70;
        int q2 = 15;
        System.out.println(hcf(q1, q2));
    }

    public static int hcf(int q1, int q2){
        int a = Math.max(q1, q2);
        int b = Math.min(q1, q2);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
