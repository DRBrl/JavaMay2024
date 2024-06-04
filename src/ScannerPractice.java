import java.util.Scanner;
public class ScannerPractice {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your First name : ");
        String fName = obj.next();

        System.out.println("Enter your Middle name : ");
        String mName = obj.next();

        System.out.println("Enter your Last name");
        String lName = obj.next();

        System.out.println("Enter your phone number");
        String pNum = obj.next();

        System.out.println("Enter your address : ");
        String Add = obj.next();

        System.out.println("Enter your salary : ");
        String Sal = obj.next();

        System.out.println("User registered successfully, here are the details : \n"+"Firstname: "+fName+"\n"+"Middle name : "+mName+"\n"+"Last name: "+lName+"\n"+"Phone number : "+pNum+"\n"+"Address : "+Add+"\n"+"Salary : "+Sal);

    }
}


/*task:
1.create a user app
User registration
1. First name
2. middle name
3. last name
4.Phone
5. Address
6. SAlary

print all the details

User registered successfully and here are the details:
1. First name
2. middle name
3. last name
4.Phone
5. Address
6. SAlary
 */