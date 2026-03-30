import java.util.Arrays;

class swap{
    public static void main(String[] args) {
        int[] arr={2,3,4,6,5};
        swaparray(arr,3,4);
        System.out.println(Arrays.toString(arr));
    }

    static void swaparray(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
