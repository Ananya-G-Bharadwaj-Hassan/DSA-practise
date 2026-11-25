import java.util.*;

class RemoveDuplicates {
    static ArrayList<Integer> removeDuplicate(int arr[]) {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        RemoveDuplicates obj=new RemoveDuplicates();
        int[] arr={1,3,2,2,4};
        ArrayList<Integer> result = obj.removeDuplicate(arr);
        System.out.println(result);
    }
}