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

@Component("/board/add")
public class BoardAddServlet {
    
    @Autowired BoardDao boardDao;
    
    @RequestMapping
    public String add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(
                BoardDao.class);
        Board board = new Board();
        board.setTitle(request.getParameter("title"));
        board.setContent(request.getParameter("content"));
        
        boardDao.insert(board);
        return "redirect:list.do";
    }
}