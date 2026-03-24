class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        return rec(numBottles,numExchange,sum);
    }

    public int rec(int full,int exchange,int sum){
        if(full<exchange){
            return sum;
        }
        int newbottle=full/exchange;
        sum+=newbottle;
        int remaingbottle=full%exchange;
        return rec(newbottle+remaingbottle,exchange,sum);
    }
}