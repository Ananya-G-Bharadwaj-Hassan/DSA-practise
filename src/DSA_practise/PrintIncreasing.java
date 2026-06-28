class increase{
    public static void main(String[] args) {
        printincreasing(7);
    }
    public static void printincreasing(int n) {
        if (n == 0) {
            return;
        }
        printincreasing(n - 1);
        System.out.println(n);
    }
}