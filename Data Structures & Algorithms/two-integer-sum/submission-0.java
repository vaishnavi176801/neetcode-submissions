class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int n = nums.length;
        if(n <= 1)return ans;
        for(int i=0; i<n; i++){
            int num1 = nums[i];
            for(int j= i+1; j<n; j++){
                if(nums[j] == (target-nums[i])){
                    ans[0] = i;
                    ans[1] = j;
                    break;

                }


            }
        }
        return ans;
    }
}
