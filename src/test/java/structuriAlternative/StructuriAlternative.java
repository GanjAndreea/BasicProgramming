package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structurile alternative = conditii
    //If este o structura de control care este folosita pentru a evalua o conditie booleana si pentru a executa un anumit bloc de cod
    // daca aceasta conditie este adevarata
    // if (conditia){
    //bloc de cod care se executa daca conditia e adevarata
    // } else {
    //bloc de cod care se executa daca conditia este falsa
    // }

    @Test
    public void metodaDeTest() {
        verificareNumar(4);
        verificareNumar(-1);
        verificareNumar(0);
        verificareNumar(9);
        verificareNumar(-12);
        afisareZileSaptamana(5);
        afisareZileSaptamana(8);
    }

    public void verificareNumar(int numar) {
        if (numar > 0) {
            if (numar % 2 == 0) {
                System.out.println("Numarul " + numar + " este par pozitiv");
            } else {
                System.out.println("Numarul " + numar + " este impar pozitiv");
            }
        } else if (numar < 0) {
            if (numar % 2 == 0) {
                System.out.println("Numarul " + numar + " este par negativ");
            } else {
                System.out.println("Numarul " + numar + " este impar negativ");
            }
        } else {
            System.out.println("Numarul " + numar + " este egal cu 0");
        }
    }

    //Switch este o structura de control care permite evaluarea si executarea unuia dintre mai multe blocuri de cod in functie de
    // valoarea expresiei evaluate
    //Se foloseste la selectia unui caz din mai multe situatii
    // switch (expresia de evaluat) {
    //      case valoare1 :
    //            bloc de cod care se executa in cazul in care expresia are valoare1
    //            break;
    //      case valoare2 :
    //            bloc de cod care se executa in cazul in care expresia are valoare2
    //            break;
    //      default :
    //            bloc de cod care se executa in cazul in care expresia nu se potriveste in niciunul din cazurile de mai sus
    //            break;
    // }

    public void afisareZileSaptamana (int zi){
        switch (zi){
            case 1:
                System.out.println("Astazi este luni");
                break;
            case 2:
                System.out.println("Astazi este marti");
                break;
            case 3:
                System.out.println("Astazi este miercuri");
                break;
            case 4:
                System.out.println("Astazi este joi");
                break;
            case 5:
                System.out.println("Astazi este vineri");
                break;
            case 6:
                System.out.println("Astazi este sambata");
                break;
            case 7:
                System.out.println("Astazi este duminica");
                break;
            default:
                System.out.println(zi + " Nu este o zi a saptamanii");
                break;
        }
    }


}
