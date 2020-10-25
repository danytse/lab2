import ru.ifmo.se.pokemon.*;

public class Darumaka extends Pokemon
{
    public Darumaka (String name, int level)
    {
        super(name, level);
        setType(Type.FIRE);
        setStats(70, 90, 45, 15, 45, 50);
        setMove(new FireBlast(), new Headbutt(), new Swagger());
    }
}
