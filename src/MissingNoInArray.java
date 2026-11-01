import java.util.HashSet;

class MissingNoInArray {
    int missingNum(int arr[]) {
        // code here
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int miss=0;
        for(int i=1;i<=arr.length+1;i++){
            if(!set.contains(i)){
                miss=i;
                break;
            }
        }
        return miss;
    }

    public static void main(String[] args) {
        MissingNoInArray obj=new MissingNoInArray();
        System.out.println(obj.missingNum(new int[]{1,2,3,4,5,6,7,8,10}));
    }
}