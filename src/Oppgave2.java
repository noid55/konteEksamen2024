public class Oppgave2 {

    //Jeg har valgt å lage den static for å gjøre det enklere, slipper å opprette objekt for å kjøre metoden.
    //Se eksamen2024 Readme.md filen min for en nærmere forklaring på både static og private. https://github.com/noid55/exam2024Demo
    public static String windPrediction(int knot, int probability){
        String windStrength;

        //Denne tar for seg edge casene som oppgaven spør etter, hvis knot er lavere enn 0,
        // eller sannsynligheten er utenfor rekkeviden så sender den en "feilmelding"
        //Når kriterene blir oppnådd så går den inn her først, og returnerer feilmeldingen, når noe returner så avsluttes metoden også.
        if (knot < 0 || probability < 0 || probability > 2){
            return "Kan ikke beskrive vinden, ugyldig input til metoden";
        }

        //Kunne også brukt <= og senket vind verdien med en, ala if (knot <= 3)
        //Synes denne oppgaven er litt "knotete" med alle else if'ene, kan godt hende det finnes bedre måter å løse på men det er slik jeg valgte å gjøre det.
        if(knot < 1){
            windStrength = "stille";
        }
        else if (knot < 4) {
            windStrength = "flau wind";
        }
        else if(knot < 7){
            windStrength = "svak vind";
        }
        else if (knot < 11){
            windStrength = "lett bris";
        }
        else if(knot < 17){
            windStrength = "laber bris";
        }
        else if(knot < 22){
            windStrength = "frisk bris";
        }
        else if(knot < 28){
            windStrength = "liten kuling";
        }
        else if(knot <34){
            windStrength = "stiv kuling";
        }
        else if(knot <41){
            windStrength = "sterk kuling";
        }
        else if(knot < 48){
            windStrength = "liten storm";
        }
        else if (knot < 56){
            windStrength = "full storm";
        }
        else if(knot < 64){
            windStrength = "sterk storm";
        }
        else{
            windStrength = "orkan";
        }

        if(probability == 0){
            return "Stor sjanse for " + windStrength;
        }
        else if(probability == 1){
            return "Medium sjanse for " + windStrength;
        }
        else{
            return "Usikkert, men det kan bli " + windStrength;
        }


    }

    static void main() {
        System.out.println( Oppgave2.windPrediction(20, 2));
    }

}
