package java111.sprint_4.Exception_Handling.Assignment1;


import java.util.Scanner;

class InvalidCountryException extends Exception{
    public InvalidCountryException(){
        System.out.println("User Outside India cannot be registered");
    }
}
class UserRegistration{
    public static void registerUser (String username, String userCountry) throws  InvalidCountryException{
        boolean flag=userCountry.equals("India");
        if (flag==false)  throw new InvalidCountryException();
       else System.out.println("User registration done successfully");
    }

    public static void main(String[] args) throws InvalidCountryException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username");
        String usrname= sc.next();
        System.out.println("Enter Country Name");

        String country= sc.next();

        try {
            registerUser(usrname, country);
        } catch (InvalidCountryException exception) {

     // exception.getMessage();
        }
        sc.close();
    }
}
/*Q1) A student portal allows users to register their profile.  During registration the system needs
to validate the user should be located in India.If not, the system should throw an exception.

Step 1: Create a user defined exception class named “InvalidCountryException”.
Step 2: Overload the respective constructors.
Step 3: Create a main class “UserRegistration”, add the following method,
registerUser– The parameter are String username,String userCountry and add the following logic:
• if userCountry is not equal to “India” throw a InvalidCountryException with the message
“User Outside India cannot be registered”
• if userCountry is equal to “India”, print the message “User registration done successfully”
Note : Take the input from user using Scanner
Invoke the method registerUser from the main method with the data specified and see how the program
behaves.

Sample Input 1:
Enter Your Name:
Sam
Enter Your Country:
India

Sample Output 1:
User registration done successfully
Sample Input 2:
Enter Your Name:
Mickey
Enter Your Country:
US

Sample Output 2:
User Outside India cannot be registered*/