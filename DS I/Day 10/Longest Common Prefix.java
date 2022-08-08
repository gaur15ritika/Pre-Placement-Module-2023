class Solution {
    static String commonPrefix(String s1,String s2){
        String result="";
        int n1=s1.length();
        int n2=s2.length();
        for(int a=0, b=0; a<=n1-1 && b<=n2-1; a++,b++){
            if(s1.charAt(a) != s2.charAt(b)){
                break;
            }
            result+=s1.charAt(a);
        }
        return(result);
    }
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String prefix=strs[0];
        for(int i=1; i<n; i++){
            prefix=commonPrefix(prefix,strs[i]);
        }
        return(prefix);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        String ssr[]= new String[l];
        for(int i=0; i<l; i++){
            ssr[i]=sc.next();
        }
        Solution obj=new Solution();
        String ans=obj.longestCommonPrefix(ssr);
        if(l>0){
            System.out.println(ans);
        }
        else{
            System.out.println("");
        }
    } 
}
