class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            int h = (height[left] < height[right]) ? height[left] : height[right];
            int width = right - left;
            int currwater = h * width;

            if(currwater > maxwater){
                maxwater = currwater;
            }

            if(height[left] < height[right]){
                left++;
            }else
            {
                right--;
            }
        }
        return maxwater;
    }
}