class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] arr= new int[nums.length];
        int start=0;
        int end=nums.length-1;
        for(int i=nums.length-1; i>=0;i--)
        {
            if(Math.abs(nums[start])>Math.abs(nums[end])){
                arr[i]=(int) Math.pow(nums[start],2);
                start++;
            }
            else{
                arr[i]=(int) Math.pow(nums[end],2);
                end--;
            }
        }  
        return arr;
    }
}
