class Solution {
    public int diagonalPrime(int[][] nums) {
        int maxPrime = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int primary = nums[i][i];
            int secondary = nums[i][n - i - 1];

            if (isPrime(primary) && primary > maxPrime) {
                maxPrime = primary;
            }
            if (isPrime(secondary) && secondary > maxPrime) {
                maxPrime = secondary;
            }
        }

        return maxPrime;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (long d = 2; d * d <= n; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }
}