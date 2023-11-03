import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "PickColor", urlPatterns = "/pick-color")
public class PickColor extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pickcolor.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userColor = request.getParameter("color");
        HttpSession session = request.getSession();
        session.setAttribute("color", userColor);
        request.getRequestDispatcher("/WEB-INF/viewcolor.jsp").forward(request, response);
        response.sendRedirect("/view-color");
    }

}
