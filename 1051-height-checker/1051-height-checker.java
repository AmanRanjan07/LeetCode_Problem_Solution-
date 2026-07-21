class Solution {

    public int heightChecker(int[] heights) {

        int[] expected = heights.clone();

        Arrays.sort(expected);

        int count = 0;
        // here it is simple that if the sorted element and original element is matched than only we have to count ++
        for (int i = 0; i < heights.length; i++) {

            if (heights[i] != expected[i]) {
                count++;
            }

        }

        return count;
    }
}