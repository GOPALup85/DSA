class Solution {
    public int sumOfPrimesInRange(int n) {
        int origional =n;
        int r = 0;
        while(n>0){
            int digit = n%10;
            r = r*10+digit;
            n = n/10;
        }
        int start = Math.min(origional,r);
        int end = Math.max(origional,r);
        int prime_sum =0;
        for( int num = start; num<= end;num++){
            if(num<2)
                continue;
            boolean prime = true;
            for(int i = 2;i*i<=num;i++){
                if(num%i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                prime_sum+= num;
            }
        }
        return prime_sum;
    }
}