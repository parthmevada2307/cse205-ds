class Solution {
    public List<List<Integer>> generate(int numRows) {  
       if (numRows == 0) return new ArrayList();
       List<List<Integer>> Answer = new ArrayList();

       for (int x = 1; x<=numRows;x++) {
           List<Integer> T = new ArrayList();
           for (int y = 0; y<x;y++) {
               if (y == 0 || y == x-1) {
                   T.add(1);
               }
               else {
                   T.add(Answer.get(x-2).get(y) + Answer.get(x-2).get(y-1));
               }
           }
           Answer.add(T);
       }
       return Answer;
       
    }
}