class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int left=0;
        int result=0;
        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                int leftfruit=fruits[left];
                map.put(leftfruit,map.get(leftfruit)-1);
                if(map.get(leftfruit)==0){
                    map.remove(leftfruit);
                }
                left++;
            }
            result=Math.max(result,right-left+1);
        }
        return result;
        
    }
}