package main.dao;

import main.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    public ResultSet loginCheck(String customerId, String password) {
        try {
            Connection con = DbUtil.getConn();

            String sql = "SELECT * FROM customer WHERE (customerName = ? OR customerId =?) AND password = ?  AND customerDelete=0";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customerId);
            ps.setString(2, customerId);
            ps.setString(3, password);

            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
