class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int idx=StartIndex(nums2,nums1[i]);
            ans[i]=-1;
            for(int j=idx+1;j<nums2.length;j++){
                if(nums2[j]>nums2[idx]){
                    ans[i]=nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
    public int StartIndex(int[] nums,int val){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                return i;
            }
        }
        return -1;
    }
}