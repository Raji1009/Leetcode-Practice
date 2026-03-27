class Solution {
    public int largestRectangleArea(int[] height){
        int maxarea=0;
        int[] nsr=new int[height.length];
        int[] nsl=new int[height.length];

        //next smaller right
        Stack<Integer> s=new Stack<>();
        for(int i=height.length-1;i>=0;i--){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=height.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        //next smaller left
        s=new Stack<>();
        for(int i=0;i<height.length;i++){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        //current area
        for(int i=0;i<height.length;i++){
            int length=height[i];
            int width=nsr[i]-nsl[i]-1;
            int area=length*width;
            if(area>maxarea){
                maxarea=area;
            }
        }
        return maxarea;
    }
}