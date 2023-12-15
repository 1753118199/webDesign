package main.servlet.CustomerManage;

import main.bean.Customer;
import main.dao.CustomerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/CustomerSelectAllServlet")
public class CustomerSelectAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            CustomerDao customerDao = new CustomerDao();
            ResultSet rs = customerDao.SelectAllCustomer();
            List<Customer> customerList = new ArrayList<>();

            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCustomerId(rs.getString("customerId"));
                customer.setCustomerName(rs.getString("customerName"));
                customer.setPassword(rs.getString("password"));
                customer.setCustomerPhone(rs.getString("customerPhone"));
                customer.setCustomerDelete(rs.getString("customerDelete"));
                customerList.add(customer);
            }

            if (customerList.isEmpty()) {
                session.setAttribute("result", "信息查询失败");
                response.sendRedirect("Result.jsp");
            } else {
                session.setAttribute("customerList", customerList);
                response.sendRedirect("/CustomerManage/CustomerSelectAllShow.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
