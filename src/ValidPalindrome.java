class Solution {
    public static boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        String newstring = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Reverse the cleaned string
        String reversed = new StringBuilder(newstring).reverse().toString();

        // Compare
        return newstring.equals(reversed);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
