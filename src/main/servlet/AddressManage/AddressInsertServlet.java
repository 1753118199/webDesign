package main.servlet.AddressManage;

import main.dao.AddressDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/AddressInsertServlet")
public class AddressInsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String province = request.getParameter("province");
        String city = request.getParameter("city");
        String district = request.getParameter("district");
        String address = request.getParameter("address");
        String fullAddress = province + city + district + address;
        HttpSession session = request.getSession();
        String customerId = request.getParameter("customerId");
        try {
            AddressDao addressDao = new AddressDao();
            int flag = addressDao.addressInsert(customerId, fullAddress);
            if (flag == 1) {
                session.setAttribute("result", "添加成功");
            } else {
                session.setAttribute("result", "添加失败");
            }
            response.sendRedirect("Result.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
