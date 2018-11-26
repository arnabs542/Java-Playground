package leet.Q51toQ100;

public class Q80_RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int slow = 2;
        for (int fast = 2; fast < nums.length; fast++) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
