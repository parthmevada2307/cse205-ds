class Solution {
    List<List<Integer>> A1 = new ArrayList<>();
    //List<Integer> B1 = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        toMakePermutations(A1,new ArrayList(),nums);
        return A1;
    }
    public void toMakePermutations(List<List<Integer>> A1,ArrayList<Integer> B1, int[] nums) {
        if (nums.length == B1.size()) {
           A1.add(new ArrayList(B1));
            return;
        }
        for (int count: nums) {
            if (B1.contains(count)) 
            continue;
            B1.add(count);
            toMakePermutations(A1,B1,nums);
            B1.remove(B1.size()-1);
        }
    }
}