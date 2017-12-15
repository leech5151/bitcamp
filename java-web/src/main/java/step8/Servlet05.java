package step8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Servlet05 {
    public static void main(String[] args) throws Exception {
        try {
        Socket s = new Socket("localhost", 9999);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream out = new PrintStream(s.getOutputStream());

            out.println("GET /java-web/step8/Servlet01_GET.html HTTP/1.1");
            out.println("Host: localhost");
            out.println();

            String str = null;
            while((str = in.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {}
        System.out.println("------------------------------------------------");
        
        try {
            Socket s = new Socket("localhost", 9999);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintStream out = new PrintStream(s.getOutputStream());

                out.println("HEAD /java-web/step8/Servlet01_GET.html HTTP/1.1");
                out.println("Host: localhost");
                out.println(); 

                String str = null;
                while((str = in.readLine()) != null) {
                    System.out.println(str);
                }
            } catch (Exception e) {}
    }
}
