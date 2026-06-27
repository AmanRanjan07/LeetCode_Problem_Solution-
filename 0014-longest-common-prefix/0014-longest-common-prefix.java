class Solution {
    public String longestCommonPrefix(String[] strs) {
        // If no strings
        if (strs == null || strs.length == 0) return "";

        // Use first string as reference
        String first = strs[0];

        // Go through each character in the first string
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i); // current char in first string

            // Compare this char with same index in all other strings
            for (int j = 1; j < strs.length; j++) {
                // If this string is too short or mismatch found
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    // Return everything before mismatch
                    return first.substring(0, i);
                }
            }
        }

        // All letters matched
        return first;
    }
}
    /*0123456  012345  01234
// [aayushi, aayush, aayan]
0123/u
aayu/a   u!=a that is way we are return the element up 0-2 char is mached */