public class ReferendumYesNo extends ReferendumBSuper{
    private int nrOfYes;
    private int nrOfNo;


    public ReferendumYesNo(String description, int year, int nrOfYes, int nrOfNo) {
        super(description, year);
        this.nrOfYes = nrOfYes;
        this.nrOfNo = nrOfNo;
    }
}
