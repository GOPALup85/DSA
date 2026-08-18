class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int flips = 0;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flips += 2;
            }
            i++;
            j--;
        }
        return flips;
    }
}