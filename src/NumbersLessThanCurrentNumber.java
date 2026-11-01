package DSA_practise;
import java.util.*;

class NumbersLessThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count=new int[101];
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int j=1;j<101;j++){
            count[j]+=count[j-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                res[i]=0;
            }else{
                res[i]=count[nums[i]-1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        NumbersLessThanCurrentNumber obj=new NumbersLessThanCurrentNumber();
        System.out.println(Arrays.toString(obj.smallerNumbersThanCurrent(nums)));
    }
}
