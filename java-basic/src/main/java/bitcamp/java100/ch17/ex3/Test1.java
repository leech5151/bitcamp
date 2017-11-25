package bitcamp.java100.ch17.ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws Exception{

        Scanner keyboard = new Scanner(System.in);
        System.out.print("변경할 게시물 번호 : ");
        String no = keyboard.nextLine();
        System.out.print("제목 : ");
        String title = keyboard.nextLine();
        System.out.print("내용 : ");
        String conts = keyboard.nextLine();
        keyboard.close();
                
        System.out.println("연결되었음!");
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb",
                "study","1111");
        
        con.prepareStatement(
                "update jdbc_test set title=?, conts=? where no=?");
        
        
        Statement stmt = con.createStatement();
        
        stmt.executeUpdate(
                "update jdbc_test set title='" + title
                + "',conts='" + conts
                + "'where no=" + no);
        System.out.println("입력완료!");
        
        stmt.close();
        con.close();
    }
}
