package main.servlet.OrderManage;

import main.bean.Order;
import main.dao.CustomerDao;
import main.dao.OrderDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/OrderSelectServlet")
public class OrderSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String customerId = request.getParameter("customerId");
        String uName = "null";
        try {
            CustomerDao customerdao = new CustomerDao();
            ResultSet rd = customerdao.getCustomerById(customerId);
            if (rd.next()) {
                uName = rd.getString("customerName");
            }
            //通过视图查询所有的数据
            OrderDao order = new OrderDao();
            ResultSet rs = order.OrderSelect(uName);
            List<Order> OrderList = new ArrayList<>();
            while (rs.next()) {
                Order orderSet = new Order();
                orderSet.setOrderId(rs.getString("orderId"));
                orderSet.setAddress(rs.getString("address"));
                orderSet.setBuy_customer(rs.getString("buy_customer"));
                orderSet.setSell_customer(rs.getString("sell_customer"));
                orderSet.setTotal(rs.getString("total"));
                OrderList.add(orderSet);
            }
            if (OrderList.isEmpty()) {
                session.setAttribute("result", "未查询到任何信息");
                response.sendRedirect("Result.jsp");
            } else {

                session.setAttribute("OrderList", OrderList);
                response.sendRedirect("OrderManage/OrderSelectShow.jsp");
                //response.sendRedirect("SelectCourseWeb/mainframe/main-student.html");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
