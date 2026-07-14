class Solution {
    public String convert(String s, int numRows) {

        // Special case: no zigzag needed 
        if (numRows == 1 || s.length() <= numRows)
            return s;

        // Create one StringBuilder for each row
        List<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean goingDown = true;

        // Place each character in the correct row
        for (char ch : s.toCharArray()) {

            rows.get(currentRow).append(ch);

            // Change direction at the top or bottom
            if (currentRow == 0) {
                goingDown = true;
            } else if (currentRow == numRows - 1) {
                goingDown = false;
            }

            // Move to the next row
            if (goingDown)
                currentRow++;
            else
                currentRow--;
        }

        // Join all rows
        StringBuilder ans = new StringBuilder();

        for (StringBuilder row : rows) {
            ans.append(row);
        }

        return ans.toString();
    }
}