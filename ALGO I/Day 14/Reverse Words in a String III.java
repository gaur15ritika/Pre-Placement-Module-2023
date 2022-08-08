class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        int n=s.length();
        String str=" ";
        String sum=" ";
        for(int i=0;i<n;i++){
           if(s.charAt(i)!=' '){
               str=s.charAt(i)+str;
        }
            else{
                sum=sum+str;
                str=" ";
            }
            
    }
        return sum.trim();
}

}
