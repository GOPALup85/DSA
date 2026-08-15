class Solution {
    public int getLeastFrequentDigit(int n) {
        int [] array = new int[10];
        while(n>0){
            int digit = n%10;
            array[digit]++;
            n = n/10;
        }
        int least =0;
        int min_array_no =Integer.MAX_VALUE;
        for(int i=0;i<10;i++){
            if(array[i]>0 && array[i]<min_array_no){
                min_array_no = array[i];
                least = i;
            }
        }
        return least;
    }
}