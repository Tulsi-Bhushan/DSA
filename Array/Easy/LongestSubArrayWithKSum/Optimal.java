class Solution {
    // Function for finding maximum length of subarray with sum equals to K
    public static int lenOfLongSubarr(int A[], int N, int K) {
        int left = 0, right = 0;
        int sum = A[0], len = 0;

        while (right < N) {
            // Shrink the window from the left if the sum is greater than K
            while (left <= right && sum > K) {
                sum -= A[left];
                left++;
            }

            // If the current sum is equal to K, update the length of the subarray
            if (sum == K) {
                len = Math.max(len, right - left + 1);
            }

            // Move the right pointer forward
            right++;
            if (right < N) {
                sum += A[right];
            }
        }

        return len;
    }
}
