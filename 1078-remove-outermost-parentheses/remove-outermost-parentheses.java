class Solution {
    public String removeOuterParentheses(String s) {
        Deque<Character>st=new ArrayDeque<>();
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(!st.isEmpty()){
                    res.append(c);
                }
                st.push(c);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    res.append(c);
                }
            }
        }
        return res.toString();
    }
}