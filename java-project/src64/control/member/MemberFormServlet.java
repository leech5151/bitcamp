package java100.app.control.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.control.PageController;
import java100.app.dao.MemberDao;

@Component("/member/form")
public class MemberFormServlet {
    
    @Autowired MemberDao memberDao;
    
    @RequestMapping
    public String form(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        return "/member/form.jsp";
    }
}