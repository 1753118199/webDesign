package main.servlet.CartManage;


import main.bean.CartSelect;
import main.dao.CartDao;

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

@WebServlet("/CartSelectServlet")
public class CartSelectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String customerId = request.getParameter("customerId");

            HttpSession session = request.getSession();
            CartDao cartDao = new CartDao();
            ResultSet rs1 = cartDao.cartSelect(customerId);
            List<CartSelect> cartList = new ArrayList<>();
            while (rs1.next()) {
                CartSelect cart = new CartSelect();
                cart.setCartId(rs1.getString("cartId"));
                cart.setCustomerId(rs1.getString("customerId"));
                cart.setGoodId(rs1.getString("goodId"));
                cart.setGoodName(rs1.getString("goodName"));
                cart.setDescription(rs1.getString("description"));
                cart.setPrice(rs1.getString("price"));
                cart.setCategory(rs1.getString("category"));
                cartList.add(cart);
            }

            if (cartList.isEmpty()) {
                session.setAttribute("result", "查询错误");
                response.sendRedirect("Result.jsp");
            } else {

                session.setAttribute("cartList", cartList);
                response.sendRedirect("CartManage/CartSelectShow.jsp");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
