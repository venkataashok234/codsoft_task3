import java.util.*;
class BankAccount{
       Scanner sc = new Scanner(System.in);
       int balance ;
        public BankAccount(int balance){
           this.balance = balance ;
       }
       public  void deposit(int amount){
           balance += amount;
           System.out.println("The amount "+amount+" is deposited into the account suceessfully");
           System.out.println("Do you want to check your balance if yes enter true else false");
           boolean flag = sc.nextBoolean();
           if(flag == true){
               checkBalance();
           }
       }
       public void withdraw(int amount){
           if(amount <= 0){
               System.out.println("Invalid amount , Please enter the positive value.");
           }
           else if(amount >  balance){
               System.out.println("Sorry ! Insufficent funds .");
           }
           else{
               balance -= amount;
               System.out.println("The amount "+amount+" is withdrawed from the  account suceessfully");
           }
           
           System.out.println("Do you want to check your balance if yes enter true else false");
           boolean flag = sc.nextBoolean();
           if(flag == true){
               checkBalance();
           }
       }
       public void checkBalance(){
           System.out.println("The Balance amount is :"+balance);
       }
    
   
    }
    class ATM{
    private BankAccount ua;
        public ATM(BankAccount ua){
            this.ua = ua;
        }
        public void deposit(int amount){
            ua.deposit(amount);
        }
        public void withdraw(int amount){
            ua.withdraw(amount);
        }
        public void checkBalance(){
            ua.checkBalance();
        }
    }
public class Task3 {
    
public static void main(String []args){
        Scanner s = new Scanner(System.in);
       
        System.out.println("Enter the name of the user :");
        String name=s.next();
        
        System.out.println("Enter the Account number of bank account:");
        int ac =s.nextInt();
        
        System.out.println("Enter the Password");
        int pass =s.nextInt();
        int IntialBalance = 1000;
        Task3 t = new Task3();
        BankAccount ua =new BankAccount(IntialBalance);
        ATM atm= new ATM( ua);
        System.out.println("Mr/Mrs  "+name+" Welcome to the ATM :");
        int amount =0;
        
        boolean flag = true;
        int choice = 1;
        while(flag){
            if(choice == 1){
             
                System.out.println("Enter your choice \n"
                + "1 -->For Previous options\n"
                + "2 -->For deposit \n"
                + "3 -->For withdraw\n"
                + "4 -->For check balance \n"
                + "5 >= -->For Exit\n");
                choice = s.nextInt();
            }
            else if(choice == 2){
                System.out.println("Enter the amount to be deposited :");
                amount =s.nextInt();
                atm.deposit(amount);
                choice = 1;
            }
            else if(choice == 3){
                System.out.println("Enter the amount to be withdrawn :");
                amount =s.nextInt();
                atm.withdraw(amount);
                choice = 1;
            }
            else if(choice == 4){
                atm.checkBalance();
                choice = 1;
            }
            else{
                System.out.println("Bye ! visit Again .");
                flag = false;
            }
        }
        
    }
}
