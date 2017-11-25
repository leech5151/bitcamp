package BackJoon;

class Solution2 {
    static public int solution(String arr[]) {
        int answer = 0;
        int temp = 0;
        int max = 0;
        int index = 0;
        int count = 0;

        while(true) {
            count = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i].equals("-") == true) {
                    count++;
                    if(max < arr[i+1].charAt(0) - '0') {
                        max = arr[i+1].charAt(0) - '0';
                        index = i-1;
                    }
                }
            }
            if(count > 0) {
                arr[index+1].replace(arr[index+1].charAt(0), '0');
                for(int i = index; i > 0; i--) {
                    if(arr[i].equals("-")) break;
                    if(arr[i].equals("+")) continue;
                    temp += arr[i].charAt(0) - '0';
                    arr[i].replace(arr[i].charAt(0), '0');
                }
                count-= 2;
                temp -= max;
            }
            System.out.println(count);
            if(count == 0) {
                System.out.println(temp);
                answer += temp;
                for(int i = 0; i < arr.length; i++) {
                    if(arr[i].equals("+")) continue;
                    answer += arr[i].charAt(0) - '0';
                }
                System.out.println( " dnddfasfasfasfd");
                break;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] arr = {"1", "-", "3", "+", "5", "-", "8"};
        System.out.println(solution(arr));
    }
}