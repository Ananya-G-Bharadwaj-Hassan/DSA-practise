import java.util.Scanner;
class vowel {
    public static void main(String[] args) {
        String s="Hello";
        removevowel(s);
    }

    static void removevowel(String s){
        for (int i = 0; i < s.length(); i++) {
            char Ch = s.charAt(i);
            if (Ch == 'a' || Ch == 'e' || Ch == 'i' || Ch == 'o' || Ch == 'u') {
                continue;
            }
            System.out.print(Ch);
        }
    }
}