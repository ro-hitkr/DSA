class Solution {
    public int searchInsert(int[] nums, int target) {
        int st = 0;
        int end = nums.length-1;

        while(st<=end){
       int middle = st+(end-st)/2;

       if(nums[middle]==target){
        return middle;
       } else if (nums[middle]>target){
        end = middle-1;
       } else {
        st = middle+1;
       }
        }
        return st;
    }
}