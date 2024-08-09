class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        List<int[]> list = new ArrayList<>();
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        int step = 1;
        int d=0;
        int r= rStart, c = cStart;
        list.add(new int[]{r,c});

        while(list.size() < rows*cols){
            for(int i=0;i<2;i++){
               for (int j = 0; j < step; ++j) {
                    r += directions[d][0];
                    c += directions[d][1];
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        list.add(new int[]{r, c});
                    }
                }
                d = (d + 1) % 4;
            }
            ++step;
        }

        return list.toArray(new int[list.size()][]);
        
    }
}