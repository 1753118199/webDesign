package main.servlet.GoodManage;

import main.dao.GoodDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/GoodDeleteServlet")
public class GoodDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String gId = request.getParameter("goodId");
        HttpSession session = request.getSession();
        GoodDao goodDao = new GoodDao();
        int rs = goodDao.goodDelete(gId);
        if (rs == 1) {
            session.setAttribute("result", "屏蔽成功");
        } else {
            session.setAttribute("result", "屏蔽失败");
        }
        response.sendRedirect("Result.jsp");

    }
}
