class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            nums1[m]=nums2[i];
            m++;
        }
        Arrays.sort(nums1);
        int a=nums1.length;
        for(int j=0;j<a;j++){
            System.out.println(nums1[j]);
        }
    }
}
