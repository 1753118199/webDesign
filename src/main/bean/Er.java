package main.bean;

public class Er {
    private String empId;
    private String roleId;
    private String empName;
    private String roleDescription;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    @Override
    public String toString() {
        return "Er{" +
                "empId='" + empId + '\'' +
                ", roleId='" + roleId + '\'' +
                ", empName='" + empName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                '}';
    }
}
