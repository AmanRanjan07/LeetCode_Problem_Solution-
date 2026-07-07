class Solution {
    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);
        long x = 0;
        long sum = 0;
        for(char ch:str.toCharArray()){
            long rem = ch -'0';
            if(rem !=0){
            x = (x*10)+rem;
            sum += rem;
            }
        }
        return x*sum;
    }
}