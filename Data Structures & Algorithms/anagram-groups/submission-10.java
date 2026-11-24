class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] word = s.toCharArray();
            Arrays.sort(word);

            String key = new String(word);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagrams1(String[] strs) {

        //return value
        List<List<String>> result = new ArrayList<>();

        //string length
        int n = strs.length;

        //count of total characters we have grouped
        boolean[] visited = new boolean[n];

        //for loop to check each word
        for(int i =0; i<n;i++){
            List<String> group=new ArrayList<>();
            if(visited[i] == true){
                continue;
            }
            visited[i]=true;
             for(int j=i;j<n;j++){
                //boolean to check if anagram
                boolean isAnagram = true;
                int length = strs[j].length();
                if(length != strs[i].length()){
                    isAnagram = false;
                    continue;
                }
                String temp = strs[j];
                for(int k=0;k<length;k++){
                    if(!temp.contains(strs[i].charAt(k)+"")){
                    isAnagram = false;
                    break;
                }
                  temp = temp.replaceFirst(strs[i].charAt(k)+"","");
                }
                  if(isAnagram){
                     visited[j]=true;
                    group.add(strs[j]);
                }
            }
            if(group.size()!=0){
                result.add(group);
            }


        }

    return result;
        
    }
}

//O(k^2n^2): TC
//conatins and replaceFirst complexity is O(m) outer loop n,n,and then inner loop those two k,k so k^2n^2
//O(n+k): SC 
// result and visiteed n so 2n + k for temp so 2n+k = n+k complexity
