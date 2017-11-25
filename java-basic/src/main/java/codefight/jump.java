package codefight;

public class jump {
    static int avoidObstacles(int[] inputArray) {
        boolean s = false;
        int max = 0;
        int result = 2;

        for(int i = 0; i < inputArray.length; i++) {
            if(max < inputArray[i]) max = inputArray[i];
        }
        System.out.println(max);
        for(result = 2; result <= max+1; result++) {
            s = true;
            for(int i = 0; i < inputArray.length; i++) {
                if(inputArray[i] % result == 0 ) {
                    s = false;
                }
                
//                System.out.printf(
//                        "result : %d, inputArray[%d] = %d, s = %b\n",
//                        result,i,inputArray[i],s);
            }
            if(s == true) return result;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {2,3};
        System.out.println(avoidObstacles(a));
    }
}
