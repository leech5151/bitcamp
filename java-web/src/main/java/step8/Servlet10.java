package step8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@SuppressWarnings("serial")
@WebServlet("/step8/Servlet10")
public class Servlet10 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = null;
        String age = null;
        String photo1 = null;
        String photo2 = null;
        
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        
        Map<String, FileItem> itemMap = new HashMap<>();
        try {
        
            List<FileItem> items = upload.parseRequest(req);
            for (FileItem item : items) {
                itemMap.put(item.getFieldName(), item);
            }
        } catch (Exception e) {
            throw new ServletException(e);
        }
        
        
//        ServletContext context = this.getServletContext();
//        String path = context.getRealPath("C:\\workspace\\java-web\\src\\main\\webapp\\x\\y\\z");
        

        name = itemMap.get("name").getString("UTF-8");
        age = itemMap.get("age").getString();
        photo1 = itemMap.get("photo1").getName();
        photo2 = itemMap.get("photo2").getName();

        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.printf("name=%s\n", name);
        out.printf("age=%s\n", age);
        out.printf("photo1=%s\n", photo1);
        out.printf("photo2=%s\n", photo2);

    }
}


