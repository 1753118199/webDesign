package main.servlet.AddressManage;

import main.dao.AddressDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/AddressUpdateServlet")
public class AddressUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String aId = request.getParameter("aId");
        String cId = request.getParameter("cId");
        String address = request.getParameter("address");


        HttpSession session = request.getSession();
        AddressDao addressDao = new AddressDao();
        int rs = addressDao.addressUpdate(aId, cId, address);
        if (rs == 1) {
            session.setAttribute("result", "更新成功");
        } else {
            session.setAttribute("result", "更新失败");
        }
        response.sendRedirect("Result.jsp");
    }
}
