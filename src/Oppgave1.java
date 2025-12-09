public class Oppgave1 {

    public void investigateNumbers(int[] numbers){

        //Jeg antar at oppgaven sikter til Try/catch når de sier at metoden ikke skal kaste unntakk når den er i bruk
        //Synes kanskje det er en litt merkelig tilnærming da det er vanskelig å ødelegge metoden her med feil insendt informasjon og slikt
        //Men uten sensurveiledning er det vanskelig for meg å si akkurat hva som er tenkt.
        //Denne oppgaven er uansett ganske lik oppgave1 i eksamen 2024, så eventuelt se på kommentarene mine der eller readme filen for tanker og slikt rundt oppgaven.
        try {
            int biggerThanZero = 0;
            int lessThanZero = 0;
            int equalsZero = 0;
            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    biggerThanZero++;
                } else if (numbers[i] == 0) {
                    equalsZero++;
                } else {
                    lessThanZero++;
                }
                sum += numbers[i];
            }
            System.out.println("Antall tall større en null: " + biggerThanZero);
            System.out.println("Antall tall mindre enn null: " + lessThanZero);
            System.out.println("Antall tall lik null: " + equalsZero);
            System.out.println("Summen av alle tallene i arrayet er lik: " + sum);
        } catch (Exception e) {
            System.out.println("Her har det skjedd noe rart med tallene som ble sendt inn");
        }
    }

    static void main() {
        int[] intArray = {1, 2, 0, 0, -3, - 5, 3, 10, 2};
        Oppgave1 test = new Oppgave1();
        test.investigateNumbers(intArray);
    }
}
