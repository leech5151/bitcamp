
package bitcamp.java100;
public class Test15_5 {
        public static void main(String[] args) {
           
                int a = 10;
                int b = 10;

                a= a + 1 ;

                b= b - 1 ; 

                System.out.printf("a=%d, b=%d\n",a,b);

                a= 10;
                a= ++a;
                System.out.println(a);

                b= 10;
                b= b++;
                System.out.println(b);

                a= 5;
                int r1 = ++a + ++a * ++a;
                System.out.printf("a=%d, r1=%d\n",a,r1);

                a= 5;
                r1 = a++ + a++ * a++;
                System.out.printf("a=%d, r1=%d\n",a,r1);
        }
}