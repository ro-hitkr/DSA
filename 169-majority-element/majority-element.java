class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
     
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
       /*  Set<Integer> keySet = ; */
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return -1;
}
}