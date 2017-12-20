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

@Component("/board/form")
public class BoardFormServlet {
    
    @Autowired BoardDao boardDao;
    
    @RequestMapping
    public String form(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return "/board/form.jsp";
    }
}