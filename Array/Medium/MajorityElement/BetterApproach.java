class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int num:nums){
            count.put(num, (count.getOrDefault(num,0)+1));
            if(count.get(num)>n/2){
                return num;
            }
        }
        return -1;
    }
}
//better approach with time complexity as O(n) due to presence of hashmap
