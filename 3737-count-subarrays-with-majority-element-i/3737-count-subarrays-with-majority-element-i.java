class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;
        for(int s=0;s<n;s++){
            int countTar = 0;
            for(int e=s;e<n;e++){
                if(nums[e] == target){
                    countTar++;
                }
                int length = e - s + 1;
                if(countTar > length/2){
                    ans++;
                }
            }
        }
        return ans;
    }
}