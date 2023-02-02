package SB101_V2.Sprint_2.Evaluation;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) throws Exception {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employeedata.txt"));

        List< Employee> employeeList= (List< Employee>)  ois.readObject();
        for (Employee emp:employeeList) {
            System.out.println(emp);
        }
       // System.out.println(employeeList);
        employeeList.add(new  Employee(12,"ravana",120330,"dbsat3@gmail.com","rock32",new Address("Odisha","Cuttack","753014")));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employeedata.txt"));
        oos.writeObject(employeeList);

    }
}
