package SB_101.sprint_4.day_1.JDBC.Model;

public class Department_Bean {
    private int did;
    private String dname;
    private String location;

    public Department_Bean() {
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department_Bean{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
