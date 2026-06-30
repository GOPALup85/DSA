class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int maxArea = 0;
        
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            int currentHeight = heights[i];
            while (!stack.isEmpty() && stack.peek()[1] > currentHeight) {
                int[] popped = stack.pop();
                int index = popped[0];
                int height = popped[1];
                maxArea = Math.max(maxArea, height * (i - index));
                start = index;  
            }
            stack.push(new int[]{start, currentHeight});
        }
        while (!stack.isEmpty()) {
            int[] popped = stack.pop();
            int index = popped[0];
            int height = popped[1];
            maxArea = Math.max(maxArea, height * (heights.length - index));
        }
        return maxArea;
    }
}