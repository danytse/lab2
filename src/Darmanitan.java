import ru.ifmo.se.pokemon.*;

public class Darmanitan extends Darumaka
{
    public Darmanitan (String name, int level)
    {
        super(name, level);
        setType(Type.FIRE);
        setStats(105, 140, 55, 30, 55, 95);
        setMove(new FireBlast(), new Headbutt(), new Swagger(), new StoneEdge());
    }
}
