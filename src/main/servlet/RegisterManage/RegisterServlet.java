package main.servlet.RegisterManage;

import main.dao.AddressDao;
import main.dao.CustomerDao;
import main.dao.RegisterDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String customerName = request.getParameter("customerName");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String customerPhone = request.getParameter("customerPhone");
        HttpSession session = request.getSession();
        RegisterDao registerDao = new RegisterDao();
        int r = registerDao.customerInsert(customerName, password, customerPhone);

        if (r == 1) {
            //获取刚插入的数据的cid
            CustomerDao customerDao = new CustomerDao();
            ResultSet rs = customerDao.getCustomerByName(customerName);
            try {
                if (rs.next()) {
                    String customerId = rs.getString("customerId");
                    AddressDao addressDao = new AddressDao();
                    int success = addressDao.addressInsert(customerId, address);
                    if (success == 1) {
                        response.sendRedirect("LoginManage/Login.jsp");
                    } else {
                        session.setAttribute("result", "地址插入失败");
                        response.sendRedirect("Result.jsp");
                    }
                } else {
                    session.setAttribute("result", "没有获取到用户的id");
                    response.sendRedirect("Result.jsp");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
