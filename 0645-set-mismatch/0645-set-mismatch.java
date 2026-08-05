class Solution {
    public int[] findErrorNums(int[] nums) {
        
       
        int i = 0;

        while (i < nums.length) {
            int curr = nums[i] - 1;
            if (nums[i] != nums[curr]) {
                swap(nums, i, curr);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int ind = 0; ind < nums.length; ind++) {
            if (nums[ind] != ind + 1) {
                return new int[] {nums[ind], ind + 1};
            }
        }

        return new int[] {-1,-1};
    }

    static void swap(int[] arr, int fis, int sec) {
        int temp = arr[fis];
        arr[fis] = arr[sec];
        arr[sec] = temp;
    }
}
    