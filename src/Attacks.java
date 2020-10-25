import ru.ifmo.se.pokemon.*;

class DoubleKick extends PhysicalMove
{
    protected DoubleKick()
    {
        super(Type.FIGHTING, 30, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage)
    {
        def.setMod(Stat.HP, (int)Math.round(damage)*2);
    }
}

class FocusBlast extends SpecialMove
{
    protected FocusBlast()
    {
        super(Type.FIGHTING, 120, 70);
    }
    @Override
    protected void applyOppEffects(Pokemon p)
    {
        if (Math.random() <= 0.1) {p.setMod(Stat.DEFENSE, -1);}
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage)
    {
        def.setMod(Stat.HP, (int)Math.round(damage)*2);
    }
}

class StoneEdge extends PhysicalMove
{
    protected StoneEdge()
    {
        super(Type.ROCK, 100, 80);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage)
    {
        def.setMod(Stat.HP, (int)Math.round(damage)*2);
    }
}

class Leer extends StatusMove
{
    protected Leer()
    {
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p)
    {
        p.setMod(Stat.DEFENSE, -1);
    }
}

class FireBlast extends SpecialMove
{
    protected FireBlast()
    {
        super(Type.FIRE, 110, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p)
    {
        if (Math.random() <=0.1) {Effect.burn(p);}
    }
}

class Headbutt extends PhysicalMove
{
    protected Headbutt()
    {
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p)
    {
        if (Math.random() <= 0.3) {Effect.flinch(p);}
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage)
    {
        def.setMod(Stat.HP, (int)Math.round(damage)*2);
    }
}

class Swagger extends StatusMove
{
    protected Swagger()
    {
        super(Type.NORMAL, 0, 85);
    }
    @Override
    protected void applyOppEffects(Pokemon p)
    {
        p.setMod(Stat.ATTACK, 2);
        Effect.confuse(p);
    }
}

class SwordsDance extends StatusMove
{
    protected SwordsDance()
    {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p)
    {
        p.setMod(Stat.ATTACK, 2);
    }
}

class Confide extends StatusMove
{
    protected Confide()
    {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon p)
    {
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
}

class Absorb extends SpecialMove
{
    protected Absorb()
    {
        super(Type.GRASS, 20, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p)
    {
        p.setMod( Stat.HP, (int)((p.getStat(Stat.HP) - p.getHP())*0.5) );
    }
}

class DoubleTeam extends StatusMove
{
    protected DoubleTeam()
    {
        super(Type.NORMAL, 0, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p)
    {
        p.setMod(Stat.EVASION, 1);
    }
}