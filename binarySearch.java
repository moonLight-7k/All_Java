package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 1, 5, 6, 6, 87, 4, 56};
        Arrays.sort(arr);
        
        int n = arr.length;
        System.out.println(" ");
        System.out.print("Entre the element to search: ");
        int target = scan.nextInt();

        int left = 0;
        int right = n - 1;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == arr[mid]) {
                ans = mid;
                break;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Found at index " + ans);
    }
}
