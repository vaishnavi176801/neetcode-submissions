
class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Time : O(N^2)
        //SPACE : O(1)
        /*int n = nums.length;
        for(int i = 0;i < n;i++){
            for(int j = i+1;j < n;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            
        }
        }
    return false;*/

    HashMap<Integer, Integer> count = new HashMap<>();
    int n = nums.length;
    for(int i = 0;i<n;i++){
        if(count.containsKey(nums[i])){
            return true;
        }
        count.put(nums[i],1);
    }

    return false;
    }
    
}