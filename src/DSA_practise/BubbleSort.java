package DSA_practise;

//main function
class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 9, 4, 1};
        ubblesort(arr);
    }

    //bubblesort function
    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //print array
        for (int val : arr) {
            System.out.print(val+" ");
        }
    }
}
