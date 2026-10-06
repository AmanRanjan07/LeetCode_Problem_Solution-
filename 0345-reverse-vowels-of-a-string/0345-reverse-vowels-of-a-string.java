class Solution {
    public String reverseVowels(String s) {

        char [] arr = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;

        while(l < r){
            while(l < r && !isVowel(arr[l])){  // move lift until we find the Vowel 
                l++;
            }
            while(l < r && !isVowel(arr[r])){
                r--;
            }
            // swapVowel
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return new String(arr);
        
    }
    private boolean isVowel(char ch){
        return ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}