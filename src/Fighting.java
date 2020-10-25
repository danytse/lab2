import ru.ifmo.se.pokemon.*;

public class Fighting
{
    public static void main(String[] args)
    {
        Battle field = new Battle();
        field.addAlly(new Sawk("Mongol", 5));
        field.addAlly(new Darmanitan("Ruslan", 1));
        field.addAlly(new Darumaka("Gitelman", 4));
        field.addFoe(new Oddish("Oleg", 2));
        field.addFoe(new Bellossom("Batya", 6));
        field.addFoe(new Gloom("Vanomas", 2));
        field.go();

    }
}
