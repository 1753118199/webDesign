package main.servlet.GoodManage;

import main.dao.GoodDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/GoodInsertServlet")
public class GoodInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String customerId = request.getParameter("customerId");
            String goodName = request.getParameter("goodName");
            String description = request.getParameter("description");
            String price = request.getParameter("price");
            String category = request.getParameter("category");
            HttpSession session = request.getSession();
            GoodDao goods = new GoodDao();
            int rs = goods.goodInsert(customerId, goodName, description, price, category);
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
