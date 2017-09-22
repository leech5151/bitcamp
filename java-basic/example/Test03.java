class Test03 { 
  public static void main(String[] args) { 
    System.out.println("안녕하세요!");
  } 
}
 /* 분리
    > javac -d [.class 파일을 저장할 폴더][소스파일명]
    예)
    > md bin
    > javac -d bin Test03.java

    이유
    - 소스파일과 클래스파일을 분리함으로써
      소스파일을 관리하기 쉽고,
      배포를 위해 클래스 파일을 추출하기 쉬움

    다른 폴더에 있는 클래스 실행
    > java -cp [.class 파일이 있는 폴더] 클래스명

    클래스 환경변수 지정
    > set CLASSPATH=주소
 */

