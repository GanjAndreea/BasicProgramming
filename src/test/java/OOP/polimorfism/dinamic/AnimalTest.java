package OOP.polimorfism.dinamic;

import org.testng.annotations.Test;

public class AnimalTest {

    @Test
    public void suneteAnimal(){
        Caine Pluto = new Caine();
        Pluto.scoateSunet();

        Pisica Titi = new Pisica();
        Titi.scoateSunet();

        Animal animal = new Animal();
        animal.scoateSunet();
    }
}
