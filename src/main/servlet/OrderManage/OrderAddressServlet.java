package main.servlet.OrderManage;

import main.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/OrderAddressServlet")
public class OrderAddressServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String addressid = request.getParameter("addressId");
        String orderId = request.getParameter("orderId");

        HttpSession session = request.getSession();
        OrderDao order = new OrderDao();
        boolean rs = order.orderUpdate(addressid, orderId);

        if (rs) {
            session.setAttribute("result", "地址修改成功");
        } else {
            session.setAttribute("result", "地址修改失败");
        }
        response.sendRedirect("Result.jsp");
    }
}
