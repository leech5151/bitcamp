
package bitcamp.java100;
public class Test15_7 {
        public static void main(String[] args) {
                int a,b,c;
                a=10;
                b=20;
                c=30;

                if (a >= b) System.out.println(a);
                else System.out.println(b); 


                int[] arr = {10,20,30};
                for (int i= 0; i< 3; i++)
                {
                        if(15<arr[i] && 25>arr[i])
                        {
                                System.out.println(arr[i]);
                        }
                }

                boolean b1 =false;
                boolean result = false && (b1=true);
                System.out.printf("b1=%b,result=%b\n",b1,result);     

                b1 =false;
                result = false & (b1=true);
                System.out.printf("b1=%b,result=%b\n",b1,result);
        }
}