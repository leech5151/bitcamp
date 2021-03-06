package java100.app.control.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.control.PageController;
import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

@Component("/board/update")
public class BoardUpdateServlet {
    
    @Autowired BoardDao boardDao;
    
    @RequestMapping
    public String update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(
                BoardDao.class);
        Board board = new Board();
        board.setNo(Integer.parseInt(request.getParameter("no")));
        board.setTitle(request.getParameter("title"));
        board.setContent(request.getParameter("content"));
        
        boardDao.update(board);
        return "redirect:list.do";
    }
}