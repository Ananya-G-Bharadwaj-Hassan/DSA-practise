import java.util.*;

class zeros {
    void pushZerosToEnd(int[] arr) {
        int j = 0;
        // code here
        int n = arr.length;
        for(int  i=0; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;

            }
        }
    }
    public static void main(String[] args) {
         int[] arr={2,0,3,4,0,4,8};
         zeros obj=new zeros();
         obj.pushZerosToEnd(arr);
         System.out.println(Arrays.toString(arr));
    }
}