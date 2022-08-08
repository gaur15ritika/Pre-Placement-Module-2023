public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int mid;
        int ans=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(isBadVersion(mid)==false){
                start=mid+1;
            }
            else if(isBadVersion(mid)==true){
                end=mid-1;
                if(isBadVersion(end)==true){
                    ans=end;
                }
                else{
                    ans=mid;
                }
            }
            
        }
         
        return ans;
    }
