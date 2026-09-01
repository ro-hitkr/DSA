class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[][] numWithIndex = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numWithIndex[i][0] = nums[i]; // The actual number
            numWithIndex[i][1] = i;       // The original index
        }
        
        // Step 2: Sort the 2D array based on the numbers (column 0)
        Arrays.sort(numWithIndex, Comparator.comparingInt(a -> a[0]));
        
        // Step 3: Initialize two pointers
        int left = 0;
        int right = nums.length - 1;
        
        // Step 4: Two-pointer search loop
        while (left < right) {
            int currentSum = numWithIndex[left][0] + numWithIndex[right][0];
            
            if (currentSum == target) {
                // Return the stored original indices from column 1
                return new int[]{numWithIndex[left][1], numWithIndex[right][1]};

        }
        else if(currentSum<target){
            left++;
        }
        else{
            right--;
        }
    }       
    return new int[]{};
    }
}