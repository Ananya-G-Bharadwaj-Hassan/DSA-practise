package DSA_practise;

class URL {
    static String URLify(String s) {
        // code here
        StringBuilder url=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                url.append("%20");
            }else{
                url.append(s.charAt(i));
            }
        }
        return url.toString();
    }

    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(URLify(s));
    }
}