class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int n = s.length();
        int ans = -1;

        for(int l=0;l<n;l++){
            for(int r=n-1;r>l;r--){
                if(s.charAt(l) == s.charAt(r)){
                    ans = Math.max(ans,r-l-1);
                    break;
                }
            }
        }
        return ans;
    }
}