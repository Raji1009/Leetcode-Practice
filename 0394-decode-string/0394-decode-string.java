class Solution {
    public String decodeString(String s) {
        Stack<Integer> numstack=new Stack<>();
        Stack<StringBuilder> strstack=new Stack<>();
        StringBuilder curr=new StringBuilder();

        int num=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num*10 + (ch-'0');
            }
            else if(ch=='['){
                numstack.push(num);
                strstack.push(curr);
                num=0;
                curr=new StringBuilder();
            }
            else if(ch==']'){
                int count=numstack.pop();
                StringBuilder prev=strstack.pop();
                for(int i=0;i<count;i++){
                    prev.append(curr);
                }
                curr=prev;
            }
            else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}