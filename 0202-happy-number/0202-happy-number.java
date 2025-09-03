class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while (n!=1 && !seen.contains(n)){
            seen.add(n);
            n=get_num(n);
        }

        return n==1;
    }

        private int get_num(int num){
            int total=0;
            while (num>0){
                int digit=num%10;
                total+=digit*digit;
                num=num/10;
            }
            return total;
        }

    }
