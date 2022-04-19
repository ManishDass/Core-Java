import java.util.*;

class employee {
    public String eName;
    public String eDesignation;
    public int eSalary;

    employee(String ename, String edesignation, int salary)
    {
        eName = ename;
        eDesignation = edesignation;
        eSalary = salary;
    }
}

class arrayListObj {
    public static void main(String[] args) {
        ArrayList<employee> employeeList = new ArrayList<>();
        employeeList.add(new employee("Manish","Manager",25000));
        employeeList.add(new employee("Akash","HR",25000));
        employeeList.add(new employee("Sandeep","Dean",25000));
        employeeList.add(new employee("Sumit","Marketing",25000));
        employeeList.add(new employee("Pritam","Manager",25000));
        employeeList.add(new employee("Sam","Manager",25000));
        employeeList.add(new employee("Jack","Manager",25000));
        employeeList.add(new employee("Rohit","Manager",25000));
        employeeList.add(new employee("Daniel","Manager",25000));
        employeeList.add(new employee("Samuel","Manager",25000));

        for (employee obj: employeeList) {
            System.out.println("Employee Name: "+obj.eName+", Employee Designation: "+obj.eDesignation+ ", Employee Salary "+obj.eSalary);
        }     
    }
}