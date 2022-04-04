public class Manager extends Staff implements ICalculator{
    private String position;

    public Manager(String id, String name, int age, double factorSalary, String workingDay, String depart, int dayOff, String position){
        super(id, name, age, factorSalary, workingDay, depart, dayOff);
        this.position = position;
    }
    // getter & setter
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }


    @Override
    public double calculateSalary(){
        int reponsibilitySalary = 0;
        if (position.equalsIgnoreCase("Business Leader")){
            reponsibilitySalary = 8000000;
        } else if (position.equalsIgnoreCase("Project Leader")){
            reponsibilitySalary = 5000000;
        } else if (position.equalsIgnoreCase("Technical Leader")){
            reponsibilitySalary = 6000000;
        }
        return super.getFactorSalary() * 5000000 + reponsibilitySalary;
    }

    @Override
    public void displayInformation(){
        //System.out.println("Nhân viên cấp quản lý: ");
        System.out.printf("\t - Mã: %s - Tên: %s - Tuổi: %d - Hệ số lương: %.2f - Ngày vào làm: %s - Số ngày nghỉ phép: %d - Bộ phận: %s - Chức vụ: %s - Lương: %.2f ", super.getId(), super.getName(), super.getAge(), super.getFactorSalary(), super.getWorkingDay(), super.getDayOff(), super.getDepart(), position, calculateSalary());
        System.out.println();
    }
}
