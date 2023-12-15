package main.servlet.LoginManage;

import main.dao.CustomerDao;
import main.dao.EmployeeDao;
import main.dao.LoginDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String customerId = request.getParameter("customerId");
            String password = request.getParameter("password");
            String role = request.getParameter("role");
            HttpSession session = request.getSession();
            session.setAttribute("role", role);
            if (role.equals("customer")) {
                CustomerDao customerDao = new CustomerDao();
                ResultSet customer = customerDao.getCustomerById(customerId);
                String delete = "0";
                if (customer.next()) {
                    delete = customer.getString("customerDelete");
                }

                if (delete.equals("2")) {
                    session.setAttribute("result", "你的账户处于异常状态，请联系管理员\n666-88888");
                    response.sendRedirect("Result.jsp");
                } else {
                    LoginDao loginDao = new LoginDao();
                    ResultSet rs = loginDao.loginCheck(customerId, password);
                    if (!rs.next()) {
                        session.setAttribute("result", "用户名或密码与角色不匹配");
                        response.sendRedirect("Result.jsp");
                    } else {
                        session.setAttribute("customerId", customerId);
                        session.setAttribute("result", "登录成功");
                        response.sendRedirect("/FrameManage/CustomerManage/Main.html");
                    }
                }
            } else if (role.equals("admin")) {
                EmployeeDao employee = new EmployeeDao();
                ResultSet rs = employee.employeeLoginCheck(customerId, password);
                if (!rs.next()) {
                    session.setAttribute("result", "用户名或密码与角色不匹配");
                    response.sendRedirect("Result.jsp");
                } else {
                    String roleName = rs.getString("roleName");
                    String roleId = rs.getString("roleId");
                    session.setAttribute("roleName", roleName);
                    session.setAttribute("roleId", roleId);
                    session.setAttribute("customerId", customerId);
                    session.setAttribute("result", "登录成功");
                    response.sendRedirect("/FrameManage/AdminManage/Main.html");
                }
            } else {
                EmployeeDao employee = new EmployeeDao();
                ResultSet rs = employee.employeeLoginCheck(customerId, password);
                if (!rs.next()) {
                    session.setAttribute("result", "用户名或密码与角色不匹配");
                    response.sendRedirect("Result.jsp");
                } else {
                    String roleName = rs.getString("roleName");
                    String roleId = rs.getString("roleId");
                    session.setAttribute("roleName", roleName);
                    session.setAttribute("roleId", roleId);
                    session.setAttribute("customerId", customerId);
                    session.setAttribute("result", "登录成功");
                    response.sendRedirect("/FrameManage/ServiceManage/Main.html");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
