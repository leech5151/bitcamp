package java100.app.control.room;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.annotation.RequestParam;
import java100.app.control.PageController;
import java100.app.dao.RoomDao;
import java100.app.listener.ContextLoaderListener;

@Component("/room/delete")
public class RoomDeleteServlet {
    
    @Autowired RoomDao roomdao;
    
    @RequestMapping
    public String delete(
            @RequestParam("no") int no,
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(
                RoomDao.class);
        roomDao.delete(no);
        return "redirect:list.do";
    }
}