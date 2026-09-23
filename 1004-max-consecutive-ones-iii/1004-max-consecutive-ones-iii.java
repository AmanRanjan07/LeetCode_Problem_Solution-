class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int zero = 0;
        int maxSize =  Integer.MIN_VALUE;
        for(int idx=0;idx <nums.length;idx++){
            if(nums[idx] == 0) zero++;

            while(zero>k){
                if(nums[i] == 0) zero--;
                i++;
            }
            maxSize = Math.max(maxSize,idx - i + 1);
        }
        return maxSize;
    }
}