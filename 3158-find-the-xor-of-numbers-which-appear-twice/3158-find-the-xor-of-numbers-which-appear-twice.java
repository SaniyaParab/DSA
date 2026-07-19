class Solution {
    public int duplicateNumbersXOR(int[] nums) 
    {
         int[] count = new int[51];
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        int ans=0;
          for(int j=0;j<count.length;j++)
            {
                if(count[j]==2)
                {
                    ans^=j;
                }
            }
        return ans; 
           
        
    }
}