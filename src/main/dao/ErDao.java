package main.dao;

import main.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ErDao {
    public boolean updateEr(String empId, String roleId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE er SET roleId=? WHERE empId=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, roleId);
            ps.setString(2, empId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ResultSet erSelectAll() {
        try {
            Connection con = DbUtil.getConn();
            String sql = "SELECT * FROM employee_role_er";
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean insertEr(String empId, String roleId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "INSERT INTO er(roleId,empId)VALUES(?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, roleId);
            ps.setString(2, empId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
