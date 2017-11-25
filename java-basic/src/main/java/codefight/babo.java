package codefight;

public class babo {
    int absoluteValuesSumMinimization(int[] a) {
        int result = 0;
        if(a.length % 2 == 1) {
            result = a[(a.length-1)/2];
        }
        else {
            if((a.length-1)/2 > (a.length-1)/2+1) 
                result = a[(a.length-1)/2+1];
            result = a[(a.length-1)/2];
        }
        return result;
    }





    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println((float)2/10);

    }
}

