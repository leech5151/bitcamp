/* 문장: 반복문 while - 반복문 중첩 + break */
package bitcamp.java100;

public class test {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        for(int i = 0; i<5; i++) {
            for(int j = 0; j<5; j++) {
                arr[i][j] = (int)(Math.random() * 25);
                int x = 0;
                for(x = 0; x < i; x++) {
                    for(int y =0; y < j; y++) {
                        if(arr[x][y]==arr[i][j]) {
                            j--;
                            x = i;
                            break;
                        }
                        else continue;
                    }
                }
            }
        }
        for(int a = 0; a < 5; a++) {
            for(int b = 0; b < 5; b++) {
                System.out.printf("%3d",arr[a][b]);
            }
            System.out.println();
        }
    }
}

