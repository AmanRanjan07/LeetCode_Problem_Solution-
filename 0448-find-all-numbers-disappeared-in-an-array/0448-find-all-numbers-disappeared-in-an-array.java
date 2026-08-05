class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
        int curr = nums[i] - 1;
        if(nums[i] != nums[curr]){
            swap (nums,i,curr);
        } else{
            i++;
        }
        }
        List<Integer> ans = new ArrayList<>();
        for(int ind = 0;ind<nums.length;ind++){
            if(nums[ind] != ind+1){
                ans.add(ind+1);
            }
        }
        return ans;

    }
    static void swap(int []arr, int fis , int sec){
        int temp = arr[fis];
        arr[fis] = arr[sec];
        arr[sec] = temp;
    }
}