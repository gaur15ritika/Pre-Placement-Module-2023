class Solution {
    public int removeElement(int[] nums, int val) {
        int a=nums.length;
        int temp[]=new int[a];
        int j=0;
        for (int i=0; i<a; i++)
        {
            if(nums[i]!=val){
                temp[j++]=nums[i];
            }
        }
            for(int y=0; y<j;y++){
                nums[y]=temp[y];
            }
        return j;
        }
    }
