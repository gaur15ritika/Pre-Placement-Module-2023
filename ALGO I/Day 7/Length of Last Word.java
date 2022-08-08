class Solution {
    public int lengthOfLastWord(String s) {
        int n;
        int m=0;
        s=s.trim();
        String s1="";
        n=s.length();
     for(int i=n-1;i>=0;i--){
         if(s.charAt(i)!=' '){
             m++;
             s1=s1+s.charAt(i);
             
         }
         else{
             break;
         }
     }
       return m; 
    }
}
