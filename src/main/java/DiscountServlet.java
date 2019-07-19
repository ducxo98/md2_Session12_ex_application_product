import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",urlPatterns = "/discount")
public class DiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));
        double DiscountAmount = price * discount * 0.1;
        double DiscountPrice = price - discount;
        PrintWriter writer = response.getWriter();
        writer.println("Product Description:" + description );
        writer.println("Price:" + price);
        writer.println("Discount Percent:" + discount);
        writer.println("Discount Amount:" +DiscountAmount);
        writer.println("Discount Price:" + DiscountPrice);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
