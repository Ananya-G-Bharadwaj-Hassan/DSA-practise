package DSA_practise;
import java.util.HashSet;

class Hashset{
    public static void main(String[] args) {
        HashSet <Integer> hs=new HashSet<>();

        //add
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        //check whether an element is present in hashset
        System.out.println(hs.contains(1));

        //remove
        hs.remove(3);
        System.out.println(hs);

        //size
        System.out.println(hs.size());

        //unique elements only
        hs.add(4);
        System.out.println(hs);
        System.out.println(hs.size());
    }
}