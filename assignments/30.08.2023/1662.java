class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String sum1 = "";
        String sum2 = "";
        for (int i = 0; i<word1.length;i++) {
            sum1 = sum1 + word1[i];
        }
        for (int j = 0; j<word2.length;j++) {
             sum2 = sum2 + word2[j];
        }
        if (sum1.equals(sum2)) return true;
        else return false;
    }
}