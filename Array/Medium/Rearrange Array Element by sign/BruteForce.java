class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos= new int[n/2]; int count1=0;
        int[] neg= new int[n/2]; int count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
            pos[count1]=nums[i];
            count1++;
            }
            if(nums[i]<0){
            neg[count2]=nums[i];
            count2++;
            }
        }
        for(int i=0;i<n/2;i++){
            nums[2*i]=pos[i];
            nums[2*i+1]=neg[i];
        }
        return nums;
    }
}
//time complexity is O(n)+O(n)
//space complexity is O(n)
