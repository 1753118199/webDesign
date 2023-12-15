package main.dao;

import main.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterDao {
    public int customerInsert(String customerName, String password, String customerPhone) {
        ResultSet rs = customerInsertCheck(customerName);
        int check = 0;
        try {
            if (rs.next()) {
                check = 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (check == 1)
            return 0;
        else {
            try {
                Connection con = DbUtil.getConn();
                String sql = "INSERT INTO customer (customerName, password,customerPhone) VALUES (?,?,?);";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, customerName);
                ps.setString(2, password);
                ps.setString(3, customerPhone);
                return ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                return 0;
            }
        }
    }

    public ResultSet customerInsertCheck(String customerName) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "select * from customer WHERE customerName=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, customerName);

            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
