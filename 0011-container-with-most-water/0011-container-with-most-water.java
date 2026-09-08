class Solution {
    public int maxArea(int[] height) {

        int left = 0; // take the left most height here 
        int right = height.length - 1;// take the right most height of the container

        int maxArea = 0; // Inlisized the the maxArea as 0..

        while (left < right) {  // check until l < r
 
            int width = right - left;  // length between the two container

            int currHeight = Math.min(height[left], height[right]);  
    // find the height which is the min height among the two container
            int area = width * currHeight; // calculate the area between the two container

            maxArea = Math.max(maxArea, area); // take maximum values between them

            if (height[left] < height[right]) {// check height between both the container here
                left++;  // do left ++ if the left side is small here
            } else {
                right--;  // otherwise do right ++ 
            }
        }

        return maxArea;  // Final answer, maximun =  width * maximum height .... 
    }
}