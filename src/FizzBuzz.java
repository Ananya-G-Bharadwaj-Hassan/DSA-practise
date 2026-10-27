package DSA_practise;
import java.util.*;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();

        for(int i=1; i<=n; i++) {
            if(i%3 ==0 && i%5==0) {
                ans.add("FizzBuzz");
            }
            else if(i%3==0) {
                ans.add("Fizz");
            }
            else if(i%5==0) {
                ans.add("Buzz");
            }
            else {
                ans.add(Integer.toString(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FizzBuzz obj=new FizzBuzz();
        System.out.println(obj.fizzBuzz(15));
    }
}