package codefight;

public class No33 {
    static boolean stringsRearrangement(String[] inputArray) {
        String[] arr = new String[inputArray.length];
        int index = 0;
        int count = 0;
        int answer = 0;
        
        for(int i = 0; i < inputArray.length; i++) {
            for(int j = 0; j < inputArray.length; j++) {
                if(i == j) continue;
                for(int x = 0; x < inputArray[0].length(); x++) {
                    if(inputArray[i].charAt(x) != inputArray[j].charAt(x)) {
                        count++;
                    }
                }
                if(count == 1) answer++;
                count = 0;
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
