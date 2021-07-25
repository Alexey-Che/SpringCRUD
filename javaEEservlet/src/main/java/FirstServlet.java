import somePackage.Cart;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String user = (String) session.getAttribute("current_user");

        if (user == null) {
            //response для анонимного пользователя
            // авторизация
            // регистрация
            // session.setAttribute("current_user", ID);
        } else {
            // response для авторизованного пользователя
        }
//        Cart cart = (Cart) session.getAttribute("cart");
//        String name = req.getParameter("name");
//        int quantity = Integer.parseInt(req.getParameter("quantity"));
//        if (cart ==null) {
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }
//        session.setAttribute("cart", cart);
//
//        getServletContext().getRequestDispatcher("/showCart.jsp").forward(req, resp);

//        Integer count = (Integer) session.getAttribute("count");
//        if (count == null) {
//            session.setAttribute("count", 1);
//            count = 1;
//        } else {
//            session.setAttribute("count", count + 1);
//        }

//        String name = req.getParameter("name");
//        String surname = req.getParameter("surname");

//        PrintWriter pw = resp.getWriter();
//
//        pw.println("<html>");
//        pw.println("<h1> Your count is: " +  + " </h1>");
////        pw.println("<h1> Hello, " + name + " " + surname + " </h1>");
//        pw.println("</html>");
//        resp.sendRedirect("https://www.google.com");
//        resp.sendRedirect("/testJsp.jsp");
//        req.getRequestDispatcher("/testJsp.jsp").forward(req, resp);
    }
}
