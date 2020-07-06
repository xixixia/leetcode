package demo;

/**
 * 二分查找
 * 查找两排序数组中位数(查找两排序数组第k个数)
 * 如    nums1=[1,4,6,8];
 *       nums2=[2,3,5,9,10];
 * 则找出两数组的nums1[k+1/2]，nums2[k+1/2]进行比较
 * 即nums1[2],nums2[2];
 *
 */
public class Demo04 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 4};
        int[] nums2 = new int[]{2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        if (n % 2 == 1) {
            return findKthNum(nums1, nums2, 0, 0, (n + 1) / 2);
        } else {
            return (findKthNum(nums1, nums2, 0, 0, (n + 1) / 2) + findKthNum(nums1, nums2, 0, 0, (n + 2) / 2)) / 2.0;
        }
    }

    /**
     *
     * @param nums1
     * @param nums2
     * @param i //nums1中有效起始位置
     * @param j //nums2中有效起始位置
     * @param k //第k个数
     * @return
     */
    private static double findKthNum(int[] nums1, int[] nums2, int i, int j, int k) {
        if (i >= nums1.length) {
            return nums2[j + k - 1];
        }
        if (j >= nums2.length) {
            return nums1[i + k - 1];
        }
        if (k == 1) {
            return Math.min(nums1[i], nums2[j]);
        }
        int half = (k + 1) / 2;
        int midVal1 = (i + half - 1 < nums1.length) ? nums1[i + half - 1] : Integer.MAX_VALUE;
        int midVal2 = (j + half - 1 < nums2.length) ? nums2[j + half - 1] : Integer.MAX_VALUE;
        if (midVal1 == midVal2) {
            return midVal1;
        } else if (midVal1 > midVal2) {
            j = j + k / 2;
            return findKthNum(nums1, nums2, i, j, k - k / 2);
        } else {
            i = i + k / 2;
            return findKthNum(nums1, nums2, i, j, k - k / 2);
        }
    }

}
