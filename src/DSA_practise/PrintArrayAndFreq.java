import java.util.Arrays;
class Arr{
    public static void main(String[] args) {
        //main function
        int[] arr={1,2,3,2,5,3,6,2};
        ArrayAndFreq.freqSorted(arr);
        System.out.println(Arrays.toString(arr));
    }
}
class ArrayAndFreq {
    public static void freqSorted(int arr[]) {
       //sort the array
        Arrays.sort(arr);
        //initialize count and current variables
        int count=1;
        int cur=arr[0];
        //if element is equal to current, increment the count
        for(int i=1;i<arr.length;i++){
            if(arr[i]==cur){
                count++;
            //if frequency=1, print the value and its count
            }else{
                System.out.println(cur+" "+count);
                //re-initialize count to 1 and current to present value of i
                count=1;
                cur=arr[i];
            }
        }
        System.out.println(cur+" "+count);
    }
}
