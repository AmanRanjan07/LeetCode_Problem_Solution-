class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // Arrays.sort(nums);
        List<List<Integer>> ot = new ArrayList<>();
        ot.add(new ArrayList<>());  // Start with empty subset

        // int st = 0;
        // int ed = 0;
        for(int i=0;i<nums.length;i++){
            // st = 0;
            // if(i>0 && nums[i] == nums[i+1]){
            //     st = ed+1;
            // }
            // ed = ot.size() - 1;
            int  n = ot.size();
            for(int j=0;j<n;j++){
                List<Integer> inter = new ArrayList<>(ot.get(j));
                inter.add(nums[i]);
                ot.add(inter);
            }
        }
        return ot;
    }
}