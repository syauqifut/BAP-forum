package Forum3;

public class Hewan
{
    public void suara()
    {
        System.out.println("Suara hewan");
    }
}

class Kucing extends Hewan
{
    @Override
    public void suara()
    {
        System.out.println("Meow");
    }
}

class Anjing extends Hewan
{
    @Override
    public void suara()
    {
        System.out.println("Guk guk");
    }
}

class Main
{
    public static void main(String[] args)
    {
        Hewan hewan = new Hewan();
        hewan.suara();

        Kucing kucing = new Kucing();
        kucing.suara();

        Anjing anjing = new Anjing();
        anjing.suara();
    }
}