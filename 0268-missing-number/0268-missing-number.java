class Solution {
    public int missingNumber(int[] nums) {
        // int uniqu = nums.length;
        // for(int i=0;i<nums.length;i++){
        //     uniqu ^= nums[i];
        //     uniqu ^= i;
        // }        
        // return uniqu;

        int n = nums.length;
        int Tsum = (n*(n+1))/2;
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        return Tsum - sum;
    }
}