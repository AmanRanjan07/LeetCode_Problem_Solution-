class Solution {
    public int[] plusOne(int[] digits) {
        // int n = digits.length;
        // for(int i=n-1;i>=0;i--){  // moving from the last digits of the array
        //     if(digits[i] < 9){ // if the last element of the array < 9 simpily add +1
        //         digits[i]++;  //  +1 into that number here .. 
        //         return digits;   // return the digits number here
        //     }
        //     digits[i]=0;    // if not than simpliy initialised with the zero 0.
        // }
        // digits = new int[n+1];
        // digits[0] = 1;
        // return digits;

        int n = digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits =  new int[n+1];
        digits[0] = 1;
        return digits;
    }
}