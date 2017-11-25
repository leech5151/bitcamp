package codefight;

public class No33 {
    static boolean stringsRearrangement(String[] inputArray) {
        boolean[] pass = new boolean[inputArray.length];
        String an = "";
        int index = 0;
        int loc = 0;
        for(int i = 0; i+1 < inputArray.length; i++) {
            if(pass[i] == true) continue;
            if(inputArray[index].charAt(loc) != inputArray[i].charAt(loc) && i != index) {
                if(
                        inputArray[index].substring(loc+1, inputArray[index].length())
                        == inputArray[i].substring(loc+1, inputArray[index].length()) 
                        && i != index){
                    if(pass[index] == false) an += inputArray[i].charAt(loc);
                    pass[index] = true;
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
