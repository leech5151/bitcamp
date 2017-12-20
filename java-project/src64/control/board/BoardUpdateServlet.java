package java100.app.control.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.annotation.RequestParam;
import java100.app.control.PageController;
import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

@Component("/board/update")
public class BoardUpdateServlet {
    
    @Autowired BoardDao boardDao;
    
    @RequestMapping
    public String update(
            Board board,
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        boardDao.update(board);
        return "redirect:list.do";
    }
}