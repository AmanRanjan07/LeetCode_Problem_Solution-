class Solution {
    public char findTheDifference(String s, String t) {

        // Approach number 1..
        // Use the concept of XOR operator here if x ^ x means 0.
        // char c = 0;
        // for(int i=0;i<s.length();i++){
        //     c ^= s.charAt(i);
        // }
        // //XOR of all charater of t...
        // for(int i=0;i<t.length();i++){
        //     c ^= t.charAt(i);
        // }
        // return c;

        // 2 Approach

        int sumS = 0;
        int sumT = 0;

        for(char c : s.toCharArray()){
            sumS += c;
        }
        for(char c : t.toCharArray()){
            sumT += c;
        }

        return (char)(sumT - sumS);
    }
}