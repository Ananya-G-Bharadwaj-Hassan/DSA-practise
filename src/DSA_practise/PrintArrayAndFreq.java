import java.util.Arrays;
class Arr{
    public static void main(String[] args) {
        int[] arr={1,2,3,2,5,3,6,2};
        ArrayAndFreq.freqSorted(arr);
        System.out.println(Arrays.toString(arr));
    }
}
class ArrayAndFreq {
    public static void freqSorted(int arr[]) {
        // Your Code Here
        Arrays.sort(arr);
        int count=1;
        int cur=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==cur){
                count++;
            }else{
                System.out.println(cur+" "+count);
                count=1;
                cur=arr[i];
            }
        }
        System.out.println(cur+" "+count);
    }
}