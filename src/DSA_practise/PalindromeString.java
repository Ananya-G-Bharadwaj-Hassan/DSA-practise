package DSA_practise;
class PalindromeString{
    //driver code
    public static void main(String[] args) {
        checkPalindrome("hello");
        checkPalindrome("level");
    }

    //check if a string is a palindrome
    public static void checkPalindrome(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String s1=sb.toString();
        if(s.equals(s1)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}