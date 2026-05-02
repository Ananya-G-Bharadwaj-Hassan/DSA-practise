package DSA_practise;

<<<<<<< HEAD
class vowel {
=======
import java.util.Scanner;
class Vowel {
>>>>>>> feef59691f14ffd3e40520b2b02d1ad0c430aa90
    public static void main(String[] args) {
        String s="Hello";
        RemoveVowels(s);
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
