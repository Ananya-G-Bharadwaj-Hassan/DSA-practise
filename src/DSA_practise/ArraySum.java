import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        int[] arr = new int[n];
        int sum = 0;

        // Input elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of the elements in array is " + sum);
    }
}
