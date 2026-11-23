class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> s_count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            s_count.put(i, nums[i]);
        }

        int[] arr = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int needed = target - num;

            arr[0] = i;

            if (s_count.containsValue(needed)) {

                for (Map.Entry<Integer, Integer> entry : s_count.entrySet()) {
                    if (entry.getValue() == needed && entry.getKey() != i) {
                        arr[1] = entry.getKey();
                        return arr;
                    }
                }
            }
        }

        return arr;
    }
    public int[] twoSum1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }
        }

        return new int[]{};
    }

}