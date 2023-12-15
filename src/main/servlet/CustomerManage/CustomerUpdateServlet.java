package main.servlet.CustomerManage;

import main.dao.CustomerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/CustomerUpdateServlet")
public class CustomerUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String customerId = request.getParameter("customerId");
            String customerName = request.getParameter("customerName");
            String password = request.getParameter("password");
            String customerPhone = request.getParameter("customerPhone");

            HttpSession session = request.getSession();
            CustomerDao customerDao = new CustomerDao();
            int rs = customerDao.customerUpdate(customerId, customerName, password, customerPhone);
            if (rs == 1) {
                session.setAttribute("result", "更新成功");
            } else {
                session.setAttribute("result", "更新失败");
            }
            response.sendRedirect("Result.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
