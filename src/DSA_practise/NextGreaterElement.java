package DSA_practise;
class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++) {
            boolean find = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    find = true;
                }
                if (find && nums1[i] < nums2[j]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
            if (ans[i] == 0) ans[i] = -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums1={1,2,4};
        int[] nums2={1,2,3,4};
        NextGreaterElement obj = new NextGreaterElement();
        int[] result = obj.nextGreaterElement(nums1, nums2);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}