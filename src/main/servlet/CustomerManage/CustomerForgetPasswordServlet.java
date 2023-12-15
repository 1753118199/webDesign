package main.servlet.CustomerManage;

import main.dao.CustomerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/CustomerForgetPasswordServlet")
public class CustomerForgetPasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String customerId = request.getParameter("customerId");
        String customerPhone = request.getParameter("customerPhone");
        HttpSession session = request.getSession();
        CustomerDao customerDao = new CustomerDao();
        ResultSet rs = customerDao.getCustomerById(customerId);
        try {
            if (rs.next()) {
                String customerPhone1 = rs.getString("customerPhone");
                if (customerPhone1.equals(customerPhone)) {
                    int success = customerDao.passwordUpdate(customerId);
                    if (success == 1) {
                        response.sendRedirect("LoginManage/Login.jsp");
                    } else {
                        session.setAttribute("result", "输入账号与电话号不匹配");
                        response.sendRedirect("Result.jsp");
                    }
                }
            } else {
                session.setAttribute("result", "未查找到该账号手机号");
                response.sendRedirect("Result.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
