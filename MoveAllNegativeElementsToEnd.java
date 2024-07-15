// Move all negative elements to end
// https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1

import java.util.ArrayList;

public class MoveAllNegativeElementsToEnd {

    public void segregateElements(int[] arr) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                res.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                res.add(arr[i]);
            }
        }
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
    }

    public static void main(String[] args) {
        MoveAllNegativeElementsToEnd obj = new MoveAllNegativeElementsToEnd();
        int[] arr = { 1, -1, 3, 2, -7, -5, 11, 6 };
        obj.segregateElements(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
