public class Department {
    private int departmentId;
    private String departmentName;
    private int numberOfEmployees;

    // khởi tạo phương thức có tham số để tạo giá trị cho các thuộc tính
    public Department(int departmentId, String departmentName, int numberOfEmployees){
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.numberOfEmployees = numberOfEmployees;
    }

    // cac setter && getter
    public int getDepartmentId(){
        return departmentId;
    }
    public void setDepartmentId(int departmentId){
        this.departmentId = departmentId;
    }

    public String getDepartmentName(){
        return departmentName;
    }
    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(int numberOfEmployees){
        this.numberOfEmployees = numberOfEmployees;
    }

    public String toString(){
        return "\t- Department ID: " + departmentId + " - Department Name: " + departmentName + " - Number of Employees: " + numberOfEmployees;
    }
}
