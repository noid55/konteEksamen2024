import java.util.ArrayList;

//Litt vanskelig å tolke akkurat hvordan de forventer en løsning her, men dette er sånn jeg valgte å gjøre det
//Jeg tenker en løsning som bare implementerer ett Array/ArrayList som lagrer stemmer hadde holdt også, tanken er jo mest å løse arv med sub/super klasser og ikke implementere en fungerende løsning.
public class ReferendumMC extends ReferendumBSuper {
    //actualVotes.get[i] representerer optionsToVoteOn.get[i], dvs når du henter ut optionsToVoteOn.get[0] får du ut det de stemte på.
    // f.eks jeg vil ha Pizza i kantina er indeks 0, jeg vil ha kjøttkaker i brunsaus er indeks 1 osv med flere andre matvalg.
    //Og actualVotes er mengder stemmer hvert matvalg fikk. Så hvis vi henter ut stemmer på actualVotes sin indeks 0, betyr det at disse telles opp mot "jeg vil ha pizza i kantina"
    ArrayList<String> optionsToVoteOn;
    ArrayList<Integer> actualVotes;


    //Alternativ med array istede for arraylist
//    String[] arrayOptions;
//    int[] arrayVotes;

    //Bruk av super refererer til klassen som vi "extender" fra, altså ReferndumBSuper
    //Dvs at her instansierer vi konstruktøren fra ReferendumBSuper via dette super(description, year) kallet.
    //Så svaret mitt på 4c ville vært noe sånt som:
    //"Subklassen arver attributtene description og year fra superklassen ReferndumBSuper. Ved å kalle super(description, year),
    //delegeres initaliseringen av disse felles attributtene opp til den eksisterende konstruktøren i ReferendumBSuper"
    public ReferendumMC(String description, int year, ArrayList<String> optionsToVoteOn, ArrayList<Integer> actualVotes) {
        super(description, year);
        this.optionsToVoteOn = optionsToVoteOn;
        this.actualVotes = actualVotes;
    }
}
