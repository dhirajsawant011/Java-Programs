/*
Question 1:
Given a sorted array (may contain duplicates), find the first and last index of a given number x using binary search.
Example:
arr = [2, 4, 4, 4, 6, 7, 9], x = 4
Output: First = 1, Last = 3
Explanation :
Modify binary search:

To find first occurrence, if arr[mid] == x, move left to check more occurrences.
To find last occurrence, if arr[mid] == x, move right to check more occurrences.

This requires two binary searches.
*/

import java.util.*;

public class DsArray01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(a);
		for(int i=0; i<size; i++)
		{
			
		}
        // Input key to search
        System.out.print("Enter a search key/value: ");
        int skey = sc.nextInt();

        int first = -1;
        int last = -1;

        // ---------- First Occurrence ----------
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == skey) {
                first = mid;
                right = mid - 1; // Keep checking left side
            } else if (a[mid] < skey) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // ---------- Last Occurrence ----------
        left = 0;
        right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (a[mid] == skey) {
                last = mid;
                left = mid + 1; // Keep checking right side
            } else if (a[mid] < skey) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // ---------- Output ----------
        System.out.println("First = " + first + ", Last = " + last);
    }
}
