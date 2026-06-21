class Insertionsort {
    //main function

    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 9, 4, 1};
        insertionSort(arr);
    }

    //insertion sort function
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        //print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}