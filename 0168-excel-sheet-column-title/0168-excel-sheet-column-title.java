class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            columnNumber--; // Shift to 0-indexed equivalent
            char ch = (char) ('A' + (columnNumber % 26));
            result.append(ch);
            columnNumber /= 26;
        }
        
        // Since we built the title from right to left, reverse it
        return result.reverse().toString();
    }
}