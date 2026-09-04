class Solution {
    public int missingNumber(int[] nums) {
        int uniqu = nums.length;
        for(int i=0;i<nums.length;i++){
            uniqu ^= nums[i];
            uniqu ^= i;
        }        
        return uniqu;
    }
}