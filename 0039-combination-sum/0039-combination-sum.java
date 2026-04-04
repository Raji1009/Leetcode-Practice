class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList();
        Arrays.sort(candidates);
        reccur(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }
    public void reccur(int[] candidates,int target,int idx,List<List<Integer>> ans,List<Integer> curr){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(candidates[i]>target){
                break;
            }
            curr.add(candidates[i]);
            reccur(candidates,target-candidates[i],i,ans,curr);
            curr.remove(curr.size()-1);
        }
    }
}