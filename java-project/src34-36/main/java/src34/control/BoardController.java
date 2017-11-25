package src34.control;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Iterator;

import src34.domain.Board;
import src34.util.Prompts;

public class BoardController extends GenericController<Board> {

    private String dataFilePath;

    public BoardController(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }

    @Override
    public void destroy() {

        try (PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(this.dataFilePath)))) {
            for (Board board : this.list) {
                out.println(board.toCSVString());
            }
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @Override
    public void init() {

        try (BufferedReader in = new BufferedReader(
                new FileReader(this.dataFilePath));) {

            String csv = null;
            while ((csv = in.readLine()) != null) {
                try {
                    list.add(new Board(csv));
                } catch (CSVFormatException e) {
                    System.err.println("CSV 데이터 형식 오류!");
                    e.printStackTrace();
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void execute(Request request, Response response) {
        // 명령어를 처리하는 각 코드를 별도의 메서드로 추출한다.
        switch (request.getMenuPath()) {
        case "/board/list": this.doList(request, response); break;
        case "/board/add": this.doAdd(request, response); break;
        case "/board/view": this.doView(request, response); break;
        case "/board/update": this.doUpdate(request, response); break;
        case "/board/delete": this.doDelete(request, response); break;
        default: 
            System.out.println("해당 명령이 없습니다.");
        }
    }

    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        System.out.println("[게시물 목록]");

        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board board = iterator.next();
            out.printf("%d, %s, %s, %d\n",  
                    board.getNo(), 
                    board.getTitle(),
                    board.getRegDate().toString(),
                    board.getViewCount());
        }
    }

    private void doAdd(Request request, Response response) {
        Board board = new Board(); 
        board.setNo(Integer.parseInt(request.getParameter("no")));
        board.setTitle(request.getParameter("title"));
        board.setContent(request.getParameter("content"));
        board.setRegDate(new Date(System.currentTimeMillis()));
        list.add(board);


        PrintWriter out = response.getWriter();
        out.println("저장되었습니다.");
    } 

    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();
        int no = Integer.parseInt(request.getParameter("no"));
        Board board = findByNo(no);
        out.println("[게시판 상세 정보]");
        
        if (board == null) {
            out.printf("%d번 게시물이 없습니다.\n", no);
            return;
        }

        out.printf("%s, %s, %s, %d\n", 
                board.getTitle(),
                board.getContent(),
                board.getRegDate().toString(),
                board.getViewCount());
        board.setViewCount(board.getViewCount() + 1);
    } 

    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        int no = Integer.parseInt(request.getParameter("no"));

        Board board = findByNo(no);
        out.println("[게시물 변경]");
        
        if (board == null) {
            System.out.printf("%d번 게시물이 없습니다.\n", no);
            return;
        } 

        String title = Prompts.inputString("제목?(%s) ", board.getTitle());
        if (title.isEmpty()) {
            title = board.getTitle();
        }

        String content = Prompts.inputString("내용? ");

        if (Prompts.confirm2("변경하시겠습니까?(y/N) ")) {
            board.setTitle(request.getParameter("title"));
            board.setContent(request.getParameter("content"));
            board.setRegDate(new Date(System.currentTimeMillis()));
            System.out.println("변경하였습니다.");

        } else {
            System.out.println("변경을 취소하였습니다.");
        }
    }

    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        int no = Integer.parseInt(request.getParameter("no"));
        System.out.println("[성적 삭제]");
        Board board = findByNo(no);

        if (board == null) {
            System.out.printf("%d번 게시물이 없습니다.\n", no);
            return;
        } 

        if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
            list.remove(board);
            System.out.println("삭제하였습니다.");
        } else {
            System.out.println("삭제를 취소하였습니다.");
        }
    }

    private Board findByNo(int no) {
        Iterator<Board> iterator = list.iterator();
        while (iterator.hasNext()) {
            Board board = iterator.next();
            if (board.getNo() == no) {
                return board;
            }
        }
        return null;
    }
}








