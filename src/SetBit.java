class SetBit {
    public int findPosition(int n) {
        // code here
        double ans=Math.log(n)/Math.log(2);
        if(ans%1.0==0){
            return ((int)ans)+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        SetBit obj=new SetBit();
        System.out.println(obj.findPosition(8));
    }
}