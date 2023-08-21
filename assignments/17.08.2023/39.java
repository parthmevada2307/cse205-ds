class Solution {
    public void sol1(int index,int[] array,int target,List<List<Integer>> result,List<Integer> ds){
      if(index>=array.length){
          if(target==0){
              result.add(new ArrayList<>(ds));
          }
          return;
      }
        if(array[index]<=target){
            ds.add(array[index]);
            sol1(index,array,target-array[index],result,ds);
            ds.remove(ds.size()-1);
        }
        sol1(index+1,array,target,result,ds);
    }
    public List<List<Integer>> combinationSum(int[] array, int target) {
       List<List<Integer>> ans= new ArrayList<>();
       sol1(0,array,target,ans,new ArrayList<>());
        return ans;
    }
}