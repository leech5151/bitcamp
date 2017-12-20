package java100.app.control.room;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.control.PageController;
import java100.app.dao.RoomDao;
import java100.app.listener.ContextLoaderListener;

@Component("/room/delete")
public class RoomDeleteServlet implements PageController {
    
    @Autowired RoomDao roomdao;
    
    public String service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(
                RoomDao.class);
        int no = Integer.parseInt(request.getParameter("no"));
        roomDao.delete(no);
        return "redirect:list.do";
    }
}