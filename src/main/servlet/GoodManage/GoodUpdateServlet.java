package main.servlet.GoodManage;

import main.dao.GoodDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/GoodUpdateServlet")
public class GoodUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String gId = request.getParameter("gId");
        String cId = request.getParameter("cId");
        String gName = request.getParameter("gName");
        String description = request.getParameter("description");
        String price = request.getParameter("price");
        String category = request.getParameter("category");

        HttpSession session = request.getSession();
        GoodDao goodDao = new GoodDao();
        int rs = goodDao.goodsUpdate(gId, cId, gName, description, price, category);
        if (rs == 1) {
            session.setAttribute("result", "更新成功");
        } else {
            session.setAttribute("result", "更新失败");
        }
        response.sendRedirect("Result.jsp");
    }
}
