class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        for(int len = 2; len <= 9;len++){//Length of the sequencial number
        for(int st = 1;st<=10 - len;st++){  // startig of the digit here...
            int num = 0;
            int dig = st;
            for(int i=0;i<len;i++){
                num = num * 10 + dig;
                dig++;
            }

            // Check weather it is lies with the range or not here
            if(num >= low && num <= high){
                ans.add(num);
                }
            }
        }
        return ans;
    }
}