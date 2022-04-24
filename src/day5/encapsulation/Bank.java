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
    }
}
