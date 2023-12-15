package main.servlet.GoodManage;

import main.bean.Good;
import main.dao.GoodDao;

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

@WebServlet("/GoodSelectSelfServlet")
public class GoodSelectSelfServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String option1 = request.getParameter("select1");
            String text1 = request.getParameter("text1");
            String relationship = request.getParameter("relationship");
            String option2 = request.getParameter("select2");
            String text2 = request.getParameter("text2");


            HttpSession session = request.getSession();
            GoodDao goodDao = new GoodDao();
            ResultSet rs = goodDao.goodSelectSelfLike(option1, text1, relationship, option2, text2);

            List<Good> goodList = new ArrayList<>();
            while (rs.next()) {
                Good good = new Good();
                good.setGoodId(rs.getString("goodId"));
                good.setCustomerId(rs.getString("customerId"));
                good.setGoodName(rs.getString("goodName"));
                good.setDescription(rs.getString("description"));
                good.setPrice(rs.getString("price"));
                good.setCategory(rs.getString("category"));
                good.setGoodDelete(rs.getString("goodDelete"));
                goodList.add(good);
            }

            if (goodList.isEmpty()) {
                session.setAttribute("result", "查询错误");
                response.sendRedirect("Result.jsp");
            } else {
                session.setAttribute("goodList", goodList);
                response.sendRedirect("GoodManage/GoodSelfShow.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
