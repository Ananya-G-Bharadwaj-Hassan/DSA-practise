import java.util.Arrays;

class twodimensionalarray{
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr, 40)));
    }
    static int[] search(int[][] matrix,int key){
        int row=0;
        int column=matrix.length-1;

        while(row<matrix.length && column>=0){
            if (matrix[row][column]==key){
                return new int[]{row,column};
            }
            if(matrix[row][column]<key){
                row++;
            }else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}