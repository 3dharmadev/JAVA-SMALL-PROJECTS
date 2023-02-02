package SB_101.sprint_4.day_1.JDBC.Model;

public class Employee_Bean {
    private int empid;
    private String ename;
    private String address;
    private String email;
    private String password;
    private int salary;
    private int deptid=1;

    public int getEmpid() {
        return empid;
    }

    public Employee_Bean() {
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    @Override
    public String toString() {
        return "Employee_Bean{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                ", deptid=" + deptid +
                '}';
    }
}
