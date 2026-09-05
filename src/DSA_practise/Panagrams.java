package DSA_practise;

import java.util.HashSet;
import java.util.Set;

class Panagram {
    public static boolean checkPanagram(String s) {
        // code here
        Set<Character> letters = new HashSet<>();
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
            if (letters.size() == 26) {
                return true;
            }
        }
        return letters.size() == 26;
    }
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
        System.out.println(checkPanagram(s));
        String s1="Hello";
        System.out.println(checkPanagram(s1));
    }
}