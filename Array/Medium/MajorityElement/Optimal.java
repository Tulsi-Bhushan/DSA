class Solution {
    public int majorityElement(int[] nums) {
        int count=0; //count
        int el=0; //element
        for(int i=0;i<nums.length;i++){
            if(count==0){
                el=nums[i];
                count=1;
            }
            else if(nums[i]==el){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i =0;i<nums.length;i++){
            if(el==nums[i]) count1++;
        }
        if(count1>nums.length/2) return el;
        return -1;
    }
}
