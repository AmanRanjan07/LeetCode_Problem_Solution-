class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // reverse the number..of the array
        for(int []row: image){
            for(int i=0;i<(image[0].length+1)/2;i++){
                // swap the element in the row..
                int temp = row[i] ^1;
                row[i] = row[image[0].length-i-1] ^ 1;
                row[image[0].length-i-1] = temp;
            }
        }
        return image;
    }
}