package step8;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


@WebServlet("/step8/Servlet09")
@SuppressWarnings("serial")
public class Servlet09 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        DiskFileItemFactory itemFactory = new DiskFileItemFactory();
        ServletFileUpload multipartDataParser = new ServletFileUpload(itemFactory);
        try {
            List<FileItem> parts = multipartDataParser.parseRequest(req);

            HashMap<String,FileItem> partMap = new HashMap<>();
            for (FileItem part : parts) {
                partMap.put(part.getFieldName(), part);
            }

            FileItem part = partMap.get("name");
            FileItem part2 = partMap.get("age");
            
            String name = part.getString("UTF-8"); 
            String age = part2.getString("UTF-8");
            
//            String photo1 = partMap.get("photo1").getName();
//            String photo2 = partMap.get("photo2").getName();

            res.setContentType("text/plain;charset=UTF-8");
            PrintWriter out = res.getWriter();
            out.printf("name=%s\n", name);
            out.printf("age=%s\n", age);
//            out.printf("photo1=%s\n", photo1);
//            out.printf("photo2=%s\n", photo2);

        } catch (Exception e) {
            throw new ServletException(e);
        }

    }
}


