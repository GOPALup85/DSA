class Solution {
    public int maxProduct(int[] nums) {
        int maxmumProd = nums[0];
        int minmumProd = nums[0];
        int result = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < 0) {
                int temp = maxmumProd;
                maxmumProd = minmumProd;
                minmumProd = temp;
            }
            maxmumProd = Math.max(nums[i], maxmumProd * nums[i]);
            minmumProd = Math.min(nums[i], minmumProd * nums[i]);
            result = Math.max(result, maxmumProd);
        }
        return result;
    }
}