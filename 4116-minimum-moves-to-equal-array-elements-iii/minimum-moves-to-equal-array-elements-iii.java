class Solution {
    public int minMoves(int[] nums) {
        int mx = Integer.MIN_VALUE;
        long totsum = 0;
        for (int x : nums){
        if (x > mx) {mx = x;
       
        }
        totsum += x;
        }

        long sum = (long)mx * nums.length;
        return (int) (sum - totsum);
    }
}