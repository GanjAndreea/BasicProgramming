package multimiSiStructuriRepetitive;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StructuriRepetitive {

    //Structurile repetitive sunt blocuri de cod care parcurg un anumit interval de valori
    //for, while, foreach
    // In Java un array (multime) este o structura de date care stocheaza o colectie de elemente de acelasi tip (primitive sau de
    // referinta)
    //Un array are o dimensiune fixa

    @Test
    public void afisareDate() {
        colegiDeCursArray();
        colegiDeCursLista();
        exempluHasmap1();
        exempluHasmap2();
    }

    public void colegiDeCursArray() {
        String[] colegi = new String[7];
        colegi[0] = "Senty";
        colegi[1] = "Edi";
        colegi[2] = "Gabriela";
        colegi[3] = "Ionut";
        colegi[4] = "Ramona";
        colegi[5] = "Mihai";
        colegi[6] = "Andreea";

        //for(initializare; conditie; increment){
        //in interior o sa se execute un bloc de cod in mod repetat
        // }

        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Numele colegului de la numarul " + index + " este " + colegi[index]);
        }
    }


    // Listele sunt o colectie ordonata de elemente ... pot adauga cate elemente doresc, pe cand in array nu
    //Fiecare element poate fi accesat printr-un index numeric
    //Elementele dintr-o lista sunt stocate in ordinea in care sunt adaugate
    //Ca implementare se foloseste ArrayList

    public void colegiDeCursLista() {
        List<String> colegiLista = new ArrayList<>();
        colegiLista.add("Senty");
        colegiLista.add("Edi");
        colegiLista.add("Gabriela");
        colegiLista.add("Ionut");
        colegiLista.add("Ramona");
        colegiLista.add("Mihai");
        colegiLista.add("Andreea");
        colegiLista.add("Fabian");

        //while este o structura de control utilizata pentru a executa in mod reptat un bloc de cod atata timp cat o conditie
        //este adevarata
        //index
        //while(conditia){
        //bloc de cod care se executa repetat daca conditia este adevarata
        //index++
        // }

        int index = 0;
        while (index < colegiLista.size()) {
            System.out.println("Numele colegului este " + colegiLista.get(index));
            index++;
        }
    }
    //Hasmap este o implementare a unei colectii de tip pereche cheie-valoare
    //Fiecare element din hasmap este o pereche formata dintr-o cheie si o valoare asociata cu acea cheie
    //Cheile in hasmap sunt unice, nu pot fi duplicate

    public void exempluHasmap1() {
        HashMap<String, String> categoriiLucruri = new HashMap<>();
        categoriiLucruri.put("Flori" , "Trandafir");
        categoriiLucruri.put("Fructe" , "Para");
        categoriiLucruri.put("Legume" , "Cartof");
        categoriiLucruri.put("Condimente" , "Sare");

        //foreach este o structura alternativa mai avansata a unui for
        //se poate utiliza sa iteram printr-o colectie fara a fi nevoie sa e utilizeze un index
        //foreach(tipul de element/String numele: colectia){
        //bloc de cod care se executa repetat pentru fiecare element din colectie
        // }

        for (String key : categoriiLucruri.keySet()){
            System.out.println("Categoria este " + key + " obiectul din categorie este " + categoriiLucruri.get(key) );
        }
    }

    public void exempluHasmap2(){
        HashMap<String ,List<String>> tariSiOrase = new HashMap<>();
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj");
        oraseRomania.add("Timisoara");
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Brasov");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Sevilla");
        oraseSpania.add("Madrid");
        oraseSpania.add("Girona");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Torino");
        oraseItalia.add("Venetia");
        oraseItalia.add("Genova");

        List<String> oraseGermania = new ArrayList<>();
        oraseGermania.add("Stuttgart");
        oraseGermania.add("Berlin");
        oraseGermania.add("Koln");
        oraseGermania.add("Dusseldorf");

        tariSiOrase.put("Romania" , oraseRomania);
        tariSiOrase.put("Spania" , oraseSpania);
        tariSiOrase.put("Italia" , oraseItalia);
        tariSiOrase.put("Germania" , oraseGermania);

        for (String key : tariSiOrase.keySet()){
            System.out.println("Orasele din tara " + key + " sunt " + tariSiOrase.get(key));
        }

    }

    //Tema de facut ce am facut miercuri dar cu masini din tari diferite
    //de tip Hasmap si string
    //4 perechi in hasmap
    // dintr- o lista de stringuri cautam un string dorit
    // trebuie facuta o lista de string
    //variabile de string
    //parcurgeti lista cu un for sau while
    //cand ajungem la cuvantul dorit il printam in consola si folosim if

}
