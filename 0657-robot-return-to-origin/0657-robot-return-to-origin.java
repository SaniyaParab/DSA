class Solution {
    public boolean judgeCircle(String moves)
    {
        char[] move=moves.toCharArray();
        int x = 0;
        int y = 0;
        for (int i = 0; i < move.length; i++)
        {
            char ch=move[i];
            if(ch=='U')
            {
                y++;
            }
            else if(ch=='D')
            {
                y--;
            }
            else if(ch=='L')
            {
                x++;
            }
            else if(ch=='R') 
            {
                x--;
            }
        }
        if(x==0 && y==0)
        {
            return true ;
        }
        return false;
            
    }
}