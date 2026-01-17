class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_pointer = 0;
        int t_pointer = 0;

        while(s_pointer < s.length() && t_pointer < t.length()){
            if(s.charAt(s_pointer) == t.charAt(t_pointer)){
                s_pointer++;
            }
            t_pointer++;
        }

        return s_pointer == s.length();
    }
}