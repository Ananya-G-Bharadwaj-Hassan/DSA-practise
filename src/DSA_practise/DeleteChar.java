class DeleteChar {
    // Function to remove all occurrences of the character from the string
    public void removeCharacter(StringBuilder s, char c) {
        // code here
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == c) {
                s.deleteCharAt(i);
                i--;
            }
        }
    }

    public static void main(String[] args) {
        DeleteChar obj = new DeleteChar();
        StringBuilder sb = new StringBuilder("Hello World");
        char c = 'l';
        obj.removeCharacter(sb, c);
        System.out.println(sb.toString());
    }
}