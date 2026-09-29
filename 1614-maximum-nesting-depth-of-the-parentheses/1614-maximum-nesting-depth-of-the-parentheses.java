class Solution {
    public int maxDepth(String s) {
        int currDepth = 0; //initial 0
        int maxDepth = 0;
// for (int i = 0; i < s.length(); i++) {
//     char c = s.charAt(i); // get character at index i
        for(char c : s.toCharArray()){
            if(c == '('){
                currDepth++;
                maxDepth = Math.max(maxDepth,currDepth);
            } else if(c == ')'){
                currDepth --;
            }
        }
        return maxDepth;
    }
}