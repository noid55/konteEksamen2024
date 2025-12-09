public class Referendum {
    private String description;
    private int year;
    private int nrOfYes;
    private int nrOfNo;

    public Referendum(String description, int year) {
        this.year = year;
        this.description = description;
    }

    public Referendum(String description, int year, int nrOfYes, int nrOfNo) {
        this.description = description;
        this.year = year;
        this.nrOfYes = nrOfYes;
        this.nrOfNo = nrOfNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNrOfYes() {
        return nrOfYes;
    }

    public void setNrOfYes(int nrOfYes) {
        if (nrOfYes < 0) {
            //Her har jeg bare satt det til -1 som en feilmelding til systemet (slik at man kan programmere inn en event hvis verdien blir -1 f.eks)
            //Det kan være vanskligre å se at noe har gått galt hvis verdien bare er 0, kanskje alle i befolkningen stemte det samme?
            //Det holder å bare sette verdien til 0 eller lignenede, poenget er å vise at du kan validere input antar jeg, uansett hvis du gjør som meg å setter -1 f.eks så forklar hvorfor i en kommentar, hvis ikke bare sett 0
            //Her kunne man også korrigert resultatet om antallet er høyere enn Norges befolkning men jeg tenker det er litt utenfor hva oppgaven forventer (og også vanskelig å sjekke uten internett)
            this.nrOfYes = -1;
        } else {
            this.nrOfYes = nrOfYes;
        }
    }


    public int getNrOfNo() {
        return nrOfNo;
    }

    public void setNrOfNo(int nrOfNo) {
        //Her har jeg bare satt det til -1 som en feilmelding til systemet (slik at man kan programmere inn en event hvis verdien blir -1 f.eks)
        //Det kan være vanskligre å se at noe har gått galt hvis verdien bare er 0, kanskje alle i befolkningen stemte det samme?
        //Det holder å bare sette verdien til 0 eller lignenede, poenget er å vise at du kan validere input antar jeg, uansett hvis du gjør som meg å setter -1 f.eks så forklar hvorfor i en kommentar, hvis ikke bare sett 0
        //Her kunne man også korrigert resultatet om antallet er høyere enn Norges befolkning men jeg tenker det er litt utenfor hva oppgaven forventer (og også vanskelig å sjekke uten internett)
        if (nrOfNo < 0) {
            this.nrOfNo = -1;
        } else {
            this.nrOfNo = nrOfNo;
        }

    }


    public boolean getResult() {
        return nrOfNo < nrOfYes;
    }

    @Override
    public String toString() {
        String yesOrNo;
        int totalVotes = getNrOfNo() + getNrOfYes();
        double percentYes = (double) getNrOfYes() / totalVotes;
        double percentNo = (double) getNrOfNo() / totalVotes;

        if (getResult()) {
            yesOrNo = "Ja";
        } else {
            yesOrNo = "Nei";
        }
        return getDescription() + getYear() + " konkluderte med et " + yesOrNo +
                " Resultat var som følgende: Ja " + getNrOfYes() + "(" + percentYes + ")" +
                "and Nei " + getNrOfNo() + "(" + percentNo + ")";
    }

    static void main() {
        Referendum vote1 = new Referendum("Norges første folkeavstemning om norges tilslutning til EU i ", 1972);
        vote1.setNrOfNo(1118281);
        vote1.setNrOfYes(971687);

        Referendum vote2 = new Referendum("Norges andre folkeavstemning om norges tilslutning til EU i ", 1994);
        vote2.setNrOfYes(1389448);
        vote2.setNrOfNo(1517348);

        System.out.println(vote1);
        System.out.println(vote2);
    }
}
