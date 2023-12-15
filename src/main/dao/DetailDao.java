package main.dao;

import main.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DetailDao {
    public ResultSet detailSelect(String orderId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "SELECT * FROM detail_good_order WHERE orderId=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, orderId);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean detailDelete(String detailId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE detail SET detailDelete=1 WHERE detailId=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, detailId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ResultSet detailPaySelect(String orderId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "SELECT detail_good_order.detailId,detail_good_order.amount,detail_good_order.total,goodName,detail_good_order.goodId,description,price,detail_good_order.orderId\n" +
                    "FROM detail_good_order\n" +
                    "INNER JOIN detail ON detail_good_order.orderId = detail.orderId\n" +
                    "WHERE detail_good_order.orderId LIKE ? AND detail.detailDelete = 1;\n";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, orderId);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean detailInsert(String orderId, String goodId, String total, String amount) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "INSERT INTO detail(orderId,amount,total,goodId)VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, orderId);
            ps.setString(2, goodId);
            ps.setString(3, total);
            ps.setString(4, amount);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
