class Solution {
    public int[] twoSum(int[] nums, int target) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int arr[]=new int[2];
        int len=nums.length-1;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len+1;j++){
            sum=nums[i]+nums[j];
            if(sum==target){
            arr[0]=i;
            arr[1]=j;
            }
        }
        }
        
            return arr;
        }
        
    }
