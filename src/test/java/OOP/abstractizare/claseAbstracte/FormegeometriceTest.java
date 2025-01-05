package OOP.abstractizare.claseAbstracte;

import org.testng.annotations.Test;

public class FormegeometriceTest {

    @Test
    public void testFormeGeometrice() {
        Patrat patrat = new Patrat();
        patrat.infoFormaGeometrica();
        patrat.deseneaza();

        Triunghi triunghi = new Triunghi();
        triunghi.infoFormaGeometrica();
        triunghi.deseneaza();

        //Clasa abstracta nu se poate instantia
        // FormeGeometrice fg = new FormeGeometrice();
    }
}
