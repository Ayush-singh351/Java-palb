class Solution {
    int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            maxSoFar = Math.max(maxSoFar, curr);
        }
        return maxSoFar;
    }
}