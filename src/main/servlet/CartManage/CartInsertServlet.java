package main.servlet.CartManage;

import main.dao.CartDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/CartInsertServlet")
public class CartInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String gId = request.getParameter("goodId");
            String cId = request.getParameter("customerId");
            HttpSession session = request.getSession();
            CartDao cartDao = new CartDao();
            int rs = cartDao.cartInsert(cId, gId);
            if (rs == 1) {
                session.setAttribute("result", "添加成功");
            } else {
                session.setAttribute("result", "添加失败");
            }
            response.sendRedirect("Result.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
