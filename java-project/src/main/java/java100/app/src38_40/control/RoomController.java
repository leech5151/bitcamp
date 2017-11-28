package java100.app.src38_40.control;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;

// RoomController는 ArrayList를 상속 받은 서브 클래스이기도 하지만,
// Controller라는 규칙을 따르는 클래스이기도 하다!
public class RoomController extends ArrayList<Room> implements Controller {
    private static final long serialVersionUID = 1L;
    
    RoomDao roomDao = new RoomDao();
    
    @Override
    public void destroy() {}
    
    @Override
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(
                    "JDBC 드라이버 클래스를 찾을 수 없습니다.");
        }
    }
    
    
    @Override
    public void execute(Request request, Response response) {
        switch (request.getMenuPath()) {
        case "/room/list": this.doList(request, response); break;
        case "/room/add": this.doAdd(request, response); break;
        case "/room/delete": this.doDelete(request, response); break;
        default: 
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }
    
    private void doList(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 목록]");
        
        
        try {
            List<Room> list = roomDao.selectList();
            for(Room room : list) {
                out.printf("%4d, %-4s, %-4s, %4d\n",
                        room.getNo(),
                        room.getName(),
                        room.getLocation(),
                        room.getCapacity());
            }

        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }

    }
    
    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[강의실 등록]");
        
        try {
            Room room  = new Room();
            room.setName(request.getParameter("name"));
            room.setName(request.getParameter("loc"));
            room.setName(request.getParameter("capacity"));
            roomDao.insert(room);

        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    } 
    
    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        out.println("[강의실 삭제]");
        
        try {
            int no = Integer.parseInt(request.getParameter("no"));
            
            if (roomDao.delete(no) > 0) {
                out.println("삭제했습니다.");
            } else {
                out.printf("'%d'의 성적 정보가 없습니다.\n", no);
            }

        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
    }
    
}










