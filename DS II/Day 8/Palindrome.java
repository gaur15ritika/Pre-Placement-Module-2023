class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0){   
        int n=x;
        int rem;
        int ad=0;
        while(n!=0){
            rem=n%10;
            ad=ad*10+rem;
            n=n/10;
        }
        if(ad==x){
            return true;
        }
        else{
            return false;
        }
        }
            else{
                return false;
            }
    }
   
    }
