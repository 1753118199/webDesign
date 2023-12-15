package main.servlet.AddressManage;

import main.bean.Address;
import main.dao.AddressDao;

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

@WebServlet("/AddressOrderServlet")
public class AddressOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            String customerId = request.getParameter("customerId");
            String orderId = request.getParameter("orderId");

            AddressDao addressDao = new AddressDao();
            ResultSet rs1 = addressDao.addressSelect(customerId);
            List<Address> addressList = new ArrayList<>();
            while (rs1.next()) {
                Address addresses = new Address();
                addresses.setAddressId(rs1.getString("addressId"));
                addresses.setCustomerId(rs1.getString("customerId"));
                addresses.setAddress(rs1.getString("address"));
                addressList.add(addresses);
            }
            if (addressList.isEmpty()) {
                session.setAttribute("result", "地址查询失败");
                response.sendRedirect("Result.jsp");
            } else {
                session.setAttribute("addressList", addressList);
                session.setAttribute("orderId", orderId);
                response.sendRedirect("/AddressManage/AddressOrderChooseShow.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
