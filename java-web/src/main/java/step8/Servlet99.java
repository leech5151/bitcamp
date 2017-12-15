package step8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@SuppressWarnings("serial")
@WebServlet("/step8/Servlet99")
public class Servlet99 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        String path = context.getRealPath("C:\\workspace\\java-web\\src\\main\\webapp\\x\\y\\z");

        MultipartRequest mul = new MultipartRequest
                (req, path, 1024 * 1024 * 10, new DefaultFileRenamePolicy());

        String name = mul.getParameter("name"); 
        String age = mul.getParameter("age");
        String photo1 = mul.getFilesystemName("photo1");
        String photo2 = mul.getFilesystemName("photo2");

        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.printf("name=%s\n", name);
        out.printf("age=%s\n", age);
        out.printf("photo1=%s\n", photo1);
        out.printf("photo2=%s\n", photo2);


    }
}


