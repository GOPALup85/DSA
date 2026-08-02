class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int give = 1;
        int i = 0;
        while (candies > 0) {
            int current = Math.min(give, candies);
            ans[i % num_people] += current;
            candies -= current;
            give++;
            i++;
        }
        return ans;
    }
}