// tạo class abstract
public abstract class Staff {
    // tạo hàm abstract chứa các thông tin cơ bản của nhân viên
    public abstract  void displayInformation();


    // Khai báo thuộc tính của nhân viên
    private String id;
    private String name;
    private int age;
    private double factorSalary;
    private String workingDay;
    private String depart;
    private int dayOff;

    // phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính tương ứng.
    public Staff(String id, String name, int age, double factorSalary, String workingDay, String depart, int dayOff){
        this.id = id;
        this.name = name;
        this.age = age;
        this.factorSalary = factorSalary;
        this.workingDay = workingDay;
        this.depart = depart;
        this.dayOff = dayOff;
    }

    // các setter và getter (dùng để lấy và đặt giá trị của các biến)
    // setter & getter Id
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    // setter & getter coefficientsSalary
    public double getFactorSalary(){
        return factorSalary;
    }
    public void setFactorSalary(double factorSalary){
        this.factorSalary = factorSalary;
    }

    // setter & getter name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // setter & getter age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    // setter & getter workingDay
    public String getWorkingDay(){
        return workingDay;
    }
    public void setWorkingDay(String workingDay){
        this.workingDay = workingDay;
    }
    // setter & getter depart
    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    // setter & getter dayOff
    public int getDayOff(){
        return dayOff;
    }
    public void setDayOff(int dayOff){
        this.dayOff = dayOff;
    }



}
