class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            int max = 0;
            int digits = 0;
            int temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit > max) {
                    max = digit;
                }
                digits++;
                temp /= 10;
            }
            int encrypted = 0;
            for (int i = 0; i < digits; i++) {
                encrypted = encrypted * 10 + max;
            }
            sum += encrypted;
        }
        return sum;
    }
}