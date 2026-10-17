
class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1;
        int smax = -1;
        int maxIdx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                smax = max;
                max = nums[i];
                maxIdx = i;
            } else if (nums[i] > smax) {
                smax = nums[i];
            }
        }

        if (max >= 2 * smax) {
            return maxIdx;
        } else {
            return -1;
        }
    }
}
