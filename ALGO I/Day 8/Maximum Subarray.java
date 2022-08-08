class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far=Integer.MIN_VALUE;
        int max=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            max=max+nums[i];
            if(max_so_far<max)
                max_so_far=max;
            if(max<0)
                max=0;
        }
     return max_so_far;   
    }
}
