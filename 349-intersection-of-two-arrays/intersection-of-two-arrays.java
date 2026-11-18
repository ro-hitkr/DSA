class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        int count = 0;

        HashSet<Integer> result = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])){
               result.add(nums2[i]);
            }
        }
      int ans[] = new int[result.size()];
      int index = 0;
      for(int num: result){
        ans[index++] = num;
      }
      return ans;
    }
}