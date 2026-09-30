class Solution {
    public int longestValidParentheses(String s) {
        Deque<Integer>stack=new ArrayDeque<>();
        stack.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    int curr_len=i-stack.peek();
                    max=Math.max(curr_len,max);
                }
            }
        }
        return max;
    }
}