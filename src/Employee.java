public class Employee extends Staff implements ICalculator {
    private int overtimeHours = 0;

    public Employee(String id, String name, int age, double factorSalary, String workingDay, String depart, int dayOff, int overtimeHours) {
        super(id, name, age, factorSalary, workingDay, depart, dayOff);
        this.overtimeHours = overtimeHours;
    }

    // Tính lương cho nhân viên
    @Override
    public double calculateSalary(){
        return super.getFactorSalary() * 3000000 + overtimeHours * 200000;
    }

    @Override
    public void displayInformation() {
        //System.out.println("Nhân viên thông thường: ");
        System.out.printf("\t - Mã: %s - Tên nhân viên: %s - Tuổi: %d - Hệ số lương: %.2f - Ngày vào làm: %s - Số ngày nghỉ phép: %d - Bộ phận: %s - Số giờ làm thêm: %d - Lương: %.2f ", super.getId(), super.getName(), super.getAge(), super.getFactorSalary(), super.getWorkingDay(), super.getDayOff(), super.getDepart(), overtimeHours, calculateSalary());
        System.out.println();

    }
}
