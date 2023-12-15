package main.servlet.DetailManage;

import main.bean.Detail;
import main.dao.DetailDao;

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

@WebServlet("/DetailPayServlet")
public class DetailPayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String orderId = request.getParameter("orderId");
        HttpSession session = request.getSession();
        try {
            //通过视图查询所有的数据
            DetailDao detaildao = new DetailDao();
            ResultSet rs = detaildao.detailPaySelect(orderId);
            List<Detail> DetailList = new ArrayList<>();
            while (rs.next()) {
                Detail detailset = new Detail();
                detailset.setDetailId(rs.getString("detailId"));
                detailset.setOrderId(rs.getString("orderId"));
                detailset.setGoodId(rs.getString("goodId"));
                detailset.setGoodName(rs.getString("goodName"));
                detailset.setDescription(rs.getString("description"));
                detailset.setAmount(rs.getString("amount"));
                detailset.setPrice(rs.getString("price"));
                detailset.setTotal(rs.getString("total"));
                DetailList.add(detailset);
            }
            if (DetailList.isEmpty()) {
                session.setAttribute("result", "未查询到任何信息");
                response.sendRedirect("Result.jsp");
            } else {
                session.setAttribute("DetailList", DetailList);
                response.sendRedirect("DetailManage/DetailPay.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
