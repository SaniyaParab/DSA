class Solution {
    public boolean detectCapitalUse(String word) 
    {
        char[] arr=word.toCharArray();
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            if(ch>='a' && ch<='z')
            {
                count++;
            }

        }
        if(count==arr.length)
        {
            return true;
        }
        if(count==0)
        {
            return true;
        }
        if(arr[0]>='A' && arr[0]<='Z' && count==arr.length-1)
        {
            return true;
        }
        return false;
    }
}