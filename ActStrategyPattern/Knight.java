package ActStrategyPattern;

public class Knight implements DefenseStrategy, AttackStrategy{

    @Override
    public String createMagic() {
       String output = new String();
       output += "Creating a magic barrier for defense!";
        return output;
    }

    @Override
    public String dodge() {
        String output = new String();
        output += "Dodgin to avoid attack!";
        return output;
    }

    @Override
    public String shield() {
        String output = new String();
        output += "Using a shield to defend!";
        return output;
    }

    @Override
    public String castSpell() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String shootArrow() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String swingSword() {
        String output = new String();
        output += "Knight attacks with a sword!";
        return output;
    }
    
}
