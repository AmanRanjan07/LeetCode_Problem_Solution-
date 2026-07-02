class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        // char [] temp = new char[s.length];
// set the index using two pointer into this and make swap with the two pointer..
        while(l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}