import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        //number input
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //reversal of the number
        int x = 0;
        int rev=0;
        while (n > 0) {
            x = n % 10;
            rev = rev * 10 + x;
            n=n/10;
        }
        System.out.println(rev);
    }
}