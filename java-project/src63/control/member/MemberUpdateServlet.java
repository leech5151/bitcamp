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
import java100.app.domain.Member;
import java100.app.listener.ContextLoaderListener;

@Component("/member/update")
public class MemberUpdateServlet {
    
    @Autowired MemberDao memberDao;
    
    @RequestMapping
    public String update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(
                MemberDao.class);
        Member member = new Member();
        member.setNo(Integer.parseInt(request.getParameter("no")));
        member.setName(request.getParameter("name"));
        member.setEmail(request.getParameter("email"));
        member.setPassword(request.getParameter("password"));
        memberDao.update(member);
        return "redirect:list.do";
    }
}