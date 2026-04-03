package DSA_practise;

import java.util.Scanner;

class armstrong{
    public static void main(String[] args) {
        //number input
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //extract last digit and sum their cubes
        int temp=n;
        int sum=0;
        int rev=0;
        while(n>0){
            int x=n%10;
            sum+=x*x*x;
            n/=10;
        }

        //check if armstrong number or not
        if(temp==sum){
            System.out.println("The number "+ temp +" is an armstrong number");
        }
        else{
            System.out.println("The number "+ temp +" is not an armstrong number");
        }
    }
}