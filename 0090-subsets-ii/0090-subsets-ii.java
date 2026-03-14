class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lis=new ArrayList<>();
        FindSubsets(nums,0,new ArrayList<Integer>(),lis);
        return lis;
    }
    public void FindSubsets(int[] nums,int i,List<Integer> curr,List<List<Integer>> lis){
        if(i==nums.length){
            if(!lis.contains(curr)){
                lis.add(new ArrayList<>(curr));
            }
            return;
        }
        curr.add(nums[i]);
        FindSubsets(nums,i+1,curr,lis);
        curr.remove(curr.size()-1);
        FindSubsets(nums,i+1,curr,lis);
    }
}