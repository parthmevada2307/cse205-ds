class Solution {
    public int findKthPositive(int[] arr, int k) {
        for (int index : arr) {
          if (index <= k) k++; 
          else break;
        }
        return k;
    }
}