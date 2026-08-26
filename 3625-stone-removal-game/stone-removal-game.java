class Solution {
    public boolean canAliceWin(int n) {
        int x =10;
        int turns =0;
        while(n>=x){
            n = n-x;
            x--;
            turns++;
        }
        return turns%2==1;
    }
}