package main.dao;

import main.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressDao {
    public int addressDelete(String addressId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE address\n" +
                    "SET addressDelete=1\n" +
                    "WHERE addressId=" + addressId + "";
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int addressInsert(String customerId, String address) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "INSERT INTO address (customerId, address) VALUES (?,?);";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customerId);
            ps.setString(2, address);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ResultSet addressSelect(String userId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "SELECT * FROM address WHERE customerId=? AND addressDelete=0";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userId);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int addressUpdate(String addressId, String customerId, String address) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE address SET customerId=?,address=?WHERE addressId=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, customerId);
            ps.setString(2, address);
            ps.setString(3, addressId);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
