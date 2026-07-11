class Solution {
 
    public int[] intersect(int[] nums1, int[] nums2)
    {
        int[] arr = new int[Math.min(nums1.length, nums2.length)];
        int x=0;
        for(int i = 0;i < nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    arr[x++]=nums1[i];
                    nums2[j] = -1;
                    break;
                }

            }
        }
        int[] ans=new int[x];
        for(int i=0;i<x;i++)
        {
            ans[i]=arr[i];
        }

        return ans;
    }

}