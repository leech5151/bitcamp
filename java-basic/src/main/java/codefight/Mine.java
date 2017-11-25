package codefight;

public class Mine {
    int[][] minesweeper(boolean[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == true) {
                    if(0 < i && 0 < j) result[i-1][j-1]++;
                    if(0 < i) result[i-1][j]++;
                    if(0 < i && j < matrix[i].length-1) result[i-1][j+1]++;

                    if(0 < j) result[i][j-1]++;
                    if(j < matrix[i].length-1) result[i][j+1]++;

                    if(i < matrix.length-1 && 0 < j) result[i+1][j-1]++;
                    if(i < matrix.length-1) result[i+1][j]++;
                    if(i < matrix.length-1 && j < matrix[i].length-1) result[i+1][j+1]++;
                }
            }
        }
//        for(int i = 0; i < matrix.length; i++) {
//            for(int j = 0; j < matrix[i].length; j++) {
//                if(matrix[i][j] == true) result[i][j] = 1;
//            }
//        }

        return result;
    }
    public static void main(String[] args) {
        boolean[][] a = {{true,false,false}, 
                {false,true,false}, 
                {false,false,false}};
    }
}
