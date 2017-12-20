package java100.app.control.room;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;

@Component("/room/add")
public class RoomAddServlet {
    
    @Autowired RoomDao roomDao;
    
    @RequestMapping
    public String add(
            Room room,
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        
        roomDao.insert(room);
        return "redirect:list.do";
    }
}