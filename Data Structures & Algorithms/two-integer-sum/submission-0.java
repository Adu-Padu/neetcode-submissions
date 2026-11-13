class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int k = 0; k < nums.length; k++){
                if ( k != i){
                    if((nums[i] + nums[k]) == target){
                        output[0] = i;
                        output[1] = k;
                        return output;
                    }
                }
            }
        }
        return output;
    }
}
