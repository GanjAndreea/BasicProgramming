package OOP.abstractizare.interfete;

public class Bucatar implements Gatit{

    @Override
    public void pregatesteMancare(String numeleMancarii) {
        System.out.println("Bucatarul pregateste " + numeleMancarii);
    }
}
