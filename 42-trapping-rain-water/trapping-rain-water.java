class Solution {
    public int trap(int[] height) {
        int x= height.length;
        int leftmax[]= new int[x];
        leftmax[0]=height[0];
        for(int i=1;i<x;i++){
            leftmax[i]= Math.max(height[i],leftmax[i-1]);
        }
        int rightmax[] = new int[x];
        rightmax[x-1]= height[x-1];
        for(int i=x-2;i>=0;i--){
            rightmax[i]= Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater = 0;
        for(int i=0;i<x;i++){
            int waterlevel = Math.min(leftmax[i],rightmax[i]);
            trappedwater += (waterlevel-height[i]);
        }
        return trappedwater;
    }
}