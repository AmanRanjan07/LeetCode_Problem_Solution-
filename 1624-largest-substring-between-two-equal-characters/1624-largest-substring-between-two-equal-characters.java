class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int n = s.length();
        int ans = -1;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(s.charAt(i) == s.charAt(j)){
                ans = Math.max(ans,j-i-1);
                break;
                }
            }
        }
        return ans;
    }
}