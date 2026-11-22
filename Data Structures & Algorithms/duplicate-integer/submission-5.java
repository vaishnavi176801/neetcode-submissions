class Solution {
    public boolean hasDuplicate(int[] nums) {

        for(int i=0;i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
     public boolean hasDuplicate1(int[] nums) {

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