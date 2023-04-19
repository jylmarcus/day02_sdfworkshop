package sg.edu.nus.iss;

public class App 
{
    public static void main( String[] args )
    {
        //first test
        BankAccount bAccount1 = new BankAccount("Horation Hornblower", "0001");
        System.out.println(bAccount1.toString());

        //test methods
        bAccount1.deposit(100);
        System.out.println(bAccount1.toString());

        bAccount1.withdraw(100);
        System.out.println(bAccount1.toString());

        bAccount1.deposit(-100); //negative deposit

        bAccount1.withdraw(-100); //negative withdrawal

        bAccount1.withdraw(100f); //over account balance

        bAccount1.setIsClosed(true);

        bAccount1.deposit(100); //deposit into closed account

        bAccount1.withdraw(100); //withdraw from closed account

        for(String transDetails: bAccount1.getTransactions()){
            System.out.println(transDetails);
        }


    }
}
