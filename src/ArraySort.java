import java.util.Arrays;

class SortArray{
        public static void SortArray(int[] arr){
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }

    public static void main(String[] args) {
        int[] arr={2,7,5,1,3,4,6};
        SortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}