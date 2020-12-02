
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewAccnt = new Account("Matthews account", 1000);
        Account myAccnt = new Account("My account", 0);
        matthewAccnt.withdrawal(100);
        myAccnt.deposit(100);
        System.out.println(matthewAccnt);
        System.out.println(myAccnt);
    }
}
