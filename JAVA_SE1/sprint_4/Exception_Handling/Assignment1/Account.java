package java111.sprint_4.Exception_Handling.Assignment1;

class InsufficientFundsException extends Exception{
     public InsufficientFundsException(){
        System.err.println("InsufficientFundException");
    }
}
//public static int =0;
class Account {
    private String accountNumber;
     private double  balance;
   public Account(String accountNumber){
       this.accountNumber= accountNumber;
   }
  public void deposit(double amount){
        this.balance=amount;
      System.out.println(balance);
  }
  public double withdraw(double amount) throws InsufficientFundsException{
       if(amount<balance)  this.balance=this.balance-amount;
       else throw  new InsufficientFundsException();
      System.out.println("Success");
      System.out.println("Available balance "+balance);
      return amount ;
  }
}
class AccountDemo{
    public static void main(String[] args) {
        Account account=new Account("101022");
        account.deposit(20202.22);
        try {
            account.withdraw(9992220);
        }
        catch (InsufficientFundsException insufficientFundsException){
            System.err.println("please enter a valid amount");
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}

/*Q3) Create a user-defined checked exception called InsufficientFundsException.
Create a class called Account with 2 fields:
accountNumber: String
balance: double

and define the following 2 methods inside the Account class:
deposit(amount): void
withdraw(amount): double

Create an AccountDemo class with the main method and perform the following task:
Create the Account class object by passing the Account number.
You can deposit the amount into that account by invoking the deposit() method
by passing the deposit amount as an argument.
If you have a balance in your account, you have to withdraw the amount by
invoking the withdraw() method by passing a suitable amount as an argument.
But, if your requested amount is more than the available balance, you have to
generate the “InsufficientFundException” object and the same have to be thrown
to the caller (with the suitable message).
Note: make sure the application should be terminated normally.*/