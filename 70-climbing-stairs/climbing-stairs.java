class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int pf[]=new int[n+1];
        pf[1]=1;
        pf[2]=2;
        for(int i=3;i<=n;i++){
            pf[i]=pf[i-1]+pf[i-2];
        }
        return pf[n];
    }
}