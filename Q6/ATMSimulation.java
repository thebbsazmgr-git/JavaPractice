public class ATMSimulation {
    static void main(String[] args) {
        //  Creating bank account object
        BankAccount acc = new BankAccount(1000);
        //Display initial balance
        System.out.println("Initial balance:"+acc.getBalance());
        //Withdraw money
        acc.withdraw(300);
        //Trying invalid withdrawals
        acc.withdraw(-40);
        acc.withdraw(3000);
        //Final balance
        System.out.println("Final balance:"+acc.getBalance());
    }
}
