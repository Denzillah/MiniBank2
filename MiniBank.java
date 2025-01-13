import java.util.Random;
import java.util.Scanner;

// Paketprivat klass
class MiniBank {

    // Läser in användarens uppgifter
    private User currentUser;

    // Metod för att köra klassen från main
    public void run() {

        // Variabel för bankkonto med 5000 SEK i saldo
        double bankAccount = 5000;

        // Scanner
        Scanner in = new Scanner(System.in);

        // Variabler för att spara användarens uppgifter
        String savedFullName = null;
        String savedPinCode = null;

        // Menyn
        while (true) {
            System.out.println("\n========== MINIBANK ==========");
            System.out.println("Du kan nu göra följande val:");
            System.out.println("1. Skapa användare");
            System.out.println("2. Logga in");
            System.out.println("3. Avsluta");
            System.out.println("==============================");

            System.out.print("Ange ditt val: ");
            String input = in.nextLine();

            // Menyval 1 (Skapa användare)
            if (input.equals("1")) {
                currentUser = new User();
                currentUser.createUser(in);
                savedFullName = currentUser.getFullName();
                savedPinCode = currentUser.getPinCode();
            }

            // Menyval 2 (Logga in)
            else if (input.equals("2")) {
                if (savedFullName == null || savedPinCode == null) {
                    System.out.println("Ingen användare har skapats ännu. Vänligen skapa en användare först.");
                    continue;
                }

                System.out.print("\nAnge ditt fullständiga namn: ");
                String enteredFullName = in.nextLine();

                System.out.print("Ange din pinkod: ");
                String enteredPinCode = in.nextLine();

                // Kontroll av rätt namn och pinkod som användaren har skapat
                if (enteredFullName.equals(savedFullName) && enteredPinCode.equals(savedPinCode)) {
                    System.out.println("Inloggning lyckades!");
                    System.out.println("\nVälkommen " + enteredFullName);
                    System.out.println("Kontonummer: " + currentUser.getAccountNumber());
                    System.out.println("Ditt saldo är " + bankAccount + " SEK.");
                } else {
                    System.out.println("Fel namn eller pinkod. Försök igen!");
                }
            }

            // Menyval 3 (Avsluta)
            else if (input.equals("3")) {
                System.out.println("\nAvslutar MiniBank. Välkommen åter!");
                break;

            }
            // Vid ogiltigt val
            else {
                System.out.println("\nOgiltigt val. Försök igen.");
            }
        }
        // Stänger scannern
        in.close();
    }
}
