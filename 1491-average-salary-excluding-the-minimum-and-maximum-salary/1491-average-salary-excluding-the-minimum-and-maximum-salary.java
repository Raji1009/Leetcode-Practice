class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        for (int i=0;i<salary.length;i++){
            if (i==0 || i==salary.length-1){
                continue;
            }
            else{
                sum+=salary[i];
            }
        }
        return sum/(salary.length-2);
    }
}