class Solution {
    public int[] twoSum(int[] nums, int target) {
        //O(n)
        ArrayList<Integer> numsArr = new ArrayList<>();

        for (int num : nums) {
            numsArr.add(num);
        }

        int[] arr = new int[2];
        for(int i =0; i<nums.length;i++){
            arr[0]= i;
            int current = numsArr.get(i);
            numsArr.remove(i);
        
            if(numsArr.contains(target-nums[i])){
                arr[1] = numsArr.indexOf(target-nums[i]);
              if (arr[1] >= i) {
                    arr[1]++;
                }

                return arr;
            }

            // Restore the element if no match was found
            numsArr.add(i, current);
        }
        return arr;
    }
}
