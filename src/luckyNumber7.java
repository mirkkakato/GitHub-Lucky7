import java.util.Random;
import java.util.Scanner;

public class luckyNumber7 {

    public static void main(String[] args) {
        Random random = new Random();
        
        Scanner in = new Scanner(System.in);

        int yritykset;
        int seiskat;
        int panos = 10; // Aloitusrahat päätetty valmiiksi ilman käyttäjän syötettä

        System.out.println("Tervetuloa pelaamaan Lucky7-peliä!");

        boolean playAgain = true; 

        while (playAgain) {
            yritykset = 0;
            seiskat = 0;

            while (yritykset < 3) {
                int randomNumber = random.nextInt(10) + 1;
                System.out.println(randomNumber);
                if (randomNumber == 7) {
                    seiskat++;
                }
                yritykset++;
                panos--;
            }

            if (seiskat == 1) {
                System.out.println("Onnea, löysit seiskan!");
                panos += 3;
            } else if (seiskat == 2) {
                System.out.println("Onnea, löysit kaksi seiskaa!");
                panos += 5;
            } else if (seiskat == 3) {
                System.out.println("JACKPOT! Kolme seiskaa!");
                panos += 100;
            } else {
                System.out.println("Hävisit, mikään numero ei ollut 7.");
            }

            System.out.println("Sinulla on tällä hetkellä " + panos + " euroa.");

            if (panos <= 0) {
                System.out.println("Rahasi loppuivat. Heippa!");
                break;
            }
            
            System.out.print("Paina enter jos haluat pelata uudestaan, tai e jos haluat lopettaa: ");
            String playAgainInput = in.nextLine();

            if (playAgainInput.equalsIgnoreCase("e")) {
                break;
            } else {
                playAgain = playAgainInput.isEmpty();
            }

        }

        System.out.println("Kiitos pelaamisesta!");
    }
}
