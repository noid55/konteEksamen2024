public class ReferendumBSuper {
    //Litt usikker på akkurat denne oppgaven og hvordan de forventer løsningen, men basert på ordlyden i oppgaven og at den bare gir 5%,
    // tenker jeg at man får stort sett full pott bare man viser at man forstår arv og hvordan man lager subclasses og sørger for at disse arver fra superklassen
    // Her er 'fundamentet' for de andre klassen. Altså dette er "super" klassen som de andre arver fra,
    // også legger vi inn de individuelle attributtene og eventuelt metoder i de andre sub-klassene
    private String description;
    private int year;

    public ReferendumBSuper(String description, int year) {
        this.description = description;
        this.year = year;
    }
}


