//문자열 표현
package bitcamp.java100;
public class Test14_2 {
        public static void main(String[] args) {
            
            class Book{
                String bookname;
                String act;
                String from;
                int page;
                double doller;
            }

            Book b1;
            b1 = new Book();

            b1.bookname = "어린왕자";
            b1.act = "brad";
            b1.from = "england";
            b1.page = 314;
            b1.doller = 3.74;

            System.out.printf("%s %s %s %d %.2f",b1.bookname,b1.act,b1.from,b1.page,b1.doller);
    }
}