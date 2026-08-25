class PrimeFactors{
    static int largestPrimeFactor(int n) {
        // code here
        int i=2;
        while(n>=i){
            if(n%i==0){
                n=n/i;
            }else{
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(largestPrimeFactor(n));
    }
}