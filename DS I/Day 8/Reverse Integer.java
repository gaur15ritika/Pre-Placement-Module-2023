class Solution {
    public int reverse(int x) {
        int check=0;
        long reverse=0;
        if(x<0)
        {
            check=1;
            x=-x;
        }
        
        while(x>0)
        {
            int val=x%10;
            reverse=reverse*10+val;
            x/=10;
            
        }
        if(reverse>Integer.MAX_VALUE)
        {
            return 0;
        }
        
        if(check==1)
            reverse=-reverse;
        return (int)(reverse);
        
       
        }
   
    }
