class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> Count = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            if(Count.containsKey(nums[i])){
                return true;
            }
            Count.put(nums[i],1);
        }
        return false;
        
    }
}