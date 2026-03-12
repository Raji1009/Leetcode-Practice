class Solution {
    public int search(int[] nums, int target) {
        int ans=div(nums,target,0,nums.length-1);
        return ans;
    }
    public static int div(int nums[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;

        if(nums[mid]==target){
            return mid;
        }

        if(nums[mid]>=nums[si]){
            if(nums[si]<=target && target<=nums[mid]){
                return div(nums,target,si,mid-1);
            }else{
                return div(nums,target,mid+1,ei);
            }
        }
        else{
            if(nums[mid]<=target && target<=nums[ei]){
                return div(nums,target,mid+1,ei);
            }
            else{
                return div(nums,target,si,mid-1);
            }
        }
    }
}