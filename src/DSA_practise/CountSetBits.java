package DSA_practise;

class SetBits {
    public static int SetBits(int n){
        // code here
        int count=0;
        while(n>0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        SetBits obj=new SetBits();
        System.out.println(obj.SetBits(10));
    }
}