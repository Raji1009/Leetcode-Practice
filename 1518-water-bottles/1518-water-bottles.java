class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return rec(numBottles,numExchange,numBottles);
    }

    public int rec(int full,int exchange,int sum){
        if(full<exchange){
            return sum;
        }
        int newbottle=full/exchange;
        int rembottle=full%exchange;
        return rec(newbottle+rembottle,exchange,sum+newbottle);
    }
}