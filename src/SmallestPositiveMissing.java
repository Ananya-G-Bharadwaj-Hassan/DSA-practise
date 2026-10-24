package DSA_practise;
import java.util.*;

class MissingNumber {
    public int missingNumber(int[] arr) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        for(int n:arr){
            if(n>0){
                set.add(n);
            }
        }
        int i=1;
        while(set.contains(i)){
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        MissingNumber obj=new MissingNumber();
        int[] arr={1,3,5,7,9,2,4,6,8,10};
        System.out.println(obj.missingNumber(arr));
    }
}
