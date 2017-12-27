package java100.app.control.score;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.dao.ScoreDao;
import java100.app.listener.ContextLoaderListener;

@Component("/score/delete")
public class ScoreDeleteController {
    
    @Autowired ScoreDao scoreDao;
    
    @RequestMapping
    public String delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(
                ScoreDao.class);
        
        int no = Integer.parseInt(request.getParameter("no"));
        scoreDao.delete(no);
        
        return "redirect:list.do";
    }
}