class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1+len2;
        double median=0;
        int merged_array[]= new int[len];
        for(int i=0;i<len1;i++){
            merged_array[i]= nums1[i];

        } 
        for(int i=0;i<len2;i++){
            merged_array[len1+i]= nums2[i];
        }
        Arrays.sort(merged_array);
        if(len%2==0){
            median = (merged_array[len/2-1]+merged_array[len/2])/2.0;
        }else{
            median= merged_array[len/2];
        }
        return median;
    }
}