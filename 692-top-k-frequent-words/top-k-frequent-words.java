class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(String w:words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        List<String>l=new ArrayList<>(map.keySet());
         Collections.sort(l, new Comparator<String>() {
            public int compare(String a, String b) {

                if (!map.get(a).equals(map.get(b))) {
                    return map.get(b) - map.get(a);
                }

                return a.compareTo(b);
            }
        });

        return l.subList(0, k);
    }
}