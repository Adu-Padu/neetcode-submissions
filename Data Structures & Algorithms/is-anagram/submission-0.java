class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length())
        {
            char[] newS = s.toCharArray();
            char[] newT = t.toCharArray();
            Arrays.sort(newS);
            Arrays.sort(newT);

            if (Arrays.equals(newS, newT)) 
            {
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
