package DSA_practise;

import java.util.Arrays;

class RotateMatrix{
    public void rotateMatrix(int[][] mat) {
        // code here
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int j=0;j<n;j++){
            int start=0;
            int end=n-1;
            while(start<end){
                int temp=mat[start][j];
                mat[start][j]=mat[end][j];
                mat[end][j]=temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        RotateMatrix obj=new RotateMatrix();
        obj.rotateMatrix(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}