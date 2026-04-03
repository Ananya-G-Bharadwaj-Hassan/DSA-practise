package DSA_practise;

import java.util.Scanner;
class palindrome{
    public static void main(String[] args) {
        //number input
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //reversal of the number
        int rev=0;
        int temp=n;
        while(n>0){
            int x=n%10;
            rev=rev*10+x;
            n/=10;
        }

        //if number is equal to the reversed number, it is DSA_practise.palindrome, else not
        if(temp==rev){
            System.out.println("The number "+ temp+ " is DSA_practise.palindrome");
        }
        else{
            System.out.println("The number "+ temp + " is not DSA_practise.palindrome");
        }
    }
}