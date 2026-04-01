import java.util.Scanner;
class countofdigits{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //counting the digits by retrieving the last digit
        int count=0;
        while(n>0){
            count+=1;
            n=n/10;
        }
        System.out.println(count);
    }
}