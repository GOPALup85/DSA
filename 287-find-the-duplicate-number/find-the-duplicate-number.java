class Solution {
    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length];
        for (int num : nums) {
            count[num]++;
            if (count[num] > 1) {
                return num;
            }
        }
        return -1;
    }
}