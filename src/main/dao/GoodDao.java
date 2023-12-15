package main.dao;

import main.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GoodDao {
    //    插入商品
    public int goodInsert(String customerId, String goodName, String description, String price, String category) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "INSERT INTO good (customerId, goodName,description,price,category) VALUES (?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customerId);
            ps.setString(2, goodName);
            ps.setString(3, description);
            ps.setString(4, price);
            ps.setString(5, category);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    //    屏蔽商品
    public int goodDelete(String goodId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE good\n" +
                    "SET goodDelete=2\n" +
                    "WHERE goodId=" + goodId + "";
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    //查找商品
    public ResultSet goodSelectLike(String option1, String text1, String relationship, String option2, String text2) {
        try {
            Connection con = DbUtil.getConn();

            String sql = "SELECT * FROM good_category WHERE (" + option1 + " LIKE '%" + text1 + "%' " +
                    relationship + " " + option2 + " LIKE '%" + text2 + "%'" + ")";
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    //    更新商品
    public int goodsUpdate(String goodId, String customerId, String goodName, String description, String price, String category) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE good SET customerId=?, goodName=?, description=?, price=?, category=? WHERE goodId=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, customerId);
            ps.setString(2, goodName);
            ps.setString(3, description);
            ps.setString(4, price);
            ps.setString(5, category);
            ps.setString(6, goodId);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    //    查找个人商品
    public ResultSet goodSelectSelfLike(String option1, String text1, String relationship, String option2, String text2) {
        try {
            Connection con = DbUtil.getConn();

            String sql = "SELECT * FROM good WHERE(" + option1 + " LIKE '%" + text1 + "%' " +
                    relationship + " " + option2 + " LIKE '%" + text2 + "%'" + ")";
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
