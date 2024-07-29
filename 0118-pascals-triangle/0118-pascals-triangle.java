class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            list.add(genrateRow(i));
        }

        return list;
        
        
    }

    public List<Integer> genrateRow(int n){
        int ans =1;
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for(int i=1;i<n;i++){
            ans = ans *(n-i);
            ans = ans/i;

            res.add(ans);
        }
        return res;
    }
}