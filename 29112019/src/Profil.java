public class Profil {


    private String username;
    private String adresse;
    private MayBeBaby alter;
    private MayBeBaby gehalt;
    private Profil besterFreund;
    private MayBeBaby status;


    public Profil(String username, String adresse, int alter, double gehalt, int status) {
        this.username = username;
        this.adresse = adresse;
        this.alter = new MayBeBaby<Integer>(alter,3);
        this.gehalt = new MayBeBaby<Double>(gehalt, status);
    }

    public void changePrivacy(int status)
    {
        gehalt.setStatus(status);
    }


    public void gibUser()
    {
        System.out.println("User: " + username);
        System.out.println("Adresse: " + adresse);
        System.out.println("Alter: " + alter);
        System.out.println("gehalt: ");
        gehalt.print();

        if(besterFreund != null) {
            System.out.println("Unser bester Freund: ");
            besterFreund.gibUser();
        }
    }



    public String getUsername() {
        return username;
    }

    public String getAdresse() {
        return adresse;
    }
/*
    public int getAlter() {
        return alter;
    }
 */
/*
    public MayBeBaby getGehalt() {
        return gehalt;
    }
*/
    public Profil getBesterFreund() {
        return besterFreund;
    }

    public void setAlter(int alter) {
        this.alter = new MayBeBaby<Integer>(alter,3);
    }

    public void setGehalt(double gehalt) {
        this.gehalt = new MayBeBaby<Double>(gehalt,3);
    }

    public void setBesterFreund(Profil besterFreund) {
        this.besterFreund = besterFreund;
    }


}
