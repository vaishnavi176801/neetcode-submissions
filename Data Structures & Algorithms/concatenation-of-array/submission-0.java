class Solution {
    public int[] getConcatenation(int[] nums) {
        //TC =
        //SC =

        int n = nums.length;
        int[] result = new int[2*n];
        for( int i =0; i < 2* n -1 ; i++){
            if(i < n){
                result[i] = nums[i];
                System.out.println(result[i]);
            }
            else{
                result[i] = nums[i- n];
                 System.out.println(result[i]);
            }
         

        }
        result[2*n -1] = nums[n-1];
        return result;
        
    }
}