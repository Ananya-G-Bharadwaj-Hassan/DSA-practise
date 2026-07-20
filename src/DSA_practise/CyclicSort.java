import java.util.Arrays;

class cyclicsort{
    public static void main(String[] args) {
        //main function
        int[] arr={1,4,2,3,5};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicsort(int[] arr){
            //cyclic sort function
            int i=0;
            while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
    }
}