class Solution {
    public boolean isPalindrome(String s) {

        s = s.replace(" ", "");
        s= s.toLowerCase();
        int n = s.length();
        if(s == null)return true;
        else if(n==0 || n == 1)return true;
        s = s.replaceAll("[^a-z A-Z 0-9]","");
        n = s.length();


        //System.out.println(s_reverse+"  "+s_string);
        String s_reverse = "";
        for(int i=0;i<n;i++){
            s_reverse = s_reverse + s.charAt(n-i-1);
        }
         System.out.println(s_reverse+"  "+s);
        if(!s_reverse.equals(s))return false;

        return true;

        
    }
}
