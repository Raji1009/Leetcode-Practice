class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder sb=new StringBuilder();
        while(a>0 || b>0){
            int len=sb.length();

            if(len>=2 && sb.charAt(len-1)==sb.charAt(len-2)){
                if(sb.charAt(len-1)=='a'){
                    sb.append('b');
                    b--;
                }
                else{
                    sb.append('a');
                    a--;
                }
            }
            else{
                if(a>=b){
                    if(a>0){
                        sb.append('a');
                        a--;
                    }else{
                        sb.append('b');
                        b--;
                    }
                }else{
                    if(b>0){
                        sb.append('b');
                        b--;
                    }
                    else{
                        sb.append('a');
                        a--;
                    }
                }
            }
        }
        return sb.toString();
    }
}