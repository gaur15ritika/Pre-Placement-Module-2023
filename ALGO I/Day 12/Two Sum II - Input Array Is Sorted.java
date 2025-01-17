class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int[] arr={-1,-1};
        int end=numbers.length-1;
        while(start!=end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                arr[0]=start+1;
                arr[1]=end+1;
                return arr;
            }
            else if(sum>target){
                end-=1;
            }
            else{
                start+=1;
            }
        }
        return arr;
    }
}
