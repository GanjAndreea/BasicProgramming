package OOP;

public class Persoana {

    //OOP = programare orientata pe obiect (Object oriented programming)
    // 4 principii importante
        //1.mostenirea in JAVA este conceptul prin care o clasa (clasa copil) mosteneste o alta clasa ( clasa parinte)
    //in JAVA se poate mosteni o singura clasa
    //in momentul in care o clasa mosteneste o alta clasa, clasa copil va trebui sa apeleze constructorul din parinte
    //in momentul in care se aplica mostenirea clasa copil are vizibilitate asupra variabilelor/ metodelor din clasa parinte
    //constructorul din clasa parinte spre copil se apeleaza cu "super"
    //in JAVA ca sa extinzi o alta clasa se foloseste cuvantul "extend"

        //2.incapsulare - procesul prin care tinem private anumite informatii in asa fel incat ele nu pot fi modoficate
    //facem variabile/metodele din public in privat
    //privat = acces control care restrictioneaza accesul doar in clasa respectiva, inseamna ca le putem accesa doar in acea clasa
    //pentru a putea extrage/modifica o valoare a unei variabile private ne folosim de metode get(returneaza valoare) si
    // set(poate schimba valoarea)

        //3.polimorfismul este conceptul prin care definim mai multe implementari pentru o metoda
    //Poate fi de doua feluri : puolimorfism static (overloading) si polimorfism dinamic (overriding)
    //Polimorfism dinamic= se foloseste in special la mostenire, intr-o ierarhie de clase obtiunute prin mostenire o metoda poate
    // avea implementari diferite
    //Daca vrem sa chemam in copil metoda din parinte trebuie sa folosim SUPER
    //se face la executie
    //Polimorfism static = posibilitatea prin care o metoda are mai multe implementari prin diferentierea tipului sau nr de parametrii
    //se face la compilare

        //4.abstractizarea presupune expunerea doar a aspectelor esentiale ale unui obiect,ascunzand detaliile implementarii
    //Reduce un element complex la unul mai simplu
    //Se realizeaza prin folosirea claselor abstracte sau a interfetelor
    //Se reduce complet implementarea ramanand doar numele metodelor, parametrii sau tipul returnat
    //Clasele abstracte - utilizate pentru a declara caracteristici comune ale unor subclase
    //O clasa abstracta poate fi utilizata numai ca superclasa pentru alte clase care extind clasa abstracta
    //O clasa abstracta poate avea metode abstracte ( fara implementare ) si metode concrete ( cu implementare )
    //Declaratia une clase abstracte se face cu cuvantul cheie "abstract"
    //O clasa abstracta nu poate fi instantiata

    //Interfetele - un protocol pe care clasele trebuie sa il implementeze, ofera raspuns lipsei mostenirii multiple
    //Intr-o interfata avem o colectie de metode abstracte si constante
    //Interfata contine doar metode abstracte

    private String nume;
    private String prenume;
    private int varsta;

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este " + nume);
        System.out.println("Prenumele persoanei este " + prenume);
        System.out.println("Varsta persoanei este " + varsta);
    }

    //Polimorfism dinamic - prima implementare a metodei
    public void mananca(){
        System.out.println("Persoana mananca cand ii este foame");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
