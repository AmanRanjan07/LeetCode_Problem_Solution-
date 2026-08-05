class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int corr = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[corr]){
                swap(nums,i,corr);
            }
            else{
                i++;
            }
        }
        for(int ind =0;ind < nums.length;ind++){
            if(nums[ind] != ind){
                return ind;
            }
        }
        return nums.length;
    }

void swap(int []nums,int fis, int sec){
    int temp = nums[fis];
    nums[fis] = nums[sec];
    nums[sec] = temp;
    }
}