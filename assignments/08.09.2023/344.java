class Solution {
    void rev(char[] s,int i) {
            if (i >= s.length/2) {
                return;
            }
            char temp;
            temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
            rev(s, i+1);
    }
    public void reverseString(char[] s) {
        rev(s,0);
        
        }
    
}