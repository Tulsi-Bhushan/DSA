//longest Subarray with K sum brute force
class Solution{
      // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
      int maxLen=0; //initialising value of maxlen
      for(int i=0;i<N;i++)
        {
          int sum=0;
          for(int j=i;j<N;j++)
            {
              sum+=A[j]; //updating sum
              if(sum==K) //comparing sum
              {
                maxLen=Math.max(maxLen,j-i+1);
              }
            }
        }
      return maxLen;
    }
}
