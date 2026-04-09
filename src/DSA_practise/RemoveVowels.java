<<<<<<< HEAD
package DSA_practise;

class vowel {
=======
import java.util.Scanner;
class Vowel {
>>>>>>> 2827475761fb5b2b0c297a8a61375c1d0fb892a5
    public static void main(String[] args) {
        String s="Hello";
        removevowel(s);
    }

    static void RemoveVowels(String s){
        for (int i = 0; i < s.length(); i++) {
            char Ch = s.charAt(i);
            if (Ch == 'a' || Ch == 'e' || Ch == 'i' || Ch == 'o' || Ch == 'u') {
                continue;
            }
            System.out.print(Ch);
        }
    }
}
