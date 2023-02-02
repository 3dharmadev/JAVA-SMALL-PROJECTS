package java111.sprint_4.Exception_Handling;

public class _Scenario_Where_Finally_not_Executed {
    public static void main(String[] args) {
        try {
            System.out.println("Try");
            System.exit(1);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        finally {
            System.out.println("finally block");
        }

    }
}
