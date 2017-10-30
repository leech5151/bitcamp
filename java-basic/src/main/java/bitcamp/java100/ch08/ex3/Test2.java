// 다형성  - 오버라이딩 사용 후
package bitcamp.java100.ch08.ex3;

public class Test2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        while (true) {
            Score2 s = new Score2();
            
            s.setNo(Prompts.intputInt("번호 : "));
            s.setName(Prompts.inputString("이름 : "));
            s.setKor(Prompts.intputInt("국어 : "));
            s.setEng(Prompts.intputInt("영어 : "));
            s.setMath(Prompts.intputInt("수학 : "));
            
            list.add(s);
            
            
            System.out.println(s.toString());
            
            if (!Prompts.confirm("계속 하시겠습니까 ?"))
                break;
        }
    }
}
