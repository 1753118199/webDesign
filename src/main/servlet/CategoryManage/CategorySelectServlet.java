package main.servlet.CategoryManage;

import main.bean.CategorySelect;
import main.dao.CategoryDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/CategorySelectServlet")
public class CategorySelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            CategoryDao categoryDao = new CategoryDao();
            ResultSet rs = categoryDao.categorySelect();
            List<CategorySelect> categorySelectList = new ArrayList<>();
            while (rs.next()) {
                CategorySelect c = new CategorySelect();
                c.setCategoryId(rs.getString("categoryId"));
                c.setCategoryName(rs.getString("categoryName"));
                c.setUpId(rs.getString("upId"));
                c.setUpName(rs.getString("upName"));
                categorySelectList.add(c);
            }
            if (categorySelectList.isEmpty()) {
                session.setAttribute("result", "未查询到分类数据");
                response.sendRedirect("Result.jsp");
            } else {
                session.setAttribute("categorySelectList", categorySelectList);
                response.sendRedirect("/CategoryManage/CategorySelectShow.jsp");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
