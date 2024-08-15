class Solution {
    //reversing array from index to n
    public static void rev(int[] arr, int start, int end) {
        while (start < end) {
            // Swap the elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move towards the middle
            start++;
            end--;
        }}    
        public void nextPermutation(int[] nums) {
        int n= nums.length;
        int index=-1;
        for(int i =n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;break;
            }
        }
        if (index != -1) {
        for(int i = n-1;i>=index;i--){
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }}
        rev(nums,index+1,n-1);

    }
}
//using longest prefix method
//TC is O(3n) and SC is O(1)
