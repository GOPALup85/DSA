class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            int factors = 0;
            for (int j = 1; j <= count; j++) {
                if (count % j == 0) {
                    factors++;
                }
            }
            if (factors == 2) {
                return true;
            }
        }
        return false;
    }
}