/* 
With the help of example define Encapsulation features in Java.
*/
class Encapsulation {
    //private variables declared for Encapsulation purpose
    private int empID, empSalary; 
    private String empName;

    // get method to access private variable empID
    public int getEmpID()
    {
        return empID;
    }

    // get method to access private variable empSalary
    public int getEmpSalary()
    {
        return empSalary;
    }

    // get method to access private variable empName
    public String getEmpName()
    {
        return empName;
    }

    // set method to access private variable empID
    public void setEmpId(int newEmpId)
    {
        empID = newEmpId;
    }

    // set method to access private variable empSalary
    public void setEmpSalary(int newEmpSalary)
    {
        empSalary = newEmpSalary;
    }

    // set method to access private variable empName
    public void setEmpName(String newEmpName)
    {
        empName = newEmpName;
    }


    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation(); //creating a object for Time clas

        obj.setEmpName("Manish Das"); //accessing the private varible using setter method
        obj.setEmpId(112); //accessing the private varible using setter method
        obj.setEmpSalary(45990); //accessing the private varible using setter method

        System.out.println("\nEmployee Name: " + obj.getEmpName()); //accessing the private varible using getter method
        System.out.println("Employee ID: " + obj.getEmpID()); //accessing the private varible using getter method
        System.out.println("Employee Salary: " + obj.getEmpSalary()); //accessing the private varible using getter method
    }   
}