import java.lang.reflect.Array;
import java.util.Scanner;

class dsa {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];
        int i = arr[0];
        int j = arr[n - 1];
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        i++;
        j--;
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }
}


