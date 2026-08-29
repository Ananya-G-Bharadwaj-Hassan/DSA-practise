package DSA_practise;

import java.util.HashMap;

class CommonElement{
    public static void getCommon(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> hm=new HashMap<>();

        for(int i=0;i<arr1.length;i++){
            hm.put(arr1[i],i);
        }
        for(int i=0;i<arr2.length;i++) {
            if (hm.containsKey(arr2[i])) {
                System.out.println(arr2[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={1,7,8,9,3,2};
        getCommon(arr1, arr2);
    }
}