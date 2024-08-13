//with better approach using hashmap
class Solution{
      // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
      HashMap<Integer, Integer> map= new HashMap<>();
      int maxLen=0,sum=0;
      for(int i=0;i<N;i++)
        {
          sum+=A[i]; //storing the sum 
          if(sum==K)
          {
            maxLen=Math.max(maxLen,i+1);
          }
          if(map.containsKey(sum-K)){
            maxLen= Math.max(maxLen,i-map.get(sum-K));
          }
          if(!map.containsKey(sum))
          {
            map.put(sum,i);
          }
        }
      return maxLen;
    }
}
