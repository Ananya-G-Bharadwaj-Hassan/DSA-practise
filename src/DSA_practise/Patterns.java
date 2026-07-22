import java.util.Scanner;

class patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //pattern 1
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        //pattern 2
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        //pattern 3
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j<n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}