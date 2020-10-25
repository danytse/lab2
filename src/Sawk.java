import ru.ifmo.se.pokemon.*;

public class Sawk extends Pokemon
{
    public Sawk (String name, int level)
    {
        super(name,level);
        setStats(75, 125, 75, 30,75, 85);
        setType(Type.FIGHTING);
        setMove(new DoubleKick(), new FocusBlast(), new StoneEdge(), new Leer());
    }
}
