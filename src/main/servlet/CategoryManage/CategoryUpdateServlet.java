package main.servlet.CategoryManage;

import main.dao.CategoryDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/CategoryUpdateServlet")
public class CategoryUpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            String categoryId = request.getParameter("categoryId");
            String categoryName = request.getParameter("categoryName");
            CategoryDao categoryDao = new CategoryDao();
            int rs = categoryDao.categoryUpdate(categoryId, categoryName);
            if (rs == 1) {
                session.setAttribute("result", "更新成功");
            } else {
                session.setAttribute("result", "更新失败");
            }
            response.sendRedirect("Result.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
