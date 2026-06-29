class Solution {
    public int numWaterBottles(int n, int a) {
       return Solve(n,0,a);
    }
    public int Solve(int full,int empty,int a){
        if(full==0){
            return 0;
        }
        int drink=full;
        empty+=full;
        int newbottles=empty/a;
        int rembottles=empty%a;
        return drink+Solve(newbottles,rembottles,a);
        
    }
}