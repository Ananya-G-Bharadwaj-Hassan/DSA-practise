package DSA_practise;

class ExcelSheet {
    public int titleToNumber(String columnTitle) {
        long ans = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            ans = ans * 26 + (ch - 'A' + 1);
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        ExcelSheet obj=new ExcelSheet();
        System.out.println(obj.titleToNumber("AB"));
    }
}