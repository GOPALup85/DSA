class Solution {
    public int removeElement(int[] nums, int val) {
        int element =0;
        // int []expectedNums= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if (val != nums[i]){
                nums[element] = nums[i];
                element +=1;
            }
            // System.out.println(expectedNums[element]);
        }
        return element;
    }
}