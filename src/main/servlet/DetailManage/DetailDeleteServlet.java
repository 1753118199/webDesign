package main.servlet.DetailManage;

import main.dao.DetailDao;
import main.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/DetailDeleteServlet")
public class DetailDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            String orderId = request.getParameter("orderId");
            String detailId = (String) session.getAttribute("detailId");
            OrderDao order = new OrderDao();
            System.out.println(orderId);
            int rs = order.orderDelete(orderId);
            if (rs == 1) {
                DetailDao detail = new DetailDao();
                boolean success = detail.detailDelete(detailId);
                session.setAttribute("result", "订单删除成功");
                if (success) {
                    session.setAttribute("result", "支付成功，等待发货");
                } else {
                    session.setAttribute("result", "你已经支付过了，请等待收货");
                }
            } else {
                session.setAttribute("result", "订单删除失败");
            }
            response.sendRedirect("Result.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
