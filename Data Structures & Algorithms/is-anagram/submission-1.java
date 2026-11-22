class Solution {
    public boolean isAnagram(String s, String t) {


        int n = s.length();
        int m = t.length();
        if(n != m){
            return false;
        }
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        for(int i =0;i<n;i++){
            boolean isThere = false;
            if(s_arr[i] != t_arr[i]){
                return false;
            }
            
        }
        return true;


    }

    public int count_letter(char alph, String s){
        int n = s.length();
        int count=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == alph){
                count++;
            }
        }
        return count;
    }
}
