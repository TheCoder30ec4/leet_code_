class Solution {
    public int minAddToMakeValid(String s) {
        int count =0;
        int top =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') top++;
            else if(s.charAt(i)==')' && top==0) count++;
            else top--;
        }

        return top+count;

       
        
    }
}