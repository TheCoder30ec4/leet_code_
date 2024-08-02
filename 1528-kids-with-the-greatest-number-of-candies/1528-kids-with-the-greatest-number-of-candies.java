class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxi = 0;
        for(int candy: candies){
            maxi = Math.max(candy, maxi);
        }

        List<Boolean> list = new ArrayList<>();

        for(int candy: candies){

            if(candy + extraCandies >= maxi){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

        return list;


        
    }
}