package main.servlet.ErManage;

import main.bean.Er;
import main.dao.ErDao;

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

@WebServlet("/ERSelectServlet")
public class ERSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        ErDao erdao = new ErDao();
        ResultSet rd = erdao.erSelectAll();
        try {
            List<Er> erList = new ArrayList<Er>();
            while (rd.next()) {
                Er er = new Er();
                er.setEmpId(rd.getString("empId"));
                er.setEmpName(rd.getString("roleId"));
                er.setEmpName(rd.getString("empName"));
                er.setRoleDescription(rd.getString("roleDescription"));
                erList.add(er);
            }
            if (erList.isEmpty()) {
                session.setAttribute("result", "个人信息查询失败");
                response.sendRedirect("Result.jsp");
            } else {
                session.setAttribute("erList", erList);
                response.sendRedirect("/ErManage/ErShow.jsp");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
