class Solution {
    public int countDigits(int num) {
        int temp = num;
        int count = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && temp % digit == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}