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
import java100.app.listener.ContextLoaderListener;

@Component("/member/delete")
public class MemberDeleteServlet {
    
    @Autowired MemberDao memberDao;
    
    @RequestMapping
    public String delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(
                MemberDao.class);
        int no = Integer.parseInt(request.getParameter("no"));
        memberDao.delete(no);
        return "redirect:list.do";
    }
}