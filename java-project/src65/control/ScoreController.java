package java100.app.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java100.app.annotation.RequestMapping;
import java100.app.annotation.RequestParam;
import java100.app.dao.ScoreDao;
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

@Controller
public class ScoreController {
   
    @Autowired ScoreDao scoreDao;
    
    @RequestMapping("/score/list")
    public String list(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        List<Score> list = scoreDao.selectList();
        request.setAttribute("list", list);
        return "/score/list.jsp" ;
    }
    @RequestMapping("/score/add")
    public String add(
            Score score,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        scoreDao.insert(score);
        return "redirect:list.do";
    }
    @RequestMapping("/score/delete")
    public String delete(
            @RequestParam("no") int no,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(
                ScoreDao.class);
        scoreDao.delete(no);
        return "redirect:list.do";
    }
    @RequestMapping("/score/form")
    public String form(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        return "/score/form.jsp";
    }
    @RequestMapping("score/update")
    public String update(
            Score score,
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        scoreDao.update(score);
        return "redirect:list.do";
    }
    @RequestMapping("/score/view")
    public String view(
            @RequestParam("no") int no,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        Score score = scoreDao.selectOne(no);
        request.setAttribute("score", score);
        
        return "/score/view.jsp";
    }
}