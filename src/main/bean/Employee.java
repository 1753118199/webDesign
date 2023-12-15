package main.bean;

public class Employee {
    private String empId;
    private String empName;
    private String empGender;
    private String empPassword;
    private String roleId;
    private String roleName;
    private String roleDescription;
    private String empDelete;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public String getEmpDelete() {
        return empDelete;
    }

    public void setEmpDelete(String empDelete) {
        this.empDelete = empDelete;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empGender='" + empGender + '\'' +
                ", empPassword='" + empPassword + '\'' +
                ", roleId='" + roleId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                ", empDelete='" + empDelete + '\'' +
                '}';
    }
}
