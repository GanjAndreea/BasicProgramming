package OOP;

import org.testng.annotations.Test;

public class OOPTest {

    @Test
    public void testMethod (){
        Student Laura = new Student("Popescu","Laura",20,"Psihologie",true,"Filozofie");
        Laura.infoStudent();

        Angajat Eduard = new Angajat("Ionescu","Eduard",22,"Arka","inginer",1);
        Eduard.infoAngajat();

        Eduard.mananca();
        Laura.mananca();

        Eduard.programLucru();
        Eduard.programLucru(6);
        Eduard.programLucru("remote");
        Eduard.programLucru(false);

        Laura.mergeLaCursuri();
        Eduard.isiDaDemisia();
        Laura.mergeLaPetreceri();
        Eduard.primesteSalariu();

        StudentAngajat Marius = new StudentAngajat("Popescu","Marius",20,"FacultateaVietii",false,"Contabilitate","KFC","somer",1);
        Marius.mergeLaPetreceri();
        Marius.primesteSalariu();
    }
}
