class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        if(s.length() != t.length()){
            return false;
        }
        char []a =s.toCharArray();
        char []b =t.toCharArray();
// Simply we sort both the array and compare then weather it is equal or not here..
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return true;
        }
    return false;
    }
}