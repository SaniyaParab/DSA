
class Solution {

    public int findMin(int[] nums)
    {int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        return min;
    }

     public int findMax(int[] nums)
    {int max=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        return max;
    }

    public long maxTotalValue(int[] nums, int k) {
        int min=findMin(nums); 
        int max=findMax(nums);
        long value=max-min;
        long sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+value;
        }
        return sum;
    }
    public static void main(String args[])
    {
        int[] nums = {11,8};
        int k=2;

     Solution obj = new Solution();

        System.out.println(obj.maxTotalValue(nums, k));
    }
}