class Solution {
    public int totalNumbers(int[] digits) {
        int []freq = new int[10];
        // count the number of frequency that each of the digits is appares here 
        for(int dig : digits){
            freq[dig]++;
        }

        int count = 0;
        // for 100th digits 
        for(int i=1;i<=9;i++){
            // for the 10 digits
            for(int j=0;j<=9;j++){
                // for the unit digits here 
                for(int k=0;k<=8;k+=2){
                    int []used = new int[10];
                    used[i]++;
                    used[j]++;
                    used[k]++;

                    boolean possible = true;
                    // check whether we have a enough copy or not 
                        for(int d =0;d<=9;d++){
                            if(used[d] > freq[d]){
                                possible=false;
                                break;
                            }
                        }
                        if(possible){
                            count++;
                        }
                }
            }
        }
        return count;
    }
}