class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int val = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[val]){
                val++;
                nums[val] = nums[i];
            }
        }
        return val+1;
    }
}