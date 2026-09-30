class SingleAmongDoubles {
    int single(int[] arr) {
        // code here
        int count=0;
        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,3,3};
        SingleAmongDoubles obj=new SingleAmongDoubles();
        System.out.println(obj.single(arr));
    }
}