package main.servlet.EmployeeManage;

import main.bean.Employee;
import main.dao.EmployeeDao;

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

@WebServlet("/EmployeeSelectAllServlet")
public class EmployeeSelectAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        EmployeeDao employeedao = new EmployeeDao();
        ResultSet rd = employeedao.employeeSelectAll();
        try {
            List<Employee> employeeList = new ArrayList<>();
            while (rd.next()) {
                Employee employee = new Employee();
                employee.setEmpId(rd.getString("empId"));
                employee.setEmpName(rd.getString("empName"));
                employee.setEmpGender(rd.getString("empGender"));
                employee.setEmpPassword(rd.getString("empPassword"));
                employee.setRoleId(rd.getString("roleId"));
                employee.setRoleName(rd.getString("roleName"));
                employee.setRoleDescription(rd.getString("roleDescription"));
                employee.setEmpDelete(rd.getString("empDelete"));
                employeeList.add(employee);
            }
            if (employeeList.isEmpty()) {
                session.setAttribute("result", "个人信息查询失败");
                response.sendRedirect("Result.jsp");
            } else {
                session.setAttribute("employeeList", employeeList);
                response.sendRedirect("/EmployeeManage/EmployeeSelectShow.jsp");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
