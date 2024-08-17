class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();

        for(String i: word1){
            res1.append(i);
        }

        for(String i: word2){
            res2.append(i);
        }

        if(res1.toString().equals(res2.toString())){
            return true;
        }
        return false;
        
    }
}