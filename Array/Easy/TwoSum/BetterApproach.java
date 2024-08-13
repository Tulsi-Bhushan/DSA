//better approach using Hashmap with time complexity as O(NlogN)
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] fin = new int[2];
        int size = nums.length;
        
        for (int i = 0; i < size; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                fin[0] = map.get(diff);
                fin[1] = i;
                return fin;
            }
            // Add the current element and its index to the map
            map.put(nums[i], i);
        }
        // If no solution is found, return an array with invalid indices
        return new int[]{-1, -1};
    }
}
