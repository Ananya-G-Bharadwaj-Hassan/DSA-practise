package DSA_practise;

import java.util.Scanner;

class Reverse {
    public static void main(String args[]) {
        //number of elements in the array and the elements input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //swapping the elements to reverse the array
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k <n; k++) {
            System.out.println(arr[k]);
        }
    }
}


