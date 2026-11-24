class Solution {
    public List<List<String>> groupAnagrams1(String[] strs) {

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

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {

            char[] word = strs[i].toCharArray();
            Arrays.sort(word);

            boolean added = false;

            for (int k = 0; k < result.size(); k++) {

                char[] firstWord = result.get(k).get(0).toCharArray();
                Arrays.sort(firstWord);

                if (Arrays.equals(word, firstWord)) {
                    result.get(k).add(strs[i]);
                    added = true;
                    break;
                }
            }

            if (!added) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                result.add(list);
            }
        }

        return result;
    }
}