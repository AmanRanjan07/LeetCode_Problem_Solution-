class Solution {
    public int maxDepth(String s) {
      
        int currDep = 0;
        int maxDepth = 0;
        for(char c:s.toCharArray()){
            if(c == '('){
                currDep++;
                maxDepth = Math.max(maxDepth,currDep);
            } else if(c == ')'){
                currDep--;
            }
        }
        return maxDepth;
    }
}