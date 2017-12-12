package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

//urlPatterns 속성
//- 클라이언트가 "/board/"로 시작하는 URL을 요청할 때 이 서블릿을 실행하라고 표시한다.
//- /board/로 시작하는 요청이 들어오면 서블릿 컨테이너는 이 서블릿 객체를 실행한다.
//
@SuppressWarnings("serial")
@WebServlet("/board/delete")
public class BoarDeleteServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("[게시물 삭제]");
        
        try {
            
            int no = Integer.parseInt(request.getParameter("no"));
            
            if (boardDao.delete(no) > 0) {
                out.println("삭제했습니다.");
            } else {
                out.printf("'%d'번의 게시물 정보가 없습니다.\n", no); 
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }
}








