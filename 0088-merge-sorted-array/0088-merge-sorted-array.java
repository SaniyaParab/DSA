import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int[] arr=new int[m+n];
        int x=0;
        for(int i=0;i<m;i++)
        {
                arr[x]=nums1[i];
                x++;
        }
        for(int i=0;i<n;i++)
        {
                arr[x]=nums2[i];
                x++;
        }
        Arrays.sort(arr);

        for (int i = 0; i < m + n; i++)
         {
            nums1[i] = arr[i];
        }

    }
}