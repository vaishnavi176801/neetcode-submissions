class Solution {
    public boolean isAnagram(String s, String t) {
//tc : O(NLOGN)
//SC: O(N)
        int n = s.length();
        int m = t.length();
        if(n != m){
            return false;
        }
        HashMap<Character,Integer> s_count = new HashMap<>();

        HashMap<Character,Integer> t_count = new HashMap<>();

        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(s_count.containsKey(s.charAt(i))){
                s_count.put(ch, s_count.get(ch)+1);
            }
            else{
                s_count.put(ch,1);
            }
            ch = t.charAt(i);
            if(t_count.containsKey(t.charAt(i))){
                t_count.put(ch, t_count.get(ch)+1);
            }
            else{
                t_count.put(ch,1);
            }

        
        }

        
         return s_count.equals(t_count);


    }
    /*public boolean isAnagram(String s, String t) {
//tc : O(NLOGN)
//SC: O(N)

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


    }*/
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
