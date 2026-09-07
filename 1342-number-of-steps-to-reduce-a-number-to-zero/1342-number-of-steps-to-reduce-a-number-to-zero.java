class Solution {
    public int numberOfSteps(int num) {
        // int co = 0;
        // while(num > 0){// while we use beacause the we don't know the number
        //     num = num % 2 == 0 ? num /= 2 : num - 1;
        //     co++;
        // }
        // return co;/


        // using of the recursion here...
        return helper(num,0);
    }
    static int helper(int num, int step){
        if(num == 0){
            return step;
        }
        if(num % 2 == 0){
            return helper(num/2,step+1);
        }
        return helper(num-1,step+1);
    }
}