class Transpose{
    public static void main(String[] args) {
        //user input and calling the function
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        transposematrix(arr);

    }
    public static void transposematrix(int[][] arr){

        //swapping the elements
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        //printing transpose
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
