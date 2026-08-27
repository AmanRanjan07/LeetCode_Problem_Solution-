// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxSum = Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             int sum = 0;
//             for(int j=i;j<nums.length;j++){
//                 sum += nums[j];
//                 if(maxSum < sum){
//                     maxSum = sum;
//                 }
//             }
//         }
//         return maxSum;
//     }
// }

// the above one logic is correct but the time complexity is more here so that we can use the kadane's algorith or the dynamic programming algorithms ....

class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i=1;i<nums.length;i++){
            if(currentSum < 0){
                currentSum = nums[i];
            }
            else{
                currentSum += nums[i];
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
