package BackJoon;

class Solution {
    static public int solution(int[][] maps) {
        int answer = 1;
        boolean result = true;
        int x = 0, y = 0;
        int x1 = 0, y1 = 0;


        while(true){
            if(x == maps.length-1) {
                for(int i = y+1; i < maps.length; i++) {
                    if(maps[x][i] == 0) return -1;
                }
                y += (maps.length-1) - y;
                answer += (maps.length-1) - y;
            }
            if(y == maps.length-1) {
                for(int i = x+1; i < maps.length; i++) {
                    if(maps[i][y] == 0) return -1;
                }
                answer += (maps.length-1) - x;
                x += (maps.length-1) - x;
            }
            if(result == false) return -1;
            if(x == maps.length-1 && y == maps.length-1) break;
            while(true) {
                result = false;
                if(maps[x][y] != maps[x][y+1] && maps[x][y] != maps[x+1][y]) {
                    if(x - 1 == x1) {
                        result = true;
                        answer++;
                        y1 = y;
                        x1 = x;
                        y--;
                        break;
                    }
                    if(y - 1 == y1) {
                        result = true;
                        answer++;
                        x1 = x;
                        y1 = y;
                        x--;
                        break;
                    }
                    if(result == false) return -1;
                }
                if(maps[x][y] == maps[x][y+1] && y < maps[0].length) {
                    result = true;
                    answer++;
                    y1 = y;
                    x1 = x;
                    y++;
                    break;
                }
                if(maps[x][y] == maps[x+1][y] && x < maps.length) {
                    result = true;
                    answer++;
                    x1 = x;
                    y1 = y;
                    x++; 
                    break;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        int[][] maps = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,0},
                {0,0,0,0,1}};
        System.out.println(solution(maps));
    }
}