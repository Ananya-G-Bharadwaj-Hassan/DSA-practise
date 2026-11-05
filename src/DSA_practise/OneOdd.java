class OneOdd{
// Method to find the element with odd occurrence in given array
int getOddOccurrence(int[] arr) {
    int res=0;
    for(int num:arr){
        res^=num;
    }
    return res;
}

    public static void main(String[] args) {
        OneOdd obj=new OneOdd();
        int[] arr={1,2,2,1,3};
        System.out.println(obj.getOddOccurrence(arr));
    }
}