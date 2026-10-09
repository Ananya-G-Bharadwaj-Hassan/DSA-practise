package DSA_practise;
import java.util.Arrays;

class KthElement{
    public long kthElement(int[] a, int[] b, int k) {
        int n = a.length;
        int m = b.length;
        int[] merged = new int[n + m];
        for (int i = 0; i < n; i++) {
            merged[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            merged[n + i] = b[i];
        }
        Arrays.sort(merged);
        return merged[k - 1];
    }

    public static void main(String[] args) {
        int[] a={1,3,5};
        int[] b={2,4,6};
        KthElement obj=new KthElement();
        System.out.println(obj.kthElement(a,b,4));
    }
}