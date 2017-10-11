package bitcamp.java100;

public class Test15_11 {

    public static void main(String[] args) {
        // 임무 : 파일의 정보를 저장하라!
        // - 디렉토리여부, 소유주/그룹/기타 사용자의 읽기, 쓰기, 실행 권한 정보
        class Privilege {
            boolean isDirectory;
            boolean ownerRead;
            boolean ownerWrite;
            boolean ownerExe;
            boolean groupRead;
            boolean groupWrite;
            boolean groupExe;
            boolean otherRead;
            boolean otherWrite;
            boolean otherExe;
        }
        Privilege p1 = new Privilege();

        p1.isDirectory =false;
        p1.ownerWrite = true;
        p1.ownerRead = true;
        p1.ownerExe = true;
        p1.groupRead = true;
        p1.groupWrite = false;
        p1.groupExe = true;
        p1.otherRead = true;
        p1.otherWrite = false;
        p1.otherExe = true;
   
        System.out.print(p1.isDirectory ? "d" : "-");
        System.out.print(p1.ownerRead ? "r" : "-");
        System.out.print(p1.ownerWrite ? "w" : "-");
        System.out.print(p1.ownerExe ? "x" : "-");
        System.out.print(p1.groupRead ? "r" : "-");
        System.out.print(p1.groupWrite ? "w" : "-");
        System.out.print(p1.groupExe ? "x" : "-");
        System.out.print(p1.otherRead ? "r" : "-");
        System.out.print(p1.otherWrite ? "w" : "-");
        System.out.print(p1.otherExe ? "x" : "-");
        System.out.println("커밋과 푸쉬를 한번에!");
    }
}


