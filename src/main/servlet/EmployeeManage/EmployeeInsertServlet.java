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
import java.sql.ResultSet;

@WebServlet("/EmployeeInsertServlet")
public class EmployeeInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String EmpName = request.getParameter("EmpName");
            String Gender = request.getParameter("Gender");
            String password = request.getParameter("password");
            String roleName = request.getParameter("roleName");
            HttpSession session = request.getSession();
            EmployeeDao employee = new EmployeeDao();
            boolean rs = employee.employeeInsert(EmpName, Gender, password);
            if (rs) {
                session.setAttribute("result", "添加成功");
                ResultSet rd = employee.employeeSelectJudge(EmpName, Gender, password);
                if (rd.next()) {
                    String empId = rd.getString("empId");
                    System.out.println(empId);
                    if (roleName.equals("admin")) {
                        ErDao er = new ErDao();
                        boolean success = er.insertEr(empId, "r1");
                        if (success) {
                            session.setAttribute("result", "角色分配成功");
                        } else {
                            session.setAttribute("result", "员工表更新失败");
                        }
                    }
                    if (roleName.equals("service")) {
                        ErDao er = new ErDao();
                        boolean success = er.insertEr(empId, "r2");
                        if (success) {
                            session.setAttribute("result", "角色分配成功");
                        } else {
                            session.setAttribute("result", "角色分配失败");
                        }
                    }
                } else {
                    session.setAttribute("result", "获取id失败");
                }
            } else {
                session.setAttribute("result", "添加失败");
            }
            response.sendRedirect("Result.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
