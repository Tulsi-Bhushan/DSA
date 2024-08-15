class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n]; 
        int count1=0; int count2=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
            ans[count2]=nums[i];
            count2+=2;
            }
            else{
            ans[count1]=nums[i];
            count1+=2;
            }
        }
        return ans;
    }
}
