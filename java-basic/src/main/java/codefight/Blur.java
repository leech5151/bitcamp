package codefight;

public class Blur {
    int[][] boxBlur(int[][] image) {
        int[][] blur = new int[image.length-2][image[0].length-2];
        
        for(int x = 0; x < blur.length; x++) {
            for(int y = 0; y < blur[x].length; y++) {
                for(int i = x; i < x+3; i++) {
                    for(int j = y; j < y+3; j++) {
                        blur[x][y] += image[i][j];
                    }
                }
                blur[x][y] /= 9;
            }
        }
        
        return blur;
    }
    public static void main(String[] args) {
        int[][] a = {{7,4,0,1}, 
                     {5,6,2,2}, 
                     {6,10,7,8}, 
                     {1,4,2,0}};
        
        
    }
}
