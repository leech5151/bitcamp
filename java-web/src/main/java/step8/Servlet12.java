package step8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@SuppressWarnings("serial")
@WebServlet("/step8/Servlet12")
@MultipartConfig(
        // location="/tmp", <== 업로드 파일이 입시 보관될 폴더
        //fileSizeThreshold=1024 * 1024,  버퍼크기
        maxFileSize=1024 * 1024 * 10, // 업로드 파일의 최대 크기
        maxRequestSize=1024 * 1024 * 100 // 한번 요청을 보내는 데이터의 최대 크기
        )
public class Servlet12 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        
        String name = null;
        String age = null;
        String photoOriginalFileName1 = null;
        String photoNewFileName1 = null;
        String photoOriginalFileName2 = null;
        String photoNewFileName2 = null;
        
        ServletContext context = this.getServletContext();
        String path = context.getRealPath("/step8");
        try {
            name = req.getParameter("name");
            age = req.getParameter("age");
            
            Part photoPart1 = req.getPart("photo1");
            photoOriginalFileName1 = photoPart1.getSubmittedFileName();
           // photoNewFileName1 = getNewFilename(photoOriginalFileName1);
           // photoPart1.write(photoNewFileName1);
            photoNewFileName1 = writeUploadFile(photoPart1, path);
            
            Part photoPart2 = req.getPart("photo2");
            photoOriginalFileName2 = photoPart2.getSubmittedFileName();
            //photoNewFileName2 = getNewFilename(photoOriginalFileName2);
            //file = new File(path + "/" + photoNewFileName2);
            photoNewFileName2 = writeUploadFile(photoPart2, path);
        
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
    
    private String writeUploadFile(Part part, String path) throws IOException{
        BufferedInputStream in  = new BufferedInputStream(part.getInputStream());
        String filename = getNewFilename(part.getSubmittedFileName());
        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(path + "/" + filename));
        
        int b;
        while((b = in.read()) != -1) {
            out.write(b);
        }
        out.flush();
        in.close();
        out.close();
        
        return filename;
    }
}


