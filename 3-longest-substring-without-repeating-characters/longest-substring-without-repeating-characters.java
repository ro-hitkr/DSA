class Solution {
    public int lengthOfLongestSubstring(String s) {
       int ans = 0,n = s.length(), fp = 0, sp = 0;
       HashMap<Character, Integer> hm = new HashMap<>();
       while(sp<n){
        addToMap(hm, s.charAt(sp));
        while(fp<sp && !isValid(hm)){
            deleteFromMap(hm, s.charAt(fp));
            fp++;
        }
        int length = sp - fp +1;
        ans = Math.max(ans,length);
        sp++;
       }
       return ans;
    }
    public void addToMap(Map<Character,Integer> hm, char ch){
        hm.put(ch,hm.getOrDefault(ch, 0) + 1);
    }
    public void deleteFromMap(Map<Character, Integer> hm,char c){
        hm.put(c, hm.get(c)-1);
    }
    public boolean isValid(Map<Character, Integer> hm){
        for(char c: hm.keySet()){
            if(hm.get(c)>1){
                return false;
            }
        }
        return true;
    }
}