import java.util.Arrays;

class SquaresOfArray {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int[nums.length];
        int i=0;
        int j=nums.length-1;

        for(int k=nums.length-1;k>=0;k--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                ans[k]=nums[i]*nums[i];
                i++;
            }else{
                ans[k]=nums[j]*nums[j];
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans={-4,-1,0,3,10};
        SquaresOfArray obj=new SquaresOfArray();
        System.out.println(Arrays.toString(obj.sortedSquares(ans)));
    }
}