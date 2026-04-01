import java.util.Scanner;
class Subarrays{
    public static void main(String[] args) {
        //number of elements in the array and the elements input
        System.out.println("Enter the number of elements in the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter the elements");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //printing subarrays
        for(int si=0;si<n;si++){
            for(int ei=si;ei<n;ei++){
                for(int k=si;k<=ei;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
}
