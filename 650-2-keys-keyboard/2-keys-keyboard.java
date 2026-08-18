class Solution {
    public int minSteps(int n) {
        int step =0;
        for(int i=2; i<=n;i++){
            while( n%i==0){
                step +=i;
                n=n/i;
            }
        }
        return step ;
    }
}