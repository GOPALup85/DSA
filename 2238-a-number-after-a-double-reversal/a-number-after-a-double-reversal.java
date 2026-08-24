class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp = num;
        int reverse = 0;
        while(temp>0){
            int s = temp%10;
            reverse = reverse*10+ s;
            temp = temp/10;
        }

        int temp2 = reverse;
        int reverse2 =0;
        while(temp2>0){
            int r = temp2%10;
            reverse2 = reverse2*10+ r;
            temp2 = temp2/10;
        }
        return reverse2==num;   
    }
}