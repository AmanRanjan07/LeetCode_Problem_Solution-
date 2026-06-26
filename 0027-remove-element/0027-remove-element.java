class Solution {
    public int removeElement(int[] nums, int val) {
        int newVal = 0;
        for(int i=0;i< nums.length;i++){
            if(nums[i] != val){
                nums[newVal] = nums[i];
                newVal++;
            }
        }
        return newVal;
    }
}