class Solution {
    int c=0;
    public int findTargetSumWays(int[] nums, int target) {
        recursive(nums,0,0,target);
        return c;
    }
    public void recursive(int nums[],int in,int sum,int tar){
        if(in==nums.length){
            if(sum==tar){
                c++;
            }
            return;
        }
        recursive(nums,in+1,sum+nums[in],tar);
        recursive(nums,in+1,sum-nums[in],tar);
    }
}