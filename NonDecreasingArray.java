public class NonDecreasingArray {

    public static int maxNonDecreasingArraySize(int[] nums) {
        int count = 1; // At least one element will remain
        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= current) {
                count++;
                current = nums[i];
            } else {
                current = Math.max(current, nums[i]); 
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 2, 5, 3, 5};
        System.out.println(maxNonDecreasingArraySize(nums1));  

        int[] nums2 = {1, 2, 3};
        System.out.println(maxNonDecreasingArraySize(nums2));

        int[] nums3 = {5, 4, 3, 2, 1};
        System.out.println(maxNonDecreasingArraySize(nums3));
    }
}