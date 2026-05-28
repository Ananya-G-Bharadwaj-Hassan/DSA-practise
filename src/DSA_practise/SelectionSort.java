class Main {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 9, 4, 1};
        selectionsort(arr);
    }

    public static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minval = arr[i];
            int minidx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < minval) {
                    minval = arr[j];
                    minidx = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
        for(int val:arr){
            System.out.println(val);
        }
    }
}
