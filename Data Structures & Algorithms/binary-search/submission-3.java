class Solution {
    public int search(int[] nums, int target) {
        
      return  binarySearch(nums, target, 0, nums.length -1);

    }

    public int binarySearch(int[] nums, int target, int bottomIndex, int topIndex){

        int middleIndex = (bottomIndex + topIndex)/2;

        if(bottomIndex == topIndex){
            if(nums[bottomIndex] == target){
                return bottomIndex;
            }else{
                return -1;
            }
        }


        if(nums[middleIndex] == target){
            return middleIndex;
        }else{
            if(target > nums[middleIndex]){
                if(middleIndex == topIndex){
                    return binarySearch(nums, target, middleIndex , topIndex);      
                }else{
                    return binarySearch(nums, target, middleIndex +1, topIndex);
                }
                
            }else{
                if(middleIndex == bottomIndex){
                    return binarySearch(nums, target, bottomIndex, middleIndex);
                }else{
                    return binarySearch(nums, target, bottomIndex, middleIndex -1 );
                }
            }
        }

    }
}
