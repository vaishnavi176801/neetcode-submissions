class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s_count = new HashMap<>();
        HashMap<Character, Integer> t_count = new HashMap<>();
        if(t.length() != s.length()){
            return false;
        }

        for(int i =0; i<t.length();i++){
            if(s_count.containsKey(s.charAt(i))){
                s_count.put(s.charAt(i), s_count.get(s.charAt(i))+1);
            }
            else{
                s_count.put(s.charAt(i),1);
            }
            if(t_count.containsKey(t.charAt(i))){
                t_count.put(t.charAt(i), t_count.get(t.charAt(i))+1);
            }
            else{
                t_count.put(t.charAt(i),1);
            }

        }
        if(s_count.equals(t_count)){
            return true;
        }
    return false;

    }
    public boolean isAnagram1(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();
        if(s_len != t_len){
            return false;
        }

        for(int i =0;i<s_len;i++){
            boolean exists = false;
            char temp = s.charAt(i);
            for(int j=0; j<s_len;j++){
                if(temp == t.charAt(j)){
                    t.replace(temp,' ' );
                    exists = true;
                    break;
                }
                
            }
            if(!exists){
                return exists;
            }
            
        }
        return true;

    }
}
