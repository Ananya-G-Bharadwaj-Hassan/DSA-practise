import java.util.Scanner;

class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        //pattern 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        //pattern 2
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        //pattern 3
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j < n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        //pattern 4
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();
        //pattern 5
        for (int i = 0; i < 2 * n; i++) {
            int totalcolsinrow = i > n ? 2 * n - i : i;
            for (int j = 0; j < totalcolsinrow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        //pattern 6
        for (int i = 0; i < 2 * n; i++) {
            int totalColsInRow = i > n ? 2 * n - i : i;
            int spaces = n - totalColsInRow;
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        //pattern 7
        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        //pattern 8
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        //pattern 9
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIdx = Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIdx);
            }
            System.out.println();
        }

        System.out.println();
        //pattern 10
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
