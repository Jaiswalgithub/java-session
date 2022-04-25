package day5.encapsulation;

public class Bank {

    public static void main(String args[]){
        Account account1 = new Account();
 //       account1.name = "Aishwarya";
        account1.setName("Aishwarya");
 //       account1.accountNumber = "jsdghsgjg";
        account1.setAccountNumber("jsdghsgjg");
 //       account1.accountType = "AccountType.STUDENT";
        account1.setAccountType(AccountType.STUDENT);
 //       account1.accountBalance = "345465";
        account1.setAccountBalance(345465);
 //       account1.socialSecurityNumber = "fhgjdhjgh";
        account1.setSocialSecurityNumber("fhgjdhjgh");

        System.out.println("Name:" +account1.getName());
        System.out.println("AccountNumber:" +account1.getAccountNumber());
        System.out.println("AccountType:" +account1.getAccountType());
        System.out.println("Account Balance:" +account1.getAccountBalance());
 //     System.out.println("SSN:" +account1.getSocialSecurityNumber());(encapsulation provides protection)

        Account account2 = new Account();
//        account2.name = "Taman";
        account2.setName("Tamanasd");
//        account2.accountNumber = "asdasdasd231";
        account2.setAccountNumber("asddasd231");
//        account2.accountType = AccountType.STUDENT;
        account2.setAccountType(AccountType.STUDENT);
//        account2.accountBalance = 20000;
        account2.setAccountBalance(2000);
//        account2.socialSecurityNumber = "tsh441144";
        account2.setSocialSecurityNumber("tsh451144");

        account1.transferBalance(account1, account2, 500);
    }
}
