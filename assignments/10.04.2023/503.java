class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2*nums.length-1; i>=0 ;i--) {
       while (!stack.isEmpty() && stack.peek() <= nums[i%nums.length]) 
       stack.pop();
        if (i<nums.length) {
            if (!stack.isEmpty()) 
            result[i] = stack.peek();

            else 
            result[i] = -1;
        }
        stack.push(nums[i%nums.length]);
        }        
        return result;
    }
}