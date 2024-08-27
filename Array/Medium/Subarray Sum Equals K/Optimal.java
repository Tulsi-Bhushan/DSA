class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int preSum = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            int remove = preSum - k;
            count += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }

        return count;
    }
}
//Time complexity is O(NlogN)
//Space complexity is O(N) in worse case
