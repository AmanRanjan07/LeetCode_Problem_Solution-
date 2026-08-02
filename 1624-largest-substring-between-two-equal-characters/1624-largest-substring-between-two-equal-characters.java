class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int n = s.length();
        int ans = -1;
        for(int le=0;le<n;le++){
            for(int ri = n-1;ri>le;ri--){
                if(s.charAt(le) == s.charAt(ri)){
                    ans = Math.max(ans,ri - le - 1);
                    break;
                }
            }
        }
        return ans;
    }
}