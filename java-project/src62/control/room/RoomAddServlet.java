package java100.app.control.room;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.control.PageController;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.listener.ContextLoaderListener;

@Component("/room/add")
public class RoomAddServlet implements PageController  {
    
    @Autowired RoomDao roomdao;
    
    public String service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(
                RoomDao.class);
        Room room = new Room();
        room.setLocation(request.getParameter("location"));
        room.setName(request.getParameter("name"));
        room.setCapacity(Integer.parseInt(request.getParameter("capacity")));

        
        roomDao.insert(room);

        return "redirect:list.do";
    }
}