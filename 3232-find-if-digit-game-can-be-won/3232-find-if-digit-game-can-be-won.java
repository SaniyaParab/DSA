class Solution {
    public boolean canAliceWin(int[] nums)
    {
       int single=0;
       int doubleDigit=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]<10)
        {
            single=single+nums[i];
        }
        else
        {
             doubleDigit=doubleDigit+nums[i];
        }
       } 
       if(single>doubleDigit)
       {
        return true;
       }
       if(doubleDigit>single)
       {
         return true;
       }  
       return false;
    }
}