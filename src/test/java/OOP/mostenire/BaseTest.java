package OOP.mostenire;

import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setUp(){
        System.out.println("setUp din clasa base Test");
    }

    public void baseTest(){
        System.out.println("Executare base Test");
    }
}
