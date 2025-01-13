import java.util.Random;
import java.util.Scanner;

public class User {
    private String fullName; // Sparar användarens fullständiga namn
    private String pinCode; // Sparar användarens pinkod

    // Variabel som genererar ett slumpmässigt kontonummer
    Random random = new Random();
    int accountNumber = random.nextInt(1000000);

    // Metod för att skapa en användare
    public void createUser(Scanner in) {
        System.out.println("==== Skapa användare ====");

        // Läs in användarens förnamn
        System.out.print("Förnamn: ");
        String firstName = in.nextLine();

        // Läs in användarens efternamn
        System.out.print("Efternamn: ");
        String lastName = in.nextLine();

        // Läs in användarens önskade pinkod
        System.out.print("Önskad pinkod: ");
        pinCode = in.nextLine();

        // Spara det fullständiga namnet
        fullName = firstName + " " + lastName;

        // Bekräftelse till användaren
        System.out.println("Användare skapad!");
        System.out.println("Fullständigt namn: " + fullName);
        System.out.println("Kontonummer: " + accountNumber);
        System.out.println("Pinkod: " + pinCode);
    }

    // Getter för fullständigt namn
    public String getFullName() {
        return fullName;
    }

    // Getter för pinkod
    public String getPinCode() {
        return pinCode;

    }

    // Getter för kontonummer
    public int getAccountNumber() {
        return accountNumber;
    }
}
