class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for( int i=0;i<=num;i++){
            int temp =i;
            int n=0;
            while(temp>0){
                n = n*10 + temp%10;
                temp = temp/10;
            }
            if(i+n == num){
                return true;
            }
        }
        return false;
    }
}