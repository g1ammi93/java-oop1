package exercises.oop.javaBank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(3695, "Pippo");
        System.out.println(account1);


        System.out.println("Numero conto: " + account1.getAccountNumber());
        System.out.println("Nome proprietario precedente: " + account1.getAccountOwnerName());
        account1.setAccountOwnerName("Zio Paperone");
        System.out.println("Nome proprietario successivo: " + account1.getAccountOwnerName());
        System.out.println("Saldo del conto: " + account1.getAccountBalance());

        account1.deposit(290.50);
        System.out.println(account1.getAccountBalance());

        // metodi per prelevare
        account1.withdraw(500);
        account1.withdraw(30.5);
        System.out.println(account1.getAccountBalance());

        System.out.println(account1.getAccountInfo());

        // saldo
        System.out.println(account1.getFormattedBalance());


        Scanner scanner = new Scanner(System.in);

        int userAccountNumber;
        String userName;
        System.out.println("Inserisci il tuo nome: ");
        userName = scanner.nextLine();
        Random random = new Random();
        BankAccount userAccount = new BankAccount(random.nextInt(1,1000), userName);
        System.out.println(userAccount.getAccountInfo());


        while(true) {
            System.out.println("*************************************");
            System.out.println("Il tuo saldo attuale è: " + userAccount.getFormattedBalance());
            System.out.println("Scegli l'operazione: ");
            System.out.println("Versare una somma (Scrivi 1); ");
            System.out.println("Prelevare una somma (Scrivi 2); ");
            System.out.println("Esci (Scrivi 0)");
            String option = scanner.nextLine();



            if (option.equals("0")) {
                break;
            } else if (option.equals("1")) {
                System.out.println("Quanto vuoi depositare?");
                double depositValue = Double.parseDouble(scanner.nextLine());

                if(depositValue >= 0 ) {
                    userAccount.deposit(depositValue);
                    System.out.println(String.format("Hai depositato: %.2f€. ", depositValue));
                } else {
                    System.out.println(String.format("L'operazione non è andata a buon fine, %.2f non è un numero valido. ", depositValue));
                }

            } else if (option.equals("2")) {
                System.out.println("Quanto vuoi prelevare?");
                double withdrawValue = Double.parseDouble(scanner.nextLine());

                if(withdrawValue >= 0 ) {
                    if(withdrawValue >= userAccount.getAccountBalance()) {
                        System.out.println("Errore, non hai abbastanza soldi sul conto");
                    } else {
                        userAccount.withdraw(withdrawValue);
                        System.out.println(String.format("Hai prelevato: %.2f€. ", withdrawValue));
                    }
                } else {
                    System.out.println(String.format("L'operazione non è andata a buon fine, %.2f non è un numero valido. ", withdrawValue));
                }
            }

        }



        scanner.close();

    }
}