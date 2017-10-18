package bitcamp.java100;


public class Test16_6 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("------------------------------------");

        for (int i = 0,j = 0; i < 5; i++,j += 2) {
            System.out.println(i);
        }

        System.out.println("--------------------------------------");

        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i;
        System.out.println(sum);

        System.out.println("--------------------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.print("=>");
            System.out.println(i);
        }

        System.out.println("--------------------------------------");

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                break;
            System.out.print(i);
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue;
            System.out.print(i);
        }
        System.out.println();
        System.out.println("--------------------------------------");

        int i = 0;
        for(; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println(i);

        System.out.println("--------------------------------------");

        i = 0 ;
        for (; i < 5;) {
            System.out.println(i);
            i++;
        }

        System.out.println("--------------------------------------");

        i = 0 ;
        for (;;) {
            System.out.println(i);
            i++;
            if(i == 5) {
                break;
            }
        }

        System.out.println("--------------------------------------");

        String[] names = {"홍길동","임꺽정","유관순","안중근","윤봉길"};
        for (i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("--------------------------------------");

        for (int a =1; a < 5; a++) {
            for(int b =0; b < a; b++) {
                System.out.print('*');
            }
            System.out.println(); 
        }
        
        

        System.out.println("--------------------------------------");
        label1:
            for (int a =1; a < 5; a++) {
                for(int b =0; b < a; b++) {
                    System.out.print('*');
                    if( b == 2) {break label1;}
                }
                System.out.println();
            }
        System.out.println();
        
        System.out.println("--------------------------------------");
        
        for (i = 1; i < 10; i++) {
            System.out.printf("[[%d 단]]\n",i);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
        }
        
        System.out.println("--------------------------------------");
        
        int v = 98761234;
        for(i = 1; v > 0; i++) {
            System.out.printf("%d ",v % 10);
            v /= 10 ;
        }
        
        System.out.println("--------------------------------------");
        
        
    }
}