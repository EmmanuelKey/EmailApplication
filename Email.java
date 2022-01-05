import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class Email {
    private static Scanner input = new Scanner(System.in);
    private static Random r = new Random();
    private static String dept;
    private static String Firstname;
    private static String Lastname;
    private static String password;
    private static char  randomChar;
    private static int mailboxCapacity;
    private static String email;
    private static String fullName;
    private static String cName = "KeyTech";

    public Email(String Firstname, String Lastname){
    this.dept = getDept();
    String password = "d";
    char randomChar = 'e';
    int mailboxCapacity = 0;
    String email = "";
    //String cName = "Key Tech";
    this.Firstname = Firstname;
    this.Lastname = Lastname;
    }
    /**
     * This method returns the object's first name, in all capital letters
     *
     * @returns the object's first name, in all capital letters
     */
    public static String getFirstName(){
        return Firstname.toUpperCase();
    }

    /**
     * This method returns the object's last name, in all capital letters
     *
     * @returns the object's last name, in all capital letters
     */
    public static String getLastName(){
       return Lastname.toUpperCase();

    }

    /**
     * This method asks for the user's department. If the user enters anything else besides the available options,
     * (sales, development, accounting, blank line for nonw), then the user will constantly get
     * prompted until a valid department is inpu.
     *
     * @returns the string of the department value
     */
    public static String getDept(){
       System.out.println("What is your department? If none, enter a blank line");
       String dept = input.nextLine();
       if(dept.equals("")){
           return "none";
       }
       while(!dept.equals("sales")&& !dept.equals("development")&&!dept.equals("accounting")){
           System.out.println("ERROR: Please enter a proper department. Check for typos.");
           System.out.println("What is your department? If none, enter a blank line");
            dept = input.nextLine();
       }
        if(dept.equals("")){
            return "none";
        }
        else {
            return dept;
        }
    }
    /**
     * This method creates an email with the all of the user's information(first name, last name, department, company name)
     *
     * @returns the string of the newly created email
     */
    public static String createEmail(){
        String email = Firstname.toLowerCase() + Lastname.toLowerCase()+ "@" + findDept() + "."+ cName+".com";
        return email;
    }
    /**
     * This method creates a random password that's 10 random chars long
     *
     * @returns the string of the random password
     */
    public static String makePassword(){
        for(int i = 0;i<10;i++){
            //making random password, with 8 random letters
            randomChar = (char) ('a' + r.nextInt(26));
            password += randomChar;
        }
        return password;
    }

    /**
     * This method sets the capacity of the mailbox of the email
     *
     * @returns the capacity of the mailbox
     */
    public static int setMailboxCapacity(){
        System.out.println("What do you want your mailbox capacity to be?");
        mailboxCapacity = input.nextInt();
        return mailboxCapacity;
    }
    /**
     * @returns the email address string
     */
    public static String getEmail(){

        return email;
    }
    /**
     * @returns the capacity of the mailbox as an integer
     */
    public static int getMailboxCapacity(){
        return mailboxCapacity;
    }
    /**
     * @returns the department as a string
     */
    public static String findDept(){
        return dept;
    }
}
