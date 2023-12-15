package main.servlet.OrderManage;

import main.dao.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/OrderInsertServlet")
public class OrderInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        //获取商品的id
        String gId = request.getParameter("goodId");
        //获取用户的id
        String cId = request.getParameter("customerId");
        //获取购物车id
        String carId = request.getParameter("cartId");
        //通过调用商品的模糊查询在查找卖家的id
        GoodDao good = new GoodDao();
        ResultSet rs = good.goodSelectLike("goodId", gId, "or", "goodId", gId);
        try {
            if (rs.next()) {
                //卖家的id
                String customerId = rs.getString("customerId");
                AddressDao address = new AddressDao();
                //获取买家的地址
                ResultSet rd = address.addressSelect(cId);
                if (rd.next()) {
                    String addressId = rd.getString("addressId");
                    OrderDao order = new OrderDao();
                    //添加到订单，地址id，买家id，卖家的id
                    int success = order.orderInsert(addressId, cId, customerId);
                    if (success == 1) {
                        ResultSet orders = order.selectOrderId(addressId, cId, customerId);
                        if (orders.next()) {
                            String orderId = orders.getString("orderId");
                            GoodDao goods = new GoodDao();
                            ResultSet rss = goods.goodSelectLike("goodId", gId, "or", "goodId", gId);
                            if (rss.next()) {
                                //获取价格
                                String price = rs.getString("price");
                                DetailDao detail = new DetailDao();
                                //插入订单中
                                boolean inert = detail.detailInsert(orderId, "1", price, gId);
                                if (inert) {
                                    session.setAttribute("result", "已添加到详单中");
                                    //更新购物车
                                    CartDao cart = new CartDao();
                                    int cartDelete = cart.cartDelete(carId);
                                    if (cartDelete == 1) {
                                        session.setAttribute("result", "已添加到订单中");
                                    } else {
                                        session.setAttribute("result", "已添加到订单，购物车商品删除失败！");
                                    }
                                } else {
                                    session.setAttribute("result", "添加详单失败");
                                }
                            }
                        }
                    } else {
                        session.setAttribute("result", "添加到订单失败");
                    }
                } else {
                    session.setAttribute("result", "未查询到有用的地址，请前往添加地址");
                }
            } else {
                session.setAttribute("result", "未查找到该商品");
            }
            response.sendRedirect("Result.jsp");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
