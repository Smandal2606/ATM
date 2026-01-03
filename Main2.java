import java.util.Scanner;

class Atm{
    float Balance;
    int PIN = 4512;

    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == PIN){
           menu();
        } else {
            System.out.println("Enter a valid pin");
              menu();
        }
    }

        public void menu(){
            System.out.println("Enter your Choice: ");
            System.out.println("1. Check A/C Balance ");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. EXIT");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            if(opt == 1){
                CheckBalance();

            } else if(opt == 2){
                WithdrawMoney();
            } else if (opt == 3){
                depositMoney();
            } else if(opt == 4){
                return;
            } else {
                System.out.println("Enter a valid choice");
            }
        }

        public void CheckBalance(){
            System.out.println("Balance: " + Balance);
            menu();
        }

        public void WithdrawMoney(){
            System.out.println("Enter Amount to Withdraw: ");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            if(amount > Balance){
                System.out.println("Insufficient Balance");
            } else {
                Balance = Balance - amount;
                System.out.println("Money Withdrawl Sucessful");

                menu();
            }
           
        }
       

        public void depositMoney() {
            System.out.println("Enter the amount: ");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            Balance = Balance + amount;
            System.out.println("MOney Deposited Sucessfully");
            menu();
            sc.close();
        }

     }




public class Main2 {
    public static void main(String[] args) {
        Atm a = new Atm();
         a.checkpin();

    }
    
}
