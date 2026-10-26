class powerOf2 {
    public boolean isPowerofTwo(int n) {
        // code here
        if(n==0)
            return false;
        while(n>1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }

    public static void main(String[] args) {
        powerOf2 obj=new powerOf2();
        System.out.println(obj.isPowerofTwo(8));
    }
}