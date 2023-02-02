package java111.sprint_3;

 /*a. Create an Employee_I class with the following fields:
        employeeId: Integer
        employeeName: String
        salary: double
        b. Write a public 2 argument constructor with arguments – employeeId, and
        employeeName.
        c. Write an abstract method inside the Employee_I class
calculateSalary: void*/
public abstract class Employee {
     Integer employeeId;
     String employeeName;
     double salary;
     public Employee(Integer employeeId,String employeeName){

     }



      abstract void calculateSalary();
}

/*
        d. Create another class PermanentEmployee as a child of the above Employee_I
class and inside this class define one private field
        basicPay: double
        e. Define a 3 parameter constructor inside this class to take (employeeId,
        employeeName and basicPay).
        f. Implement the calculateSalary method in PermanentEmployee class as
salary = basicPay – PF amount;
        Set this value to the salary attribute.
        Here PF Amount = basicPay * 0.12
 */


class PermanentEmployee extends Employee{
     private double basicPay=0.0;

     public PermanentEmployee(Integer employeeId, String employeeName,double  basicPay) {

           super(employeeId, employeeName);

           this.basicPay=basicPay;
     }



     @Override
     void calculateSalary() {
          double PF_amount=(double) basicPay*0.12;
            super.salary=basicPay-PF_amount;
     }


}

/*  g. Create another class TemporaryEmployee as a child of Employee_I class with
the following private fields:
        hoursWorked: Integer
        hourlyWages: Integer
        h. Define a 4 argument constructor with arguments – employeeId,
        employeeName, hoursWorked and hourlyWages.
        i. Implement the calculateSalary method in TemporaryEmployee class as
salary = hoursWorked * hourlyWages
        Set this value to the salary attribute.
        */
class  TemporaryEmployee extends Employee{
     private Integer hoursWorked;
     private  Integer hourlyWages;

     public TemporaryEmployee(Integer employeeId, String employeeName,Integer hoursWorked,Integer hourlyWages) {
          super(employeeId, employeeName);
          this.hoursWorked=hoursWorked;
          this.hourlyWages=hourlyWages;
     }

     @Override
     void calculateSalary() {
            super.salary = hoursWorked * hourlyWages;
     }
}


 /* Develop a class Loan inside this Loan class define a method
        calculateLoanAmount as follows:
public double calculateLoanAmount(Employee_I employeeObj)
        This method should calculate the loan amount and return that amount.
        Provide the implementation for this method as mentioned below, loan amount
        is calculated as follows :
        If the Employee_I object is of type PermanentEmployee then
        the loan amount should be 15% of the salary.
        If the Employee_I object is of type TemporaryEmployee then the loan amount
        should be 10% of the salary.
       */

class Loan{
     public double calculateLoanAmount(Employee employeeObj){
          double loan_Amount = 0;
        if(employeeObj instanceof PermanentEmployee){

               loan_Amount= (employeeObj.salary/100) * 15;
//             System.out.println(employeeObj.salary);
        }
        else if(employeeObj instanceof  TemporaryEmployee){
             loan_Amount= (employeeObj.salary/100) * 10;
        }
        return  loan_Amount;
   }
}

/*
 k. Define a Main class with the main method and inside the main method, get
        the Loan class object and call the calculateLoanAmount() method 3 times with
        the following inputs.
        l. by supplying PermanentEmployee object as an input to the
        calculateLoanAmount()
        m. by supplying TemporaryEmployee object as an input to the
        calculateLoanAmount()
        n. by supplying a null value as an input to the calculateLoanAmount()
        display the appropriate result, there shouldn’t be any null pointer exception.
 */

class  Main{
     public static void main(String[] args) {
          Loan loan=new Loan();
          PermanentEmployee pe=new PermanentEmployee(1,"Debabrata",10000);
         pe.calculateSalary();
       System.out.println(loan.calculateLoanAmount(pe));

          TemporaryEmployee temporaryEmployee=new TemporaryEmployee(2,"Satapathy",6,12);
          temporaryEmployee.calculateSalary();
          System.out.println( loan.calculateLoanAmount(temporaryEmployee));

          System.out.println(loan.calculateLoanAmount(null));
     }
}


