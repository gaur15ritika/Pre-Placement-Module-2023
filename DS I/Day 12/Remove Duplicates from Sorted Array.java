class Solution 
    {
        public int removeDuplicates(int[] nums) {
           
        int n=nums.length;
             if(n==0|| n==1){
                return n;
            }
        int temp[]= new int[n];
        int r=0;
        for(int i=0; i<n-1;i++){
                if(nums[i]!=nums[i+1]){
                    temp[r++]=nums[i];
                }
        }
            temp[r++]=nums[n-1];
            
            for(int y=0; y<r;y++){
                nums[y]=temp[y];
            }                
           return r; 
        }
    
        
    }


