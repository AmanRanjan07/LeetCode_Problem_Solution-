class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){ // Skiped the non-alphanumric character from the left side 
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){ // skipped the non-alphabetics character form the right side 
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;   // convert it into lowerCase and Compare the leftMost and rightMost character
            }
            left++;
            right--;
        }
        return true;
    }
}

// This is the two pointer apprach where we are finding the palindrome of the string value removing the non-character value 
