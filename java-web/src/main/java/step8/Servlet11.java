package step8;

import java.io.File;
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

@SuppressWarnings("serial")
@WebServlet("/step8/Servlet11")
public class Servlet11 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = null;
        String age = null;
        String photoOriginalFileName1 = null;
        String photoNewFileName1 = null;
        String photoOriginalFileName2 = null;
        String photoNewFileName2 = null;
        
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        
        Map<String, FileItem> itemMap = new HashMap<>();
        try {
        
            List<FileItem> items = upload.parseRequest(req);
            for (FileItem item : items) {
                itemMap.put(item.getFieldName(), item);
            }
            name = itemMap.get("name").getString("UTF-8");
            age = itemMap.get("age").getString();
            photoOriginalFileName1 = itemMap.get("photo1").getName();
            photoOriginalFileName2 = itemMap.get("photo2").getName();
            
            ServletContext context = this.getServletContext();
            String path = context.getRealPath("/step8");
            
            FileItem fileItem = itemMap.get("photo1");
            photoNewFileName1 = getNewFilename(fileItem.getName());
            File file = new File(path + "/" + photoNewFileName1);
            fileItem.write(file);
            
            fileItem = itemMap.get("photo2");
            photoNewFileName2 = getNewFilename(fileItem.getName());
            file= new File(path + "/" + photoNewFileName2);
            fileItem.write(file);
        
        } catch (Exception e) {
            throw new ServletException(e);
        }
        
        
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        out.printf("<html>");
        out.printf("<head>");
        out.printf("<title>파일 업로드 결과</title>");
        out.printf("</head>");
       
        out.printf("<body>");
        out.printf("<h2>파일업로드 결과</h2>");
       
        out.printf("이름=%s<br>\n", name);
        out.printf("나이=%s<br>\n", age);
        
        out.printf("사진1=%s<br>\n", photoOriginalFileName1);
        out.printf("<img src='%s'width='200'><br>\n", photoNewFileName1);
        
        out.printf("사진2=%s<br>\n", photoOriginalFileName2);
        out.printf("<img src='%s'width='200'><br>\n", photoNewFileName2);
       
        out.printf("</body>");
        out.printf("</html>");
        
    }
   
    long prevMillis = 0;
    int count = 0;
    synchronized private String getNewFilename(String filename) {
        long currMillis = System.currentTimeMillis();
        if(prevMillis != currMillis) {
            count = 0;
            prevMillis = currMillis;
        }
        
        return currMillis + "_" + count++ + getFileExtName(filename);
    }
    
    private String getFileExtName(String filename) {
        int dotPosition = filename.lastIndexOf(".");
        if(dotPosition == -1) return "";
        
        return filename.substring(dotPosition);
    }
}


