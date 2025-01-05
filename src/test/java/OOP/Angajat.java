package OOP;

public class Angajat extends Persoana implements AngajatInterface{

    private String Companie;
    private String Profesie;
    private int Vechime;

    public Angajat(String nume, String prenume, int varsta,String companie, String profesie,int vechime) {
        super(nume, prenume, varsta);
        this.Companie = companie;
        this.Profesie = profesie;
        this.Vechime = vechime;
    }

    public void infoAngajat (){
        infoPersoana();
        System.out.println("Angajatul " + getNume() + " lucreaza la compania " + Companie);
        System.out.println("Angajatul " + getNume() + " are profesia " + Profesie);
        System.out.println("Angajatul " + getNume() + " are vechimea de  " + Vechime + " ani");
    }

    //Polimorfism dinamic
    public void mananca(){
        System.out.println("Angajatul mananca in pauza de masa");
        super.mananca();
    }

    public void programLucru(){
        System.out.println("Angajatul lucreaza 8 ore standard");
    }

    public void programLucru(int numarOre){
        System.out.println("Angajatul part-time lucreaza " + numarOre + " ore");
    }

    public void programLucru (String locatie){
        System.out.println("Testerul lucreaza " + locatie);
    }

    public void programLucru (boolean lucreazaInWeekend){
        System.out.println("Angajatul disperat lucreaza/nu lucreaza in weekend " + lucreazaInWeekend);
    }

    public String getCompanie() {
        return Companie;
    }

    public String getProfesie() {
        return Profesie;
    }

    public int getVechime() {
        return Vechime;
    }

    public void setCompanie(String companie) {
        Companie = companie;
    }

    public void setProfesie(String profesie) {
        Profesie = profesie;
    }

    public void setVechime(int vechime) {
        Vechime = vechime;
    }

    @Override
    public void mergeLaLucru() {
        System.out.println("Angajatul merge la lucru");
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul se preface ca munceste");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste salariu lunar");
    }

    @Override
    public void isiDaDemisia() {
        System.out.println("Angajatul s-a saturat si isi da demisia");
    }
}
