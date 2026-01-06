class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        // res stores the global maximum product
        int res = nums[0];
        // currMax and currMin store the max/min product ending at the current index
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];

            // If the current number is negative, swap currMax and currMin
            if (n < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            // At each step, the new currMax is either the current number itself
            // or the product of the current number and the previous currMax
            currMax = Math.max(n, currMax * n);
            currMin = Math.min(n, currMin * n);

            // Update the global result
            res = Math.max(res, currMax);
        }

        return res;
    }
}