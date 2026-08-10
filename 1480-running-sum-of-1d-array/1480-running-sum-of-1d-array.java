class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;          // size of input array
        int[] ans = new int[n];       // result array of same size
        
        ans[0] = nums[0];             // first element is same
        
        for (int i = 1; i < n; i++) { // loop from 1 to n-1
            ans[i] = ans[i - 1] + nums[i]; 
            // add current number to previous running sum
        }
        
        return ans;                   // return result
    }
}
