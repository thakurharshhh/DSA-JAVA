// Insertion sort have Time Complexity T(n) = O(n^2).
package Sorting;

import java.util.Scanner;

public class Insertion {
        public static void main(String[] args) {
            Scanner z = new Scanner(System.in);
            System.out.print("Enter the Size of Array: ");
            int n = z.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter the element at [" + i + "]: ");
                arr[i] = z.nextInt();
            }

            sort(arr);

            System.out.println("Sorted Array using Selection Sort: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        public static void sort(int[] array) {
            for (int i = 1; i < array.length; i++) {
                int key = array[i];  // Element to be inserted
                int j = i - 1;
                // Shift elements that are greater than key
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = key;  // Insert the element at the correct position
            }
        }
    }
