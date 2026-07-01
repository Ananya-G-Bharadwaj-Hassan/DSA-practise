package DSA_practise;

class firstindex{
    public static void main(String[] args) {
       int[] arr={1,2,3,2,5,3,6,2};
       int x=3;
       System.out.println(firstindex(arr,x,0));
    }
    public static int firstindex(int[] arr, int x, int i){
        if(x==arr.length){
            return -1;
        }
        if(arr[i]==x){
            return i;
        }else{
            int idx=firstindex(arr,x,i+1);
            return idx;
        }
    }
}