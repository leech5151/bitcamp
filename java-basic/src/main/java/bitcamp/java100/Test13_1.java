//문자열 표현
package bitcamp.java100;
public class Test13_1 {
    
        public static void main(String[] args) {
            int kor,eng,math,sor,sci,eth,chi;
    
            kor =100;
            eng =100;
            math=100;
            sor =100;
            sci=100;
            eth=100;
            chi=100;

            System.out.println(kor);
            System.out.println(eng);
            System.out.println(math);
            System.out.println(sor);
            System.out.println(sci);
            System.out.println(eth);
            System.out.println(chi);
            
            int[] score = new int[7];
            score[0] = 100;
            score[1] = 100;
            score[2] = 100;
            score[3] = 100;
            score[4] = 100;
            score[5] = 100;
            score[6] = 100;
            
            int i =0;
            while(i<7)
            {
                
                System.out.printf("%d\n",score[i]);
                i=i+1;
            }
        }
    }