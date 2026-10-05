class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st=new ArrayDeque<>();
        for(char c: s.toCharArray()){
            if(!st.isEmpty() && st.peek()==c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        String res="";
        while(!st.isEmpty()){
            res=st.pop()+res;
        }
        return res;
        
    }
}