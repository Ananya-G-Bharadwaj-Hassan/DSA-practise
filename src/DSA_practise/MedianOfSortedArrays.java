import java.util.Arrays;

class medianOfArray{
    public double median(int[] a, int[] b){
        int len=a.length;
        int[] merged=new int[len*2];

        for(int i=0;i<len;i++){
            merged[i]=a[i];
        }
        for(int i=0;i<len;i++){
            merged[i+len]=b[i];
        }

        Arrays.sort(merged);
        int mid=merged.length/2;
        return merged[mid];
    }

    public static void main(String[] args) {
        int[] a={1,3,5};
        int[] b={2,4,6};
        medianOfArray obj=new medianOfArray();
        System.out.println(obj.median(a,b));
    }
}