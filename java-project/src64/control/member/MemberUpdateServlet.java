package java100.app.control.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.annotation.RequestParam;
import java100.app.control.PageController;
import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.listener.ContextLoaderListener;

@Component("/member/update")
public class MemberUpdateServlet {
    
    @Autowired MemberDao memberDao;
    
    @RequestMapping
    public String update(
            Member member,
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        memberDao.update(member);
        return "redirect:list.do";
    }
}