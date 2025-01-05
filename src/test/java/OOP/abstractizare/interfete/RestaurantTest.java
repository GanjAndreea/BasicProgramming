package OOP.abstractizare.interfete;

import org.testng.annotations.Test;

public class RestaurantTest {

    @Test
    public void actiivitatiRestaurant(){
        Bucatar Marius = new Bucatar();
        Marius.pregatesteMancare("Sarmale");

        Chelner Ionut = new Chelner();
        Ionut.servesteMancare(3,"Sarmale");
        Ionut.curataMasa(7);
    }
}
