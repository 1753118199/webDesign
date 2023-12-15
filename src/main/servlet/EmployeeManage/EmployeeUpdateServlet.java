package main.servlet.EmployeeManage;

import main.dao.EmployeeDao;
import main.dao.ErDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/EmployeeUpdateServlet")
public class EmployeeUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String employeeId = request.getParameter("employeeId");
            String EmpName = request.getParameter("EmpName");
            String Gender = request.getParameter("Gender");
            String roleId = request.getParameter("roleId");
            String password = request.getParameter("password");
            String rolename = request.getParameter("rolename");
            HttpSession session = request.getSession();
            EmployeeDao employeedao = new EmployeeDao();
            boolean re = employeedao.employeeUpdate(employeeId, EmpName, Gender, password);
            if (re) {
                session.setAttribute("result", "员工表更新成功");
            } else {
                session.setAttribute("result", "员工表更新失败");
            }
            if (rolename.equals("admin")) {
                ErDao er = new ErDao();
                boolean success = er.updateEr(employeeId, "r1");
                if (success) {
                    session.setAttribute("result", "角色分配成功");
                } else {
                    session.setAttribute("result", "员工表更新失败");
                }
            }
            if (rolename.equals("service")) {
                ErDao er = new ErDao();
                boolean success = er.updateEr(employeeId, "r2");
                if (success) {
                    session.setAttribute("result", "角色分配成功");
                } else {
                    session.setAttribute("result", "员工表更新失败");
                }
            }
            response.sendRedirect("Result.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
