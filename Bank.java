import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        while(true){
            int userInput;
            System.out.println("Welcome to the bank");
            System.out.println("1. Create an account: ");
            System.out.println("2. Deposit balance");
            System.out.println("3. Withdraw money");
            System.out.println("4. Delete account");
            System.out.println("5. Update account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            userInput=scan.nextInt();
try{
            if(userInput!=1 && userInput!=2 && userInput!=3 && userInput!=4 && userInput!=5 && userInput!=6){
                
            }
        }
        catch(){    
            System.out.println("\nPlease enter correct number");

        }
             if(userInput==1){

            }
            else if(userInput==2){

            }
            else if(userInput==3){

            }
            else if(userInput==4){

            }
            else if(userInput==5){

            }
            else if(userInput==6){
                System.out.println("\nThank you");
break;
            }
            
        }
        scan.close();
        
    }
}

