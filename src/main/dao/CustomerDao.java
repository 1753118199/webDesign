package main.dao;

import main.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDao {
    public ResultSet getCustomerById(String customerId) {
        try {
            Connection con = DbUtil.getConn();

            String sql = "SELECT * FROM customer WHERE customerId=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customerId);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int customerUpdate(String customerId, String customerName, String password, String customerPhone) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE customer SET customerName=?,password=?,customerPhone=? WHERE customerId=?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, customerName);
            pstmt.setString(2, password);
            pstmt.setString(3, customerPhone);
            pstmt.setString(4, customerId);
            return pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int customerDelete(String customerId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE customer SET customerDelete=1 WHERE customerId=" + customerId;
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ResultSet getCustomerByName(String customerName) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "SELECT * FROM customer WHERE customerName=? AND customerDelete=0";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customerName);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int passwordUpdate(String customerId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE customer SET password=? WHERE customerId=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "111");
            ps.setString(2, customerId);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int customerWarning(String customerId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE customer SET customerDelete=2 WHERE customerId=" + customerId;
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int userWarningOut(String customerId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE customer SET customerDelete=0 WHERE customerId=" + customerId;
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ResultSet SelectAllCustomer() {
        try {
            Connection con = DbUtil.getConn();

            String sql = "SELECT * FROM customer";
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
