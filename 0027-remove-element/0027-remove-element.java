class Solution {
    public int removeElement(int[] nums, int val) {
        // int newVal = 0;
        // for(int i=0;i< nums.length;i++){
        //     if(nums[i] != val){
        //         nums[newVal] = nums[i];
        //         newVal++;
        //     }
        // }
        // return newVal;

        int uniq = 0;
        for(int s=0;s<nums.length;s++){
            if(nums[s] != val){
                nums[uniq] = nums[s];
                uniq++;
                
            }
        }
        return uniq;
    }
}