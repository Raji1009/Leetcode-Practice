class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1=Remove(s);
        String t1=Remove(t);
        return s1.equals(t1);
    }
    public String Remove(String p){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)=='#'){
                if(st.isEmpty()){
                    continue;
                }
                st.pop();
            }
            else{
                st.push(p.charAt(i));
            }
        }
        StringBuilder s=new StringBuilder();
        while(!st.isEmpty()){
            s.append(st.pop());
        }
        return s.toString();
    }
}