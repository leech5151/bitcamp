package bitcamp.java100;


public class Test16_5 {

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(++i);
        }while (i < 5);
        
        System.out.println("-----------------------------------");

        i = 0 ;
        while(i < 5) {
            System.out.print("=>");
            System.out.println(i);
            i++;
        }

        System.out.println("-----------------------------------");

        i = 1;
        while (i <= 5) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        }

        System.out.println("-----------------------------------");

        i = 1;
        while (i <= 5) {
            int count = 1;
            int count2 = 1;
            while (count2 <= 5 - i) {
                System.out.print(" ");
                count2++;
            }
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        } 

        System.out.println("-----------------------------------");

        i = 1;
        while (i <= 5 ) {
            int count = 0;
            int count2 = 1;

            while (count2 <= i ) {
                System.out.print(" ");
                count2++;
            }

            while (count <= 5 - i) {
                System.out.print("*");
                System.out.print(" ");
                count++;

            }
            System.out.println();
            i++;
        }

        System.out.println("-----------------------------------");

        i = 0;
        while (i < 5) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("-----------------------------------");

        i = 0;
        while (i < 5) {
            i++;
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("-----------------------------------");

        i = 1;
        label1: {
            while (i <= 10) {
                int count = 1;
                while (count <= i) {
                    System.out.print("*");
                    if (count == 5) {
                        //break;
                        break label1;
                    }
                    count++;
                }
                System.out.println();
                i++;
            }
        }
        System.out.println();
        System.out.println("-----------------------------------");


        int j = 1;
        while(j < 10) {
            System.out.printf("[[[ %d 단 ]]]\n",j);
            i = 1;
            while(i < 10) {
                int mux = j * i;
                System.out.printf("%d x %d = %d\n",j,i,mux);
                i++;
            }

            j++;
        }
        System.out.println("-----------------------------------");

        i = 987654321;
        while (i > 0) {
            System.out.printf("%d ",i % 10);
            
            i /= 10 ;

        }
        System.out.println();
        System.out.println("-----------------------------------");

        i = 4885323;
        int [] cnt = new int[10];
        
        while (i > 0) {
            cnt[i % 10]++ ;
            i /= 10 ;
        }
        
        int x = 0;
        while(x < cnt.length) {
            System.out.printf("%d = %d\n",x,cnt[x]);
            x++;
        }
    }
}
