import java.util.*;

class Subsequence {
    public int longestConsecutive(int[] arr) {
        // code here
        int count=1;
        int maxcount=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1==arr[i+1]){
                count++;
            }
            else if(arr[i]==arr[i+1]){
                continue;
            }
            else{
                count=1;
            }
            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }

    public static void main(String[] args) {
        Subsequence obj=new Subsequence();
        int[] arrays={1,2,5,6,3,4,9};
        System.out.println(obj.longestConsecutive(arrays));
    }
}