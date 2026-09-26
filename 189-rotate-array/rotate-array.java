class Solution {
    public static void rev(int arr[], int left, int right){
       
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
       }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return;

        // Essential: Keeps d within the bounds [0, n - 1]
        k = k % n;
        rev(nums, 0, n-1    );
        rev(nums, 0,k-1);
        rev(nums,k ,n-1);
    }
}