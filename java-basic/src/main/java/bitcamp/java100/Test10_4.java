
package bitcamp.java100;

public class Test10_4 {

    public static void main(String[] args) {
        System.out.printf("%4$2s,%3$2s,%2$2s,%1$2s\n", "a", "b", "c", "d");
 
        System.out.printf("%s,%d,%o,%x,%h,%f,%b,\n","홍길동",100,100,100,100,3.14,true);   

        System.out.printf("%f,%.1f,%.2f,%.3f,%4f,%.5f\n",3.141592,3.141592,3.141592,3.141592,3.141592,3.14159);

        System.out.printf("%1$f,%1$.1f,%1$.2f,%1$.3f,%1$4f,%1$.5f\n",3.141592);

        System.out.printf("%1$4s,%1$10s,%2$5.2f,%2$10.3f\n","홍길동",3.14);

        System.out.printf("'%10s','%-10s'\n","홍길동","임꺽정");

        System.out.printf("%d,%+d\n",100,100);

        System.out.printf("%5d,%05d\n",100,100);

        System.out.printf("%1$tH,%1$tI,%1$tM,%1$tS,%1$tp\n",new java.util.Date());

        System.out.printf("%1$tH:%1$tM:%1$tS:%1$tp\n",new java.util.Date());

        System.out.printf("%1$tA,%1$ta\n",new java.util.Date());
    }
}