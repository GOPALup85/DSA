class Solution {
    public int removeElement(int[] nums, int val) {
        int final_elements =0;
        for(int i=0;i<nums.length;i++){
            if (val != nums[i]){
                nums[final_elements] = nums[i];
                final_elements +=1;
            }
        }
        return final_elements;
    }
}