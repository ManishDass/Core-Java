import java.util.*;

class Employee {

    private String EmpName;
    private int EID;
    private int ESalary;

    public void setData(int eid, String ename, int esalary) {
        EID = eid;
        EmpName = ename;
        ESalary = esalary;
    }

    public void getData() {
        System.out.print("Employee ID: " + EID);
        System.out.print("\nEmployee Name: " + EmpName);
        System.out.print("\nEmployee Salary: " + ESalary);
    }

    public int getSalary() {
        return ESalary;
    }
}

public class employeeSalary {
    public static void main(String[] args) {
        Employee[] obj = new Employee[5];

        Scanner sc = new Scanner(System.in); // scanner class object

        for (int i = 0; i < 3; i++) {
            System.out.println("\n\n<-Employee " + (i + 1) + "->");
            System.out.print("Enter Employee Name: ");
            String name = sc.next();
            System.out.print("\nEnter Employee ID:");
            int id = sc.nextInt();
            System.out.print("\nEnter Employee Salary:");
            int salary = sc.nextInt();

            obj[i] = new Employee();
            obj[i].setData(id,name,salary);
        }

        int minSalary = obj[0].getSalary(), maxSalary = obj[0].getSalary();
        int minFlag = 0, maxFlag = 0;


        for (int i = 0; i < 3; i++) {
            if (obj[i].getSalary() > maxSalary) {
                maxSalary = obj[i].getSalary();
                maxFlag = i;
            }
            if (obj[i].getSalary() < minSalary) {
                minSalary = obj[i].getSalary();
                minFlag = i;
            }
        }

        System.out.println("\n\nEmployee having Minimum Salary");
        obj[minFlag].getData();

        System.out.println("\n\nEmployee having Maximum Salary");
        obj[maxFlag].getData();

        sc.close();  //closing the scanner class
    }

}
