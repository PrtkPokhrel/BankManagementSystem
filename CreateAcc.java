import java.util.Scanner;
import java.lang.Math;

public class CreateAcc {

    public static void main(String[] args) {
        // defining objects
        Scanner scan = new Scanner(System.in);
        AccCreate accCreate = new AccCreate();

        // getting user input
        System.out.print("Enter your first name: ");
        accCreate.firstName = scan.nextLine();
        System.out.print("Enter your middle name if not leave blank: ");
        accCreate.middleName = scan.nextLine();
        System.out.print("Enter your last name: ");
        accCreate.lastName = scan.nextLine();
        System.out.println("Your full name is: "
                + accCreate.fullname(accCreate.firstName, accCreate.middleName, accCreate.lastName));

        

        scan.close(); // scan close
    }
}

// class starts here

// class for creating users first account
class AccCreate {

    String firstName;
    String middleName;
    String lastName;
    int age;
    StringBuilder temHolder=new StringBuilder();
    private StringBuilder accNumber = new StringBuilder();
    // accNumber=temHolder;

    // method to return full name.
    public String fullname(String firstName, String middleName, String lastName) {
        if (middleName.isEmpty()) {
            return firstName + " " + lastName;
        } else {
            return firstName + " " + middleName + " " + lastName;
        }
    }

    // method to generate a account number
    public void autoAccNumber() {

        for (int i = 0; i < 10; i++) {
            int accDigit = 10;
            double random = Math.random();
            random = random * accDigit;
            random = Math.floor(random);
            temHolder.append(random);

        }

    
    }

}

// left on: was generating random 10digit accont number stuck in displaying generated number
