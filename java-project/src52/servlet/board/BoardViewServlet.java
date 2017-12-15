package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

//urlPatterns 속성
@SuppressWarnings("serial")
@WebServlet("/board/view")
public class BoardViewServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>게시물관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>게시물 등록 결과</h1>");
        
        try {
            int no = Integer.parseInt(request.getParameter("no"));
            Board board = boardDao.selectOne(no);
            
            if (board != null) {
                out.println("<form action='update' method='post'>");
                out.println("<div>");
                out.println("<label for='no'>번호</label>");
                out.printf("<input readonly id='no' type='number' name='no' value='%d'>\n", 
                            board.getNo());
                out.println("</div>");
                out.println("<div>");
                out.println("<label for='title'>제목</label>");
                out.printf("<input id='title' type='text' name='title' value='%s'>\n", 
                            board.getTitle());
                out.println("</div>");
                out.println("<div>");
                out.println("<label for='content'>내용</label>");
                out.printf("<input id='content' type='text' name='content' value='%s'>\n", 
                            board.getContent());
                out.println("</div>");
                out.println("<div>");
                out.println("<label for='regDate'>날짜</label>");
                out.printf("<input id='regDate' type='text' name='regDate' value='%s'>\n", 
                            board.getRegDate());
                out.println("</div>");
                out.println("<div>");
                out.println("<label for='viewCount'>조회수</label>");
                out.printf("<input id='viewCount' type='number' name='viewCount' value='%d'>\n", 
                            board.getViewCount());
                out.println("</div>");
                out.println("<div>");
                out.println("<button>변경</button>");
                out.printf("<a href='delete?no=%d'>삭제</a>\n", board.getNo());
                out.println("</form>");
            } else {
                out.printf("'%d'번의 게시물 정보가 없습니다.\n", no);
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        out.println("</body>");
        out.println("</html>");
    } 
    
}







