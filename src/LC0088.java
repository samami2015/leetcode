import java.util.Arrays;

public class LC0088 {
/*    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i != n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }*/

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = nums1.length - 1;
        m--;
        n--;
        while (n >= 0) {
            while (m >= 0 && nums1[m] >= nums2[n]) {
                int tmp = nums1[i];
                nums1[i] = nums1[m];
                nums1[m] = tmp;
                i--;
                m--;
            }
            int tmp = nums1[i];
            nums1[i] = nums2[n];
            nums2[n] = tmp;
            i--;
            n--;
        }
    }

    public static void main(String[] args) {
        LC0088 solution = new LC0088();
        int[] nums1 = {2, 4, 6, 6, 0, 0, 0};
        int[] nums2 = {3, 5, 7};
        int m = 3, n = 3;
        solution.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
