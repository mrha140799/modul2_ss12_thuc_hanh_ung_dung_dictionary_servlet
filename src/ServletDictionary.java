import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ServletDictionary", urlPatterns = "/search")
public class ServletDictionary extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Map<String , String> dic = new HashMap<>();
        dic.put("Hello" , "Xin Chào");
        dic.put("Dog" , "Con chó");
        dic.put("Cat" , "Con mèo");
        dic.put("mouse" , "Con chuột");

        String voca = request.getParameter("txtEnglish");
        String rel = dic.get(voca);
        PrintWriter writer = response.getWriter();
        if (rel != null) {
            writer.println("<h1>Word: " + voca+"</h1>");
            writer.println("<h1>Result: " + rel+"</h1>");
        }else {
            writer.println("<h1>Not found</h1>");

        }


    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
