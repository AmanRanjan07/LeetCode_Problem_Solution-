class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> ot = new ArrayList<>();
        // ot.add(new ArrayList<>());  // Start with empty subset
        // for(int i=0;i<nums.length;i++){
        //     int  n = ot.size();
        //     for(int j=0;j<n;j++){
        //         List<Integer> inter = new ArrayList<>(ot.get(j));
        //         inter.add(nums[i]);
        //         ot.add(inter);
        //     }
        // }
        // return ot;

        List<List<Integer>> ot = new ArrayList<>();
        ot.add(new ArrayList<>()); 

        for(int i=0;i<nums.length;i++){
            int n = ot.size();
            for(int j=0;j<n;j++){
                List<Integer> inner = new ArrayList<>(ot.get(j));
                inner.add(nums[i]);
                ot.add(inner);
            }
        }
        return ot;
    }
}