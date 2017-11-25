package codefight;

public class ArrayChang {
    static boolean palindromeRearranging(String inputString) {
        char[] inputStrings = inputString.toCharArray();
        String result = "";
        int no = 0;
        int count = 0;
        
        for(int i = 0; i < inputString.length(); i++) {
            if(inputStrings[i] == '0')  continue;
            if(inputString.substring(i+1,inputString.length()).indexOf(inputString.charAt(i)) != -1) {
                inputStrings[inputString.substring(i+1,inputString.length()).indexOf(inputString.charAt(i)) + i+1] = '0';
                result += inputStrings[i];
                no++;
                continue;
            }
            if(inputString.length() % 2 == 0 && no < inputString.length()/2) return false; 
            if(inputString.length() % 2 != 0 && no < inputString.length()/2) {
                count++;
                if(count == 2) return false;
            }
        }
        System.out.println("결과 : "+result);
        for(int i = 0; i<inputStrings.length; i++) {
            System.out.println(inputStrings[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        String a = "aabb";
        System.out.println(palindromeRearranging(a));
    }
}
