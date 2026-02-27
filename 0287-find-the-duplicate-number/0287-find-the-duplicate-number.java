class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<nums.length;i++){
            ans[nums[i]]++;
        }
        for(int i=0;i<nums.length;i++){
            if(ans[i]>1){
                return i;
            }
        }
        return 0;
    }
}