import java.util.Random;
import java.util.Scanner;

public class User {

    public void run() {

        // Variabler för att spara användarens uppgifter
        String savedFullName = null;
        String savedPinCode = null;

        // Variabel som genererar ett slumpmässigt kontonummer
        Random random = new Random();
        int accountNumber = random.nextInt(1000000);
        // Variabel för bankkonto med 5000 SEK i saldo
        double bankAccount = 5000;

        // Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("==== Skapa användare ====");

        // Läser in användarens uppgifter
        System.out.print("Förnamn: ");
        String firstName = in.nextLine();

        System.out.print("Efternamn: ");
        String lastName = in.nextLine();

        System.out.print("Önskad pinkod: ");
        String pinCode = in.nextLine();

        // Sparar användarens uppgifter
        savedFullName = firstName + " " + lastName;
        savedPinCode = pinCode;

        // Skriver ut användarens alla uppgifter
        System.out.println("==============================");
        System.out.println("Användare skapad!");
        System.out.println("Fullständigt namn: " + savedFullName);
        System.out.println("Pinkod: " + savedPinCode);
        System.out.println("Ditt kontonummer: " + accountNumber);
        System.out.println("Saldo: " + bankAccount);
        System.out.println("==============================");

    }
}
