import java.util.Scanner;
public class EmailApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String FirstName = input.nextLine();
        System.out.println("What is your last name?");
        String LastName = input.nextLine();
        Email c = new Email(FirstName,LastName);
        //emc.getDept();
        //System.out.println("DEPARTMENT: "+ )
        String email = c.createEmail();
        String FullName = c.getFirstName()+" "+c.getLastName();

        String password = c.makePassword();
        int capacity = c.setMailboxCapacity();
        System.out.println("NAME: "+ FullName);
        System.out.println("DEPARTMENT: "+ c.findDept());
        System.out.println("EMAIL: "+c.createEmail());
        System.out.println("PASSWORD: "+ password);
        System.out.println("MAILBOX CAPACITY: "+ capacity);
    }
}
