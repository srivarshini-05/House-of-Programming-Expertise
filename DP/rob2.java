class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        // If only one house
        if (n == 1) return nums[0];

        // Case 1: include house 0, exclude last house
        int case1 = robRange(nums, 0, n - 2);

        // Case 2: exclude house 0, include last house
        int case2 = robRange(nums, 1, n - 1);

        // Final answer is max of the two cases
        return Math.max(case1, case2);
    }

    private int robRange(int[] nums, int start, int end) {

        // If only one element in range
        if (start == end) return nums[start];

        int n = end - start + 1;
        int[] dp = new int[n];

        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[start + i] + dp[i - 2]);
        }

        return dp[n - 1];
    }
}
