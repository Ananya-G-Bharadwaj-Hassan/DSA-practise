package DSA_practise;

import java.util.Scanner;

class minmaxarray {
    public static void main(String[] args) {
        //number of elements in the array and the elements input
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Array is empty");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements");

        // Read first element
        arr[0] = sc.nextInt();
        int min = arr[0];
        int max = arr[0];

        // Read remaining elements
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int res = max + min;
        System.out.println("Sum of maximum and minimum elements is: " + res);
    }
}