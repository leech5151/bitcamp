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
import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.listener.ContextLoaderListener;

@Controller
public class RoomController {
    
    @Autowired RoomDao roomDao;
    
    @RequestMapping("/room/list")
    public String list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(
                RoomDao.class);
        List<Room> list = roomDao.selectList();
        
        request.setAttribute("list", list);
        
        return "/room/list.jsp";
    }
    @RequestMapping("/room/add")
    public String add(
            Room room,
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        
        roomDao.insert(room);
        return "redirect:list.do";
    }
    @RequestMapping("/room/delete")
    public String delete(
            @RequestParam("no") int no,
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(
                RoomDao.class);
        roomDao.delete(no);
        return "redirect:list.do";
    }
    @RequestMapping("/room/form")
    public String form(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        return "/room/form.jsp";
    }
}