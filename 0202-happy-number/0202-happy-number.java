class Solution {
    public boolean isHappy(int n) {
        // using the Single linked List..
        // this is the Linked List Approach by which we can solve the problem in the easy way
        // For this we can also use the HashFunction to store the value here...
        // This is one of the unique way.. where are finding the values by the using of "Cyclic detection" into a loop....
        int fast = n;
        int slow = n;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }
        while(slow != fast);
        if(slow == 1){
            return true;
        }
        return false;

        
    }
    private int findSquare(int number){
        int sum = 0;
        while(number > 0){
            int rem = number % 10;
            sum += rem * rem;
            number /= 10;
        }
        return sum;
    }
}