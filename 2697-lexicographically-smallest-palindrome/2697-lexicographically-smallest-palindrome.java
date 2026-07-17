class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length - 1;
        while(l < r){
            if(arr[l] != arr[r]){
                char sm = (char) Math.min(arr[l],arr[r]);
                arr[l] = sm;
                arr[r] = sm;
            }
            l++;
            r--;
        } 
        return new String(arr); 
    }
}

// lexicographic means that what the smallest move that make the changes into the string or anything it will be become the palindrome like, how we can swap to make the answer