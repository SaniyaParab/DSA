class Solution {
    public int removeElement(int[] nums, int val)
     {
        int[] arr= new int[nums.length];
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                arr[x]=nums[i];
                x++;
            }
        }
         for (int i = 0; i < x; i++) {
            nums[i] = arr[i];
        }
        return x;   
    }
}