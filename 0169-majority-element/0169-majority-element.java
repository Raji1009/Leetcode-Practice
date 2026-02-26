class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int charac=0;
        for(int num:nums){
            if(count==0){
                charac=num;
            }
            if (num==charac){
                count++;
            }
            else{
                count--;
            }
        }
        return charac;
    }
}