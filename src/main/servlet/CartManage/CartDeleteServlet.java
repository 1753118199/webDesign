package main.servlet.CartManage;

import main.dao.CartDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/CartDeleteServlet")
public class CartDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String cartId = request.getParameter("cartId");
            HttpSession session = request.getSession();
            CartDao cart = new CartDao();
            int rs = cart.cartDelete(cartId);
            if (rs == 1) {
                session.setAttribute("result", "删除成功");
            } else {
                session.setAttribute("result", "删除失败");
            }
            response.sendRedirect("Result.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
