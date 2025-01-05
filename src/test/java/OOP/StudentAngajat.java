package OOP;

public class StudentAngajat extends Persoana implements StudentInterface, AngajatInterface{

    private String facultate;
    private boolean bursa;
    private String cursuri;

    private String Companie;
    private String Profesie;
    private int Vechime;

    public StudentAngajat(String nume, String prenume, int varsta, String facultate, boolean bursa, String cursuri, String companie, String profesie,int vechime) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.bursa = bursa;
        this.cursuri  = cursuri;
        this.Companie = companie;
        this.Profesie = profesie;
        this.Vechime = vechime;
    }

    @Override
    public void mergeLaLucru() {
        System.out.println("Dupa cursuri merge la lucru");
    }

    @Override
    public void munceste() {
        System.out.println("El munceste doar 4 ore");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("La fiecare 2 saptamani este platit");
    }

    @Override
    public void isiDaDemisia() {
        System.out.println("Cand face bani de petreceri isi da demisia");
    }

    @Override
    public void mergeLaCursuri() {
        System.out.println("Mai merge la cursuri de plictiseala");
    }

    @Override
    public void sustineExamene() {
        System.out.println("sustine examene pentru care nu invata");
    }

    @Override
    public void mergeLaPetreceri() {
        System.out.println("Nu are timp, dar nici bani de petreceri");
    }
}
