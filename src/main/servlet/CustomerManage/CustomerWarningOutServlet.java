package main.servlet.CustomerManage;

import main.dao.CustomerDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/CustomerWarningOutServlet")
public class CustomerWarningOutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String customerId = request.getParameter("customerId");

            HttpSession session = request.getSession();
            CustomerDao customerDao = new CustomerDao();
            int rs = customerDao.userWarningOut(customerId);
            if (rs == 1) {
                session.setAttribute("result", "恢复成功");
            } else {
                session.setAttribute("result", "恢复失败");
            }
            response.sendRedirect("Result.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
