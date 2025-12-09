import javax.swing.*;
import java.util.Random;

public class Oppgave3 {
    public static void guessTheNumber() {
        Random numberGen = new Random();
        int guessThisNumber = numberGen.nextInt(100);
        boolean keepGuessing = true;
        int amountOfGuesses = 0;
        //Denne sout'en er bare for å selv kunne se hvilket tall som er riktig og dermed kunne teste uten å måtte gjette 50+ ganger hver gang
        System.out.println(guessThisNumber);

        //Denne metoden blir ganske slem når man putter alt inne i en try / catch, eneste måte å avslutte programmet er gjennom intellij eller ved å gjette riktig.
        //Men det er det oppgaven ber om, så jeg etterfølger "kravspec"
        //Ellers så er det i en try/catch slik at hvis brukeren skriver inn bokstaver eller desimaltall osv så kræsjer ikke programmet men sender heller en feilmelding.
        //Dette er ofte veldig nyttig når man tar brukerinput, og hvis en oppgave ber dere ta brukerinput er det ofte veldig praktisk å unngå kræsjer ved hjelp av en slik. Spesielt hvis man skal bruke parseInt
        //Man kan også validere inputs via settere og konstruktører via if statements og slikt, men denne oppgaven benytter seg ikke av noen av delene så da tolker jeg try/catch som beste fremgangsmåte.
        //Input validering via settere og konstruktører er også vanskelig å forhindre kræsjer med (hvertfall i forhold til dette kurset sitt pensum).
        while (keepGuessing) {
            try {
                int userGuess = Integer.parseInt(JOptionPane.showInputDialog("Gjett et tall mellom 0 og 99"));
                amountOfGuesses++;
                if (userGuess < guessThisNumber) {
                    JOptionPane.showMessageDialog(null, "Tallet du gjettet var for lite");
                } else if (userGuess > guessThisNumber) {
                    JOptionPane.showMessageDialog(null, "Tallet du gjettet var for stort");
                } else {
                    JOptionPane.showMessageDialog(null, "Gratulerer, tallet var " + guessThisNumber + " du trengte " + amountOfGuesses + " antall forsøk");
                    keepGuessing = false;
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Du må skrive inn et tall");
            }

        }


    }

    static void main() {
        Oppgave3.guessTheNumber();
    }
}
