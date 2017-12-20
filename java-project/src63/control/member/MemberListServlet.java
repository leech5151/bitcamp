package java100.app.control.member;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.control.PageController;
import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.listener.ContextLoaderListener;

@Component("/member/list")
public class MemberListServlet {
    
    @Autowired MemberDao memberDao;
    
    @RequestMapping
    public String list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(
                MemberDao.class);
        List<Member> list = memberDao.selectList();
        
        request.setAttribute("list", list);
        
        return "/member/list.jsp";
    }
}