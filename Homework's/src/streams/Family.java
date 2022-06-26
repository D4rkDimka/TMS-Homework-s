package streams;

import java.util.List;

public class Family {
    private String familySurname;
    private String address;
    private Integer avgSalary;
    private List<Child> children;

    public Family(String familySurname, String address, Integer avgSalary, List<Child> children) {
        this.familySurname = familySurname;
        this.address = address;
        this.avgSalary = avgSalary;
        this.children = children;
    }

    public String getFamilySurname() {
        return familySurname;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAvgSalary() {
        return avgSalary;
    }

    public List<Child> getChildren() {
        return children;
    }
}
