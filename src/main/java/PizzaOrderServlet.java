import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="PizzaOrderServlet", urlPatterns="/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pizza.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Boolean orderFilled = false;

        String crust = request.getParameter("pizzaCrust");
        String sauce = request.getParameter("pizzaSauce");
        String size = request.getParameter("size");

        if (crust != null && sauce != null && size != null) {
            orderFilled = true;
        }
        if (orderFilled) {
            System.out.println(crust);
            System.out.println(sauce);
            System.out.println(size);
        }

        request.getRequestDispatcher("/WEB-INF/pizza.jsp").forward(request, response);
    }


}
