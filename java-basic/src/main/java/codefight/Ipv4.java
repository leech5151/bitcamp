package codefight;

public class Ipv4 {
    static boolean isIPv4Address(String inputString) {
        String[] arr = inputString.split("\\.");
        for(int i = 0; i < arr.length; i++) {
            int temp = 0;
            int mux = 1;
            if(arr[i].isEmpty()) return false;
            System.out.println("arr[i] : " + arr[i]);
            for(int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j) - '0' < 0 || arr[i].charAt(j) - '0' > 9) return false;
                temp += (arr[i].charAt(arr[i].length()-1-j) - '0') * mux;
                System.out.println(temp);
                if(temp > 255) return false;
                mux *= 10;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 15;
        int b1 = 15;
        int b2 = 10;
        String a =".254.255.0";
        System.out.println(isIPv4Address(a));
        String[] arr = a.split("\\.");
        
       

    }
}
