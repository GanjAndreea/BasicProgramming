package obiectConstructor;

public class Avion {

    //Constructorul are rolul de a initializa variabilele unei clase
    //Recunoastem costructorul dupa numele clasei- este o metoda speciala care nu are void sau return
    //Intr-o clasa putem avea unul sau mai multi constructori care se diferentiaza dupa numarul sau tipul de parametrii
    //Intr-o clasa exista tot timpul un constructor default ( fara parametrii)
    //Constructorii sunt cu parametrii sau fara parametrii
    //Constructorul trebuie sa fie mereu public

    //Un obiect in Java este o instanta a unei clase
    //Pentru initializare obiect folosim cuvantul "new"
    //In momentul initializarii unui obiect se apeleaza constructorul clasei

    public String tip;
    public String marca;
    public int capacitatePasageri;
    public int anFabricatie;
    public Integer capacitateBagaje;
    public String modelAvion;

    public Avion (String tip, String marca, int capacitatePasageri, int anFabricatie, Integer capacitateBagaje, String modelAvion) {
        this.tip = tip;
        this.marca = marca;
        this.capacitatePasageri = capacitatePasageri;
        this.anFabricatie = anFabricatie;
        this.capacitateBagaje = capacitateBagaje;
        this.modelAvion = modelAvion;
    }

    public void prezentareAvion(){
        System.out.println("Tipul avionului este " + tip);
        System.out.println("Marca avionului este " + marca);
        System.out.println("Capacitatea maxima de pasageri este " + capacitatePasageri);
        System.out.println("Anul fabricatiei este " + anFabricatie);
        System.out.println("Modelul avionului este " + modelAvion);
        if (capacitateBagaje !=null ){
            System.out.println("Capacitatea maxima pentru bagaje este " + capacitateBagaje);
        }else {
            System.out.println("Avionul nu are bagaje");
        }
    }

    public Avion (String tip, String marca, int capacitatePasageri, int anFabricatie, String modelAvion) {
        this.tip = tip;
        this.marca = marca;
        this.capacitatePasageri = capacitatePasageri;
        this.anFabricatie = anFabricatie;
        this.modelAvion = modelAvion;
    }


}
