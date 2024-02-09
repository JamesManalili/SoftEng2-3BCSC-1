package ActStrategyPattern;

public class Archer implements DefenseStrategy, AttackStrategy{

    @Override
    public String createMagic() {
        return null;
    }

    @Override
    public String dodge() {
        return null;
    }

    @Override
    public String shield() {
        String output = new String();
        output += "Using a shield to defend!";
        return output;
    }

    @Override
    public String castSpell() {
        return null;
    }

    @Override
    public String shootArrow() {
        String output = new String();
        output += "Archer shoots an arrow!";
        return output;
    }

    @Override
    public String swingSword() {
        return null;
    }
    
}
