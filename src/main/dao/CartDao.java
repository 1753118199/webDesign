package main.dao;

import main.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartDao {
    public int cartDelete(String cartId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE cart\n" +
                    "SET cartDelete=1\n" +
                    "WHERE cartId=?" +
                    "\n";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cartId);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;

        }
    }

    public int cartInsert(String customerId, String goodId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "INSERT INTO cart (customerId, goodId) VALUES (?,?);";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customerId);
            ps.setString(2, goodId);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ResultSet cartSelect(String customerId) {
        try {
            Connection con = DbUtil.getConn();

            String sql = "SELECT c.cartId, c.customerId, g.goodId, g.goodName, g.description, g.price, g.category\n" +
                    "FROM cart c\n" +
                    "JOIN good g ON c.goodId = g.goodId\n" +
                    "WHERE c.customerId = ? AND cartDelete=0";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customerId);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
