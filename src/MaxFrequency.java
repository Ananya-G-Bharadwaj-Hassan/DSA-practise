import java.util.HashMap;
class MaxFreq{
    public static void main(String[] args) {
          String s="abcabaacac";
          maxFreq(s);
    }
    public static void maxFreq(String s){
        HashMap<Character, Integer> max= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(max.containsKey(ch)==true){
                int cfreq=max.get(ch);
                max.put(ch,cfreq+1);
            }
            else{
                max.put(ch,1);
            }
        }
        int maxval=0;
        char maxchar='a';
        for(char ch:max.keySet()){
           if(max.get(ch)>maxval){
               maxval=max.get(ch);
               maxchar=ch;
           }
        }
        System.out.println(maxchar);
    }
}