/* 문장: 반복문 while - 반복문 중첩 + break */
package bitcamp.java100;

public class pra {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        int[][] fin = new int[5][5];
        int i = 0;
        int j = 0;

        for(i = 0; i<arr.length; i++) {
            
            labal0:
            for(j = 0; j<arr.length; j++) {
                arr[i][j] = (int)(Math.random() * 25 + 1);

                labal1:
                    for(int x = 0; x < i; x++) {
                        for(int y = 0; y < j; y++) {
                            if(i + j + x + y == 0) {
                                break labal1;
                            }
                            if (i == x && j == y) break labal1;
                            else if (arr[i][j] == arr[x][y]) {
                                j--;
                                break labal0;
                            }
                        }
                    }
                fin[i][j] = arr[i][j];
            }
        }


        for(int a = 0; a < 5; a++) {
            for(int b = 0; b < 5; b++) {
                System.out.printf("%3d",fin[a][b]);
            }
            System.out.println();
        }
    }
}

