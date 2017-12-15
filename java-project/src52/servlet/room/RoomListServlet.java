package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/Room/list")
public class RoomListServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>강의실 관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>강의실 목록</h1>");

        out.println("<p><a href='add'>추가</a></p>");
        
        out.println("<table>");
        out.println("<thead>");
        out.println("<tr>");
        out.println("<th>번호</th><th>위치</th><th>이름</th><th>인원</th>");
        out.println("</tr>");
        out.println("</thead>");
        out.println("<tbody>");
        
        try {
            List<Room> list = roomDao.selectList();
            
            for (Room room : list) {
                out.printf("<tr><td>%d</td><td>%s</td><td>%s</td><td>%d</td></tr>\n",
                        room.getNo(),
                        room.getLocation(), 
                        room.getName(),
                        room.getCapacity());
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for 
        }
        out.println("</tbody>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}