class Solution {
    List<List<Integer>> solution1=new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
        go(new ArrayList<Integer>(), n, k);
        return solution1;
    }

    private void go(ArrayList<Integer> sol1, int n, int k){
        if(k==0) solution1.add(sol1);
        for(int i=n; i>=k && k>0; --i){
            ArrayList<Integer> s1=new ArrayList<>(sol1);
            s1.add(i);
            go(s1, i-1, k-1);
        }
    }
}