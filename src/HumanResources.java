import java.util.*;

public class HumanResources {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating department list
        ArrayList<Department> departmentsList = new ArrayList<>();
        // Creating Arraylist Staff
        ArrayList<Staff> staffList = new ArrayList<>();

        //add department
        Department dep1 = new Department(1, "Business"
                , 2);
        Department dep2 = new Department(2, "Project"
                , 2);
        Department dep3 = new Department(3, "Technical "
                , 1);

        departmentsList.add(dep1);//Adding object in arraylist
        departmentsList.add(dep2);
        departmentsList.add(dep3);

        // adding staff
        Employee emp1 = new Employee("nv01", "Rooney", 18, 1.0, "11/2/2021", "Project", 2, 2);
        Employee emp2 = new Employee("nv02", "Messi", 18, 1.0, "12/2/2021", "Business", 6, 3);
        Manager man1 = new Manager("ql05", "Alex Ferguson", 25, 2.0, "21/12/2018", "Project", 5, "Project Leader");
        Manager man2 = new Manager("ql06", "Pep Guardiola", 26, 2.0, "10/06/2018", "Business", 3, "Business Leader");
        Manager man3 = new Manager("ql07", "Jose Mourinho.", 24, 2.0, "12/03/2018", "Technical", 8, "Technical Leader ");

        staffList.add(emp1); // adding object in stafflist
        staffList.add(emp2);
        staffList.add(man1);
        staffList.add(man2);
        staffList.add(man3);

        int number;
        do {
            // Show function
            System.out.println("\nCác chức năng");
            System.out.println("    1. Hiển thị danh sách nhân viên hiện có trong công ty.");
            System.out.println("    2. Hiển thị các bộ phận trong công ty.");
            System.out.println("    3. Hiển thị các nhân viên theo từng bộ phận.");
            System.out.println("    4. Thêm nhân viên mới vào công ty.");
            System.out.println("    5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên.");
            System.out.println("    6. Hiển thị bảng lương của nhân viên toàn công ty.");
            System.out.println("    7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần.");
            System.out.println("    8. Hiển thị bảng lương của nhân viên theo thứ tự giảm dần.");
            System.out.println("    0. Thoat!");
            // Choose function
            System.out.print("Chọn chức năng (0 - 8): ");
            number = sc.nextInt();

            switch (number) {
                case 0:
                    // exit program
                    break;
                case 1:
                    //Show list of Staff
                    System.out.println("\nDanh sách nhân viên hiện có trong công ty:");
                    // Traversing list through the for-each loop
                    for (Staff nhanVien : staffList) {
                        nhanVien.displayInformation();
                    }
                    System.out.println();
                    break;
                case 2:

                    //Show department
                    System.out.println("\nCác bộ phận trong công ty:");

                    // Traversing list through the for-each loop
                    for (Department dep : departmentsList) {
                        System.out.println(dep.toString());
                    }
                    break;
                case 3:
                    //Business department
                    System.out.println("\nDanh sách nhân viên bộ phận Business:");
                    // Traversing list through the for-each loop
                    for (Staff nhanVien : staffList) {
                        if (nhanVien.getDepart().equalsIgnoreCase("Business")) {
                            nhanVien.displayInformation();
                        }
                    }
                    //Project department
                    System.out.println("\nDanh sách nhân viên bộ phận Project:");
                    for (Staff nhanVien : staffList) {
                        if (nhanVien.getDepart().equalsIgnoreCase("Project")) {
                            nhanVien.displayInformation();
                        }
                    }
                    //Technical department
                    System.out.println("\nDanh sách nhân viên bộ phận Technical:");
                    // Traversing list through the for-each loop
                    for (Staff nhanVien : staffList) {
                        if (nhanVien.getDepart().equalsIgnoreCase("Technical")) {
                            nhanVien.displayInformation();
                        }
                    }
                    break;
                case 4:
                    //Add new staff ti the company
                    Scanner sc4 = new Scanner(System.in);
                    int number4;
                    do {
                        System.out.println("\nThêm nhân viên mới vào công ty:");
                        System.out.println("    1. Thêm nhân viên thông thường.");
                        System.out.println("    2. Thêm nhân viên là cấp quản lý (có thêm chức vụ):");
                        System.out.println("    0. Thoát!");
                        System.out.print("Chọn chức năng: ");
                        number4 = sc4.nextInt();

                        switch (number4) {
                            case 0:
                                break;
                            case 1:
                                // Adding new employee
                                Scanner sc44 = new Scanner(System.in);
                                System.out.print("Nhập mã nhân viên: ");
                                String ID = sc44.nextLine();
                                if (ID.equals("")) {
                                    break;
                                }
                                System.out.print("Nhập tên: ");
                                String name = sc44.nextLine();
                                System.out.print("Nhập tuổi: ");
                                int age = sc44.nextInt();
                                System.out.print("Nhập hệ số lương: ");
                                double factorSalary = sc44.nextDouble();
                                System.out.print("Nhập ngày vào làm (DD/MM/YYYY): ");
                                String workingDay = new Scanner(System.in).nextLine();
                                System.out.print("Nhập số ngày nghỉ phép: ");
                                int dayOff = sc44.nextInt();
                                System.out.print("Nhập bộ phận (Business, Project, Technical): ");
                                String depart = new Scanner(System.in).nextLine();
                                System.out.print("Nhập số giờ làm thêm: ");
                                int overTime = sc44.nextInt();
                                // Adding new Employee object
                                Staff newEmp = new Employee(ID, name, age, factorSalary, workingDay, depart, dayOff, overTime);
                                staffList.add(newEmp); //Adding object in arraylist
                                break;
                            case 2:
                                // Adding new Manager
                                Scanner sc45 = new Scanner(System.in);
                                System.out.print("Nhập mã nhân viên: ");
                                ID = sc45.nextLine();
                                if (ID.equals("")) {
                                    break;
                                }
                                System.out.print("Nhập tên: ");
                                name = sc45.nextLine();
                                System.out.print("Nhập tuổi: ");
                                age = sc45.nextInt();
                                System.out.print("Nhập hệ số lương: ");
                                factorSalary = sc45.nextDouble();
                                System.out.print("Nhập ngày vào làm (DD/MM/YYYY): ");
                                workingDay = new Scanner(System.in).nextLine();
                                System.out.print("Nhập số ngày nghỉ phép: ");
                                dayOff = sc45.nextInt();
                                System.out.print("Nhập bộ phận (Business, Project, Technical): ");
                                depart = new Scanner(System.in).nextLine();
                                sc45.nextLine();
                                System.out.print("Nhập chức vụ: ");
                                String position = sc45.nextLine();
                                // Adding new manager object
                                Staff newMan = new Manager(ID, name, age, factorSalary, workingDay, depart, dayOff, position);
                                staffList.add(newMan); //Adding object in arraylist
                                break;
                            default:
                                //Alert input wrong
                                System.out.println("Nhập sai nhập lại!");
                        }
                    } while (number4 != 0);
                    break;
                case 5:
                    // Find staff by name or id
                    Scanner sc5 = new Scanner(System.in);
                    System.out.print("Nhập mã hoặc tên nhân viên cần tìm: ");
                    String ID = sc5.nextLine();
                    boolean check = false;
                    // Traversing list through the for-each loop
                    for (Staff nv : staffList) {
                        if (ID.equalsIgnoreCase(nv.getId()) || ID.equalsIgnoreCase(nv.getName())) {
                            nv.displayInformation();
                            check = true;
                            break;
                        }
                    }
                    //Alert not found
                    if (!check) {
                        System.out.println("Không tìm thấy nhân viên!");
                    }
                    break;
                case 6:
                    //Display company-wide payroll
                    System.out.println("Bảng lương nhân viên toàn công ty: ");
                    // Traversing list through the for-each loop
                    for (Staff nv :
                            staffList) {
                        nv.displayInformation();
                    }
                    break;
                case 7:
                    //Display payroll in ascending order
                    ArrayList<Staff> sortList = new ArrayList<>(staffList);
                    //Sorting the list
                    sortList.sort((a, b) -> (int) (((ICalculator) a).calculateSalary() - ((ICalculator) b).calculateSalary()));
                    System.out.println("Hiển thị bảng lương của nhân viên theo thứ tự tăng dần. ");
                    //Traversing list through the for-each loop
                    for (Staff sort : sortList) {
                        sort.displayInformation();
                    }
                    break;
                case 8:
                    //Display payroll in decrease order
                    ArrayList<Staff> sortList1 = new ArrayList<>(staffList);
                    //Sorting the list
                    sortList1.sort((a, b) -> (int) (((ICalculator) b).calculateSalary() - ((ICalculator) a).calculateSalary()));
                    System.out.println("Hiển thị bảng lương của nhân viên theo thứ tự giảm dần. ");
                    //Traversing list through the for-each loop
                    for (Staff sort : sortList1) {
                        sort.displayInformation();
                    }
                    break;
                default:
                    //Alert input wrong
                    System.out.println("Nhập sai nhập lại!");
            }
        } while (number != 0);


    }


}

