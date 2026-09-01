class Solution {
    public int removeDuplicates(int[] nums) {
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