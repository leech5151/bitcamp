package codefight;

public class No33_1 {
    static boolean stringsRearrangement(String[] inputArray) {
        String[] arr = new String[inputArray.length];
        String temp = "";
        int arrlen = 0;
        for(int i = 0; i < inputArray[0].length(); i++) {
            for(int j = 0; j < inputArray.length; j++) {
                if(
                        inputArray[arrlen].charAt(i) != inputArray[j].charAt(i) &&
                        inputArray[arrlen].substring(i+1, endIndex)
                        ) {
                    
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        
        String[] a = {  "abc", 
                "bef", 
                "bcc", 
                "bec", 
                "bbc", 
        "bdc"};


        System.out.println(stringsRearrangement(a));
    }
}
