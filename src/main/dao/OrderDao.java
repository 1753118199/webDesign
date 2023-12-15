package main.dao;

import main.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDao {
    //视图查询订单表
    public ResultSet OrderSelect(String uName) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "SELECT * FROM order_address_detail_customer WHERE buy_customer=? AND orderDelete=0";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, uName);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //删除订单表
    public int orderDelete(String orderId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE `order`\n" +
                    "SET orderDelete=1\n" +
                    "WHERE orderId=?" +
                    "\n";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, orderId);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;

        }
    }

    //插入订单表
    public int orderInsert(String addressId, String buyerId, String sellerId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "INSERT INTO `order` (addressId,buyerId,sellerId) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, addressId);
            ps.setString(2, buyerId);
            ps.setString(3, sellerId);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;

        }
    }

    //    查找订单的id
    public ResultSet selectOrderId(String addressId, String buyerId, String sellerId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "SELECT orderId\n" +
                    "FROM `order` \n" +
                    "WHERE addressId=? AND buyerId=? AND sellerId=? AND orderDelete=0";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, addressId);
            ps.setString(2, buyerId);
            ps.setString(3, sellerId);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //    更新订单
    public boolean orderUpdate(String addressId, String orderId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE `order` SET addressId=? WHERE orderId=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, addressId);
            ps.setString(2, orderId);
            int i = ps.executeUpdate();
            if (i >= 1)
                return true;
            else return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
