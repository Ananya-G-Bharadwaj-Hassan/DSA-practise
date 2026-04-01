package DSA_practise;

class Main {
    public static void main(String[] args) {
        System.out.println(search(5));
    }

    static int Search(int n) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return 1; // found
            }
        }
        return 0; // not found
    }
}
