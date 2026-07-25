import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) 
    {
          Arrays.sort(nums);
        int missing=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==missing)
            {
                missing++;
            }
        }
        return missing;
    }
}