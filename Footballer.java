public class Footballer {

    private String fName;
    private int fAge;
    private String fPosition;
    private String fTier;
    private double fFee;
    private double fSalary;


    public Footballer(String fName, int fAge, String fPosition, String fTier, double fFee, double fSalary) {
        this.fName = fName;
        this.fAge = fAge;
        this.fPosition = fPosition;
        this.fTier = fTier;
        this.fFee = fFee;
        this.fSalary = fSalary;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getfAge() {
        return fAge;
    }

    public void setfAge(int fAge) {
        this.fAge = fAge;
    }

    public String getfPosition() {
        return fPosition;
    }

    public void setfPosition(String fPosition) {
        this.fPosition = fPosition;
    }

    public String getfTier() {
        return fTier;
    }

    public void setfTier(String fTier) {
        this.fTier = fTier;
    }

    public double getfFee() {
        return fFee;
    }

    public void setfFee(double fFee) {
        this.fFee = fFee;
    }

    public double getfSalary() {
        return fSalary;
    }

    public void setfSalary(double fSalary) {
        this.fSalary = fSalary;
    }

    public static void footballerBio(Footballer footballer) {
        System.out.println("\n***********");
        System.out.println("Player's name : " + footballer.getfName());
        System.out.println("Player's age : " + footballer.getfAge());
        System.out.println("Player's position : " + footballer.getfPosition());
        System.out.println("Player's tier : " + footballer.getfTier());
        System.out.println("Player's transfer fee : " + footballer.getfFee());
        System.out.println("Player's annual salary : " + footballer.getfSalary());
        System.out.println("***********\n");
    }


}
