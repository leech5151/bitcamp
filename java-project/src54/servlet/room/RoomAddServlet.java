package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/room/add")
public class RoomAddServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>강의실관리</title>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<style>");
        out.println(".container {");
        out.println("    width: 680px;");
        out.println("}");
        out.println("footer {");
        out.println("   text-align: center;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        
        out.println("<header>");
        out.println("<nav class='navbar navbar-expand-lg navbar-light bg-light'>");
        out.println("<a class='navbar-brand' href='../index.html'>");
        out.println("  <img src='../images/bootstrap-solid.svg' width='30' height='30' class='d-inline-block align-top' alt=''>");
        out.println("  비트캠프");
        out.println("</a>");
        out.println("<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarNav' aria-controls='navbarNav' aria-expanded='false' aria-label='Toggle navigation'>");
        out.println("<span class='navbar-toggler-icon'></span>");
        out.println("</button>");
        out.println("<div class='collapse navbar-collapse' id='navbarNav'>");
        out.println("<ul class='navbar-nav'>");
        out.println("<li class='nav-item'>");
        out.println("<a class='nav-link' href='../score/list'>성적관리</a>");
        out.println("</li>");
        out.println("<li class='nav-item'>");
        out.println("<a class='nav-link' href='../member/list'>회원</a>");
        out.println("</li>");
        out.println("<li class='nav-item'>");
        out.println("<a class='nav-link' href='../board/list'>게시판</a>");
        out.println("</li>");
        out.println("<li class='nav-item'>");
        out.println("<a class='nav-link' href='../room/list'>강의실</a>");
        out.println("</li>");
        out.println("</ul>");
        out.println("</div>");
        out.println("</nav>");
        out.println("</header>");
        out.println("<h1>새 강의실</h1>");

        out.println("<form method='post'>");
        out.println("<div class='form-group row'>");
        out.println("<label for='location' class='col-sm-2 col-form-label'>지역</label>");
        out.println("<div class='col-sm-10'>");
        out.println("<input class='form-control' id='location' type='text' name='location'>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='form-group row'>");
        out.println("<label for='name' class='col-sm-2 col-form-label'>강의실명</label>");
        out.println("<div class='col-sm-10'>");
        out.println("<input class='form-control' id='name' type='text' name='name'>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='form-group row'>");
        out.println("<label for='capacity' class='col-sm-2 col-form-label'>수용인원</label>");
        out.println("<div class='col-sm-10'>");
        out.println("<input class='form-control' id='capacity' type='number' name='capacity'>");
        out.println("</div>");
        out.println("</div>");
        out.println("<div class='form-group row'>");
        out.println("<div class='col-sm-10'>");
        out.println("<button class='btn btn-primary btn-sm'>등록</button>");
        out.println("</div>");
        out.println("</div>");
        out.println("</form>");
        
        out.println("<footer>");
        out.println("    비트캠프 자바100기@2017");
        out.println("</footer>");
        
        out.println("</div>");
        
        out.println("<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>");
        out.println("<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>");
        out.println("<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>");
        
        out.println("</body>");
        out.println("</html>");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(
                RoomDao.class);

        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>강의실관리</title>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<style>");
        out.println(".container {");
        out.println("    width: 680px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>강의실 등록 결과</h1>");

        try {
            Room room = new Room();
            room.setLocation(request.getParameter("location"));
            room.setName(request.getParameter("name"));
            room.setCapacity(Integer.parseInt(request.getParameter("capacity")));
            
            roomDao.insert(room);
            
            out.println("<p>저장하였습니다.</p>");
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        out.println("<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>");
        out.println("<footer>");
        out.println("    비트캠프 자바100기@2017");
        out.println("</footer>");
        
        out.println("</div>");
        
        out.println("<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>");
        out.println("<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>");
        out.println("<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>");
        
        out.println("</body>");
        out.println("</html>");
    } 
}










