/*
게시판> add
번호? 1
제목? aaa
내용? aaaa
입력하였습니다.

게시판> add
번호? 1
이미 등록된 번호입니다.

게시판> list
1, aaa, 2017-11-3, 0
2, bbb, 2017-11-3, 2

게시판> view
번호? 1
제목: aaa
내용: aaaa
등록일: 2017-11-3
조회수: 1   <== view 할 때 마다 해당 게시물의 조회수는 증가한다.

게시판> view
번호? 9
9번 게시물이 없습니다.

게시판> delete
번호? 1
정말 삭제하시겠습니까?(y/N) y <== 'Y', 'y'를 입력해야 삭제된다.
삭제하였습니다.

게시판> delete
번호? 1
정말 삭제하시겠습니까?(y/N) n
삭제취소하였습니다.

게시판> delete
번호? 9
9번 게시물이 없습니다.

게시판> update
번호? 1
제목?(aaa) xxxx    <== 엔터를 치면 원래 값 유지
내용? 2222  <== 입력하지 않고 그냥 엔터를 치면 빈 문자열이 내용이 된다.
변경하시겠습니까?(y/N) y<== 'Y', 'y'를 입력해야 변경된다.
변경하였습니다.   <== 변경할 때 등록일을 현재 날짜 및 시작으로 바꿔라

게시판> update
번호? 1
제목?(aaa) xxxx    <== 엔터를 치면 원래 값 유지
내용? 2222  <== 입력하지 않고 그냥 엔터를 치면 빈 문자열이 내용이 된다.
변경하시겠습니까?(y/N) n<== 'Y', 'y'를 입력해야 변경된다.
변경취소하였습니다.

게시판> update
번호? 9
9번 게시물이 없습니다.

게시판> remove
수행할 수 없는 명령입니다.

게시판> main

명령>
 */
package java100.app.Me4;

import java.util.Scanner;
 
// 
// 1) 회원 정보를 담을 메모리를 설계한다.
//    회원 정보를 담을 새로운 데이터 타입을 정의한다.
//    => Member 클래스 정의
//
// 2) 회원관리 메뉴를 처리할 컨트롤러 클래스를 만든다.
//    => MemberController 클래스 정의
//    => execute() 메서드를 만든다.
//    => 일단 list 명령만 처리한다.
// 
// 3) Member 클래스 list 명령을 처리할 때 호출될 print() 추가한다.
// 4) App 클래스에 회원관리 메뉴에 대한 코드를 추가한다.
// 5) 회원관리의 add 기능 추가한다.
// 6) 회원관리의 view 기능 추가한다.
// 7) 회원관리의 update 기능 추가한다.
// 8) 회원관리의 delete 기능 추가한다.
// 
// 복사/붙여넣기를 한 후 변경을 완료하면, 
// 나머지 세세한 요구사항을 처리한다.
// 
// 9) 추가할 때 이메일 중복여부를 검사한다.
// 
public class App {
    
    static Scanner keyScan = new Scanner(System.in);
    static ScoreController scoreController = new ScoreController();
    static MemberController memberController = new MemberController();
    static NoticeManager noticemanager = new NoticeManager(); 
    
    public static void main(String[] args) {
        
        loop:
        while (true) {
            System.out.print("명령> ");
            String[] input = keyScan.nextLine().toLowerCase().split(" ");
            
            try {
                switch (input[0]) {
                case "menu": doMenu(); break;
                case "help": doHelp(); break;
                case "quit": doQuit(); break loop;
                case "go": doGo(input[1]); break;
                default:
                    doError();
                }
            } catch (Exception e) {
                System.out.println("명령 처리 중 오류 발생!");
            }
            System.out.println();
        } // while
        
    }
    
    private static void doGo(String menuNo) {
        
        switch (menuNo) {
        case "1": scoreController.execute(); break;
        case "2": memberController.execute(); break;
        case "3": noticemanager.execute(); break;
        default:
            System.out.println("해당 번호의 메뉴가 없습니다.");
        }
        
    }

    private static void doHelp() {
        System.out.println("[명령]");
        System.out.println("menu        - 메뉴 목록 출력한다.");
        System.out.println("go 번호     - 메뉴로 이동한다.");
        System.out.println("quit        - 프로그램을 종료한다.");
    }

    private static void doMenu() {
        System.out.println("1 성적관리");
        System.out.println("2 회원관리");
        System.out.println("3 게시판");
    }

    private static void doError() {
        System.out.println("실행할 수 없는 명령입니다.");
    }

    private static void doQuit() {
        System.out.println("프로그램을 종료합니다.");
    }




        
}




