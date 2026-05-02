package DSA_practise;

import java.util.Arrays;

public class BinarySearch{
    //main function
    public static void main(String[] args) {
        int[] arr={-18,3,56,9,-65,98,100,0,-2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target=3;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }

    //binary search function
    static int binarysearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}