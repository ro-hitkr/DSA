class Solution {
    public int diagonalPrime(int[][] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
        int primary = nums[i][i];
        int secondary = nums[i][nums.length-i-1];
            if(isPrime(primary) && primary > sum){
               sum = primary;
            }
            if(isPrime(secondary) && secondary > sum){
                sum=secondary;
            }

        }
        return sum;
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        boolean isPrime = true;
     for (long d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }
}