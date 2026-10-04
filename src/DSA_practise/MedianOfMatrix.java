import java.util.ArrayList;
import java.util.Collections;

class Median {
    public int median(int[][] mat) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                list.add(mat[i][j]);
            }
        }
        Collections.sort(list);
        int left=0;
        int right=list.size()-1;
        int mid=list.get((left+right)/2);
        return mid;
    }

    public static void main(String[] args) {
        int[][] mat={{1,3,5},{2,6,9},{3,6,9}};
        Median obj=new Median();
        System.out.println(obj.median(mat));
    }
}