// class Solution {
//     public void rotate(int[] nums, int k) {

//         int n = nums.length;
//         k = k % n;

//         for (int i = 0; i < k; i++) {

//             // Save last element
//             int last = nums[n - 1];

//             // Shift all elements to the right
//             for (int j = n - 1; j > 0; j--) {
//                 nums[j] = nums[j - 1];
//             }

//             // Put last element at first position
//             nums[0] = last;
//         }
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        // Copy back
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}