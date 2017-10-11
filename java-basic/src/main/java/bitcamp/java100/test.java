//문자열 표현
package bitcamp.java100;
public class test {
        public static void main(String[] args) {
            class house{
                int nuber;
                String name;
                double range;    
            }

            house[] H1 = new house[5]; 
            for(int i = 0; i < H1.length; i++){
                H1[i] = new house(); 
            }
        }
}