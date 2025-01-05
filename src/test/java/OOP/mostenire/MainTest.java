package OOP.mostenire;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {

    @BeforeClass
    public void init(){
        System.out.println("Initializare Main Test");
    }

    @Test
    public void mainTest (){
        //BaseTest baseTest = new BaseTest();
        baseTest();
        System.out.println("Executare Main Test");
    }


}
