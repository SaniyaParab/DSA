class Solution
{
    public double findMedianSortedArrays(int[] num1, int[] num2) 
    {
        int[] merged =new int[num1.length + num2.length];

       for(int i=0;i<num1.length;i++)
       {
          merged[i]=num1[i];
       }
        for(int i=0;i<num2.length;i++)
       {
          merged[num1.length+i]=num2[i];
       }

       Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));

        if (merged.length % 2 == 0) {
            return (merged[merged.length / 2 - 1]
                  + merged[merged.length / 2]) / 2.0;
        } else {
            return merged[merged.length / 2];
        }
    }

    public static void main(String args[])
    {
        int[] num1 = {1, 3};
        int[] num2 = {2};

       Solution obj = new Solution();
        System.out.println(obj.findMedianSortedArrays(num1, num2));
    }
            
    }
