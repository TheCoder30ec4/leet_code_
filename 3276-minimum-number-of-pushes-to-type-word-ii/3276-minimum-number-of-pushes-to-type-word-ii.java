class Solution {
    public int minimumPushes(String word) {
        
        int [] map = new int[128];
        int toaltSum = 0;

        for(int i=0;i<word.length();i++){

            map[word.charAt(i)]++;
        }

        Arrays.sort(map);
        for(int i=0;i<map.length/2;i++){
            int temp = map[i];
            map[i] = map[map.length-i-1];
            map[map.length-i-1] = temp;

        }

        for(int i=0;i<map.length;i++){

            toaltSum += (map[i] * ((i/8)+1));
        }

        return toaltSum;
        
    }
}