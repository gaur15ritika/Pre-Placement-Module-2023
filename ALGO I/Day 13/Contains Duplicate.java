class Solution {
    public boolean containsDuplicate(int[] nums) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(al.get(i)==nums[i]){
                return true;
            }
            else{
                al.add(nums[i]);
            }
        }
        return false;
    }
}
