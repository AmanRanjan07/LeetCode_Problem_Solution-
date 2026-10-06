class Solution {
    public boolean isIsomorphic(String s, String t) {
        int [] Smap = new int[256];
        int [] Tmap = new int[256];

        for(int i=0;i<s.length();i++){
            char sch = s.charAt(i);
            char tch = t.charAt(i);

            if(Smap[sch] != Tmap[tch]){
                return false;
            }
            Smap[sch] = i+1;
            Tmap[tch] = i+1;
        }
        return true;
    }
}