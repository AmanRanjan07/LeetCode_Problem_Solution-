class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int [] freq = new int[55];
        for(int num : nums){
            freq[num]++;
        }
        // case 1 k == 1;
        if(k==1){
            int max = -1;
            for(int num : nums){
                if(freq[num] == 1){
                    max = Math.max(max,num);
                }
            }
            return max;
        }
        //case 2 k == n...
        if(k == n){
            int max = -1;
            for(int num : nums){
                max = Math.max(max,num);
            }
            return max;
        }
        // case 3 : 1 < k < n
        int ans = -1;

        if(freq[nums[0]] == 1){  // check first element 
            ans = nums[0];
        }
        if(freq[nums[n-1]] == 1){ // check the last element 
            ans = Math.max(ans,nums[n-1]);
        }
        return ans;
    }
}