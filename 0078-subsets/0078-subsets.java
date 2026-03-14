class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lis=new ArrayList<>();
        FindSubsets(nums,new ArrayList<>(),0,lis);
        return lis;
    }
    public void FindSubsets(int[] nums,List<Integer> curr,int i,List<List<Integer>> lis){
        if(i==nums.length){
            lis.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        FindSubsets(nums,curr,i+1,lis);
        curr.remove(curr.size()-1);
        FindSubsets(nums,curr,i+1,lis);
    }
}