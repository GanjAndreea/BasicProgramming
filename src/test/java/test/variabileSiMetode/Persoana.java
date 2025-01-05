package test.variabileSiMetode;

import org.testng.annotations.Test;

public class Persoana {

    //O clasa in Java este o structura care defineste atat atributele cat si metodele unui obiect
    //Atributele = variabile

    //Tipuri de date in Java:

    //1.primitive - stocheaza direct valorile in variabila :
    //1.1.int - numere intregi (32 biti)
    //1.2.double - numere cu zecimale
    //1.3.char - caractere individuale ('a') - se foloseste o singura ghilimea si inainte si dupa
    //1.4.boolean - valori logice true/false
    //1.5.byte - numere intregi (8 biti)
    //1.6.short - numere intregi (16 biti)
    //1.7.long - numere intregi (64 biti)

    //1.8.float - numere zecimale dar precizia este mai mica decat la double
    //2.Tipuri de referinta - stocheaza doar referinta catre un obiect
    //2.1.string (sir) - sir de caractere
    //2.2.integer - o clasa care invaluieste/wrapper tipul de date int

    // Variabile globale:

    String nume = "Popescu";    // variabila globala de tip string
    String prenume = "Ion";    // variabila globala de tip string
    char sexul = 'M';         // variabila globala de tip char
    int anulNasterii = 2004;  // variabila globala de tip int

    @Test

    public void afisarePersoana () {
        System.out.println("Numele persoanei este : " + nume);
        System.out.println("Prenumele persoanei este : " + prenume);
        System.out.println("Anul nasterii persoanei este : " + anulNasterii +  " si sexul este: " + sexul);
    }

    @Test

    public void afisareDetaliiPersoana (){
        double inaltime = 1.80;
        int greutate = 80;
        System.out.println("Persoana are inaltimea de : " + inaltime);
        System.out.println("Persoana are greutatea de : " + greutate);
        System.out.println("Numele persoanei este : " + nume + " Persoana are inaltimea de : " + inaltime );
    }

    // O metoda este un bloc de cod care indeplineste o functie specifica
    //Metodele sunt de 2 tipuri : cu void sau cu return
    // Void nu returneaza nimic
    //Return returneaza un tip de date: int,string,boolean...
    // La return in loc de public void va fi public int/public string/public boolean ,iar la sfarsit inainte de ultima acolada trebuie
    // sa fie un return, iar acestea trebuie sa returneze valoarea declarata initial

    public int calculVarsta(){
        return 2018 - anulNasterii;
    }

    public boolean esteAdult (int varsta){
        return varsta > 18;
    }

    @Test
    public void afisareDatePersoana (){
        int varstaReala = calculVarsta();
        System.out.println("Varsta calculata a persoanei este de : " + calculVarsta() + " ani ");
        System.out.println("Persoana este adult ? " + esteAdult(varstaReala));
    }
}
