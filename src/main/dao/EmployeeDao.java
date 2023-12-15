package main.dao;

import main.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {
    //    登录验证
    public ResultSet employeeLoginCheck(String empId, String emppassword) {
        try {
            Connection con = DbUtil.getConn();

            String sql = "SELECT * FROM employee_role_er WHERE (empName =? OR empId =?) AND emppassword = ?  AND empDelete=0";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, empId);
            ps.setString(2, empId);
            ps.setString(3, emppassword);

            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }

    //    查找所有的员工
    public ResultSet employeeSelectAll() {
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

    //    删除员工
    public boolean employeeDelete(String empId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE employee SET empDelete=1 WHERE empId=" + empId + "";
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //    更新员工
    public boolean employeeUpdate(String empId, String empName, String empGender, String empPassword) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE employee SET empName=?, empGender=?, empPassword=? WHERE empId=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, empName);
            ps.setString(2, empGender);
            ps.setString(3, empPassword);
            ps.setString(4, empId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //    添加员工
    public boolean employeeInsert(String EmpName, String Gender, String password) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "INSERT INTO employee (empName,empGender,empPassword) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, EmpName);
            ps.setString(2, Gender);
            ps.setString(3, password);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //    条件查找员工
    public ResultSet employeeSelectJudge(String EmpName, String Gender, String password) {
        try {
            Connection con = DbUtil.getConn();

            String sql = "SELECT * FROM employee WHERE empName=? AND empGender=? AND empPassword=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, EmpName);
            ps.setString(2, Gender);
            ps.setString(3, password);
            return ps.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
